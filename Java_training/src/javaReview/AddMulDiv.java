package javaReview;

public class AddMulDiv {
static int a=5,b=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mul();
sum();
div();
	}
	public static void mul() {
		int mul=a*b;
		System.out.println("Result of Multiplication:"+mul);
	}
	public static void sum() {
		int sum=a+b;
		System.out.println("Result of addition:"+sum);
	}
	public static void div() {
		int div=a/b;
		System.out.println("Result of division:"+div);
	}
}
