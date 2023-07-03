package instanceMethodAndConstructor;

public class AverageNum {
	public int average(int a, int b, int c){
		int avg=(a+b+c)/3;
		System.out.println("Average of 3 number is:" +avg);
		return(avg);	
}
public double average(double a, double b, double c){
		double av=(a+b+c)/3;
		System.out.println("Average of 3 number is:" +av);
		return(av);
}
	public static void main(String[] args) {
		AverageNum obj=new AverageNum();
		obj.average(1, 2, 3);
		obj.average(1.2, 3.7, 1.5);

	}

}
