import java.util.*;


class WrongAge extends Exception{
    public WrongAge(String error_message){
        super(error_message);
    }
}


class Father{
    int f_age;
    public Father(int f_age) throws WrongAge{
        if (f_age < 0)
            throw new WrongAge("Age can't be negative");
        this.f_age=f_age;
        System.out.println("Father's age = " + f_age);
    }
}


class Son extends Father {
    int s_age;
    public Son(int f_age, int s_age) throws WrongAge {
        super(f_age);  
        if (s_age < 0) {
            throw new WrongAge("Age can't be negative");
        }
        if (s_age>=f_age) {
            throw new WrongAge("Son's age can't be greater than or equal to Father's age");
        }
        this.s_age = s_age;
        System.out.println("Son's age: " + s_age);
    }
}

public class Age {
    public static void main(String[] args) {
        System.out.println("USN: 1BM23CS003 \nName: Aaron B Ajay");
	int f_age, s_age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter father's age: ");
	f_age=sc.nextInt();
	System.out.println("Enter son's age: ");
	s_age=sc.nextInt();

	try {
            Son son=new Son(f_age,s_age);
        }
	catch (WrongAge err) {
            System.out.println("Exception: " + err.getMessage());
        }
    }
}