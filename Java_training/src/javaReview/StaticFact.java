package javaReview;
import java.util.Scanner;
public class StaticFact {
static int a, f=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		fac(a);
		display();
	}
public static int fac(int a) {
	for(int i=1; i<=a;i++) {
		f=f*i;
	}
	return f;
}
static void display() {
	System.out.println("Factorial of "+a+" "+"is"+" "+f);
}
}
