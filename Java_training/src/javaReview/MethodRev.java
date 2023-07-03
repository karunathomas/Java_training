package javaReview;

public class MethodRev {
 static int s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2);
		display();
	
	}
	public static int sum(int a, int b) {
		s=a+b;
		return s;
	}
	public static void display() {
		System.out.println("Sum:"+" "+s);
	}
}
