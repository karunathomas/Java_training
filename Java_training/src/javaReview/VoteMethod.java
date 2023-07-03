package javaReview;
import  java.util.Scanner;
public class VoteMethod {
static int a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		a=sc.nextInt();
		age();
	}
public static void age() {
	if(a<18) {
		System.out.println("Not eligible for voting");
	}
	else {
		System.out.println("Eligible for voting");
	}
}
}
