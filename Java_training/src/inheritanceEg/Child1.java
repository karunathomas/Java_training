package inheritanceEg;
public class Child1 extends Parent1{
	int d=a-b;
		//return d;

	public void display() {
		System.out.println("Difference:"+d);
		System.out.println("Sum:"+s);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj=new Child1();
		obj.display();
	}

}
