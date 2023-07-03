package instanceMethodAndConstructor;
import java.util.Scanner;
public class Area {
	public double shapeArea(double a){
		double c= Math.PI * a * a;
		return (c);}
	public int shapeArea(int l){
		int s=l*l;
		return (s);}
	public int shapeArea(int l, int b){
		int rect=l*b;
		return (rect);}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape which area to be found");
		String type=sc.next();
		Area obj=new Area();
		if(type.contains("square")) {
			System.out.println("Area of square:" +obj.shapeArea(4));}
		else if(type.contains("rectangle")) {
			System.out.println("Area of rectangle:" +obj.shapeArea(2,3));}
		else {
			System.out.println("Area of circle:"+obj.shapeArea(2.5));}
	}

}
