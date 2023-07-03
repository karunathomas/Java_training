package polymorphismRev;

public class PolyChild extends Poly1{
	void print() {
		super.print();
		System.out.println("Printing in child class");
	}

	public static void main(String[] args) {
		//Poly1 obj1= new Poly1();
		Poly1 obj= new PolyChild();
		obj.print();
		//obj1.print();
	}

}
