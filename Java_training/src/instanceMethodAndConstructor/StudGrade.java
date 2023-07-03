package instanceMethodAndConstructor;
public class StudGrade {
 int a,b,c, t;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudGrade s1=new StudGrade(45,55,65,"Karuna");
		s1.display();
		StudGrade s2=new StudGrade(50,60,48,"Kripa");
		s2.display();
		System.out.println("Total marks"+" "+s1.total());
		//System.out.println("Total marks" +s2.total());
		System.out.println("precentage"+" "+s1.percentage());
		//s2.percentage(t);
	}
	StudGrade(int a, int b, int c, String name){
		this.a=a;
		this.b=b;
		this.c=c;
		this.name=name;
}
	public int total() {
		t=a+b+c;
		return(t);
	}
	void display() {
		System.out.println("Marks obtained by"+" "+name+" "+a+" "+b+" "+c);
	}
	public double percentage() {
		double p=t/3;
		if(p>=80) {
			System.out.println("A grade");
		}
		else if(p>=60 && p<80) {
			System.out.println("B grade");
		}
		else if(p>=40 && p<60) {
			System.out.println("C grade");
		}
		else {
			System.out.println("D");
		}
		return (p);
	}
}
