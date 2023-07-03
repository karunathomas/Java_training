package instanceMethodAndConstructor;
public class Student {
int a, b,c,t;
	public static void main(String[] args) {
Student s1=new Student(55,60,70);
Student s2=new Student(68,82,92);
System.out.println("Total marks of 1st student"+" "+s1.total());
System.out.println("Total marks of 2nd student"+" "+s2.total());
System.out.println("Percentage of 1st student"+" "+s1.percentage());
System.out.println("Percentage of 2nd student"+" "+s2.percentage());}
Student(int a, int b, int c){
	this.a=a;
	this.b=b;
	this.c=c;}
public int total(){
	t=a+b+c;
	return(t);}
public double percentage() {
	double p=t/3;
	if(p>=80) {
		System.out.println("A grade");}
	else if(p>=60 && p<80) {
		System.out.println("B grade");}
	else if(p>=40 && p<60) {
		System.out.println("C grade");}
	else {
		System.out.println("D");}
	return (p);}}
