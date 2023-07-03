package javaReview;

public class VarInstStatLocal {
	int id=102;//instance
	static String college="Obsqura";//static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;//local variable
		VarInstStatLocal b=new VarInstStatLocal();
		b.details();
		System.out.println(college);
		System.out.println(i);

	}
void details() {
	System.out.println(id);
}
}
