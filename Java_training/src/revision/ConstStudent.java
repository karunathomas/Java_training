package revision;

class ConstStudent{
int rollno;
String name, college;

public static void main (String args[]){
ConstStudent s1=new ConstStudent(101,"Karuna", "Obsqura");
ConstStudent s2=new ConstStudent(102,"Kripa", "Obsqura");
ConstStudent s3=new ConstStudent(103,"Joemon", "Obsqura");
s1.display();
s2.display();
s3.display();
}
ConstStudent(int roll, String names, String coll){
rollno=roll;
name=names;
college=coll;
}
void display(){
	System.out.println("Roll NO:"+" "+rollno+" "+"Name:"+" "+name+" "+"College Name:"+" "+college);
}
}