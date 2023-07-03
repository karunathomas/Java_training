package javaReview;

public class MethodOverload {
static int s, avg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum(1,2,3);
	}
	public static void sum(int a, int b, int c) {	
		s=a+b+c;
		//int average=sum();//method calling inside another method by assigning the method to a variable
		//avg=sum();//will also work
		System.out.println("Sum:"+s);
		//System.out.println("Average:"+average);
		sum();
		System.out.println("Average:"+avg);
	}
	/*public static int sum() {
		avg=s/3;
		return avg;
	}*/
	public static void sum(){
		avg=s/3;
	}
}
