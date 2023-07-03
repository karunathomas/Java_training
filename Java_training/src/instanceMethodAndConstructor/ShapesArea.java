package instanceMethodAndConstructor;

public class ShapesArea {
	public double areaCal(double a){
		double c= Math.PI * a * a;
		return (c);
	}
	public int areaCal(int l){
		int s=l*l;
		return (s);
	}
	public int areaCal(int l, int b){
		int rect=l*b;
		return (rect);
	}
	public static void main(String[] args) {
		ShapesArea obj=new ShapesArea();
		System.out.println("Area of square:" +obj.areaCal(4));
		System.out.println("Area of rectangle:" +obj.areaCal(2,3));
		System.out.println("Area of circle:" +obj.areaCal(4.5));
	}
}
