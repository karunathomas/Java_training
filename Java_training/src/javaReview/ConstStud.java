package javaReview;

public class ConstStud {
int id;
String name;
static String college="Obsqura";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstStud s1=new ConstStud (101,"Karuna");
		ConstStud s2=new ConstStud(103,"Kripa");
		System.out.println(college);
	}
	ConstStud(int roll, String names){
		id=roll;
		name=names;
		System.out.println("Roll NO:"+" "+roll+" "+"Name:"+" "+names+" "+college);
}
	ConstStud(){
		System.out.println("This is default");
	}
}
