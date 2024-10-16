import java.util.Scanner;
class Subject {
    int subjectMarks;
    int credits;
    int grade;

    void calculateGrade() {
        if (subjectMarks >= 90)
            grade = 10;
        else if (subjectMarks >= 80)
            grade = 9;
        else if (subjectMarks >= 70) 
            grade = 8;
        else if (subjectMarks >= 60) 
            grade = 7;
        else if (subjectMarks >= 50) 
            grade = 6;
        else if (subjectMarks >= 40) 
            grade = 5;
        else
            grade = 0;
    }
}

class Student {
    String usn;
    String name;
    double SGPA;
    Subject[] subjects = new Subject[8];
    Scanner sc = new Scanner(System.in);

    Student() {
        for (int i = 0; i < 8; i++) 
            subjects[i] = new Subject();  
    }

    void getStudentDetails() {
        System.out.print("Enter the USN: ");
        usn = sc.next();
        System.out.print("Enter the Name: ");
        name = sc.next();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjects[i].subjectMarks = sc.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subjects[i].credits = sc.nextInt();
            subjects[i].calculateGrade();
        }
    }

    void calcSGPA() {
        double score = 0;
        int total_credits = 0;

        for (int i = 0; i < 8; i++) {
            score += (subjects[i].grade * subjects[i].credits);
            total_credits += subjects[i].credits;
        }
        SGPA = score/total_credits;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + SGPA);
    }
}

public class StudDetails {
    public static void main(String[] args) {
	System.out.println("USN: 1BM23CS003");
	System.out.println("Name: Aaron B Ajay");
        Student[] students = new Student[3];

        for (int j = 0; j < 3; j++) {
            System.out.println("Enter the details for student " + (j + 1) + ":");
            students[j] = new Student();
            students[j].getStudentDetails();
            students[j].getMarks();
            students[j].calcSGPA();
        }

        for (int i=0; i<8; i++) {
            students[i].display();
        }
    }
}
