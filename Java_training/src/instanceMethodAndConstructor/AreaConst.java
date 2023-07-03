package instanceMethodAndConstructor;
public class AreaConst {
	double a;
	int l, b;
	public double circle(){
		double c= Math.PI * a * a;
		return (c);}
	public int square(){
		int s=l*l;
		return (s);}
	public int rectangle(){
		int rect=l*b;
		return (rect);}
	public static void main(String[] args) {
		AreaConst obj=new AreaConst(5.2);	
		AreaConst obj1=new AreaConst(7);
		AreaConst obj2=new AreaConst(2,3);
		System.out.println("Area of Circle:"+obj.circle());
		System.out.println("Area of Square:"+obj1.square());
		System.out.println("Area of rectangle:"+obj2.rectangle());}
	AreaConst(double a){
		this.a=a;}
	AreaConst(int l){
		this.l=l;}
	AreaConst(int l, int b){
		this.l=l;
		this.b=b;}
	
}
