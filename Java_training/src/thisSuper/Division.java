package thisSuper;

public class Division extends Addition{
	int d;
	public int div(int s) {
		d=s/10;
		return d;
	}
	void display() {
		int s=super.calc(a,b);
		System.out.println("Sum:"+s);	
		System.out.println("Division:"+div(s));
	}

}
