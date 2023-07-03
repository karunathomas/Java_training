package javaReview;

public class AddMulSub {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum(4,5);
mul(5,6);
subt(9,5);
div(6,2);
	}
public static void sum(int a, int b) {
	int s=a+b;
	System.out.println("Sum:"+s);
}
public static void mul(int a, int b) {
	int m=a*b;
	System.out.println("Result:"+m);
}
public static void subt(int a, int b) {
	int sub=a-b;
	System.out.println("Result:"+sub);
}
public static void div(int a, int b) {
	int d=a/b;
	System.out.println("Result:"+d);
}
}

