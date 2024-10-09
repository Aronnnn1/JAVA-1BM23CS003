import java.util.*;

class Quad{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
double r1,r2,d_sq;

void input(){
System.out.println("Enter coefficients a,b,c:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
}

void calc(){
 d=b*b-4*a*c;
if (d==0){
r1=-b/(2.0*a);
System.out.println("Roots are real and equal");
System.out.println("Root 1 = "+r1+"\nRoot 2 = "+r1);
}
else if(d>0){
d_sq=Math.sqrt(d);
r1=(-b+d_sq)/(2.0*a);
r2=(-b-d_sq)/(2.0*a);
System.out.println("Roots are real and distinct");
System.out.println("Root 1 = "+r1+"\nRoot 2 = "+r2);
}
else{
d_sq=Math.sqrt(-d);
r1=-b/(2.0*a);
r2=d_sq/(2.0*a);
System.out.println("Roots are imaginary");
System.out.println("Root 1 = "+r1+" + "+r2+"i"+"\nRoot 2 = "+r1+" - "+r2+"i");
}
}
}

class Quadratic{
public static void main(String[] args){
System.out.println("USN: 1BM23CS003");
System.out.println("Name: Aaron B Ajay");
Quad quad=new Quad();
quad.input();
quad.calc();
}
}