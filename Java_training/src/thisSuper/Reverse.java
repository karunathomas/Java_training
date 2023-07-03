package thisSuper;
public class Reverse{
static int a, rem, r=0;
	public static void main(String[] args) {
			Reverse obj1=new Reverse(321);
			while(a!=0){
				rem=a%10;
				r=r*10+rem;
				a=a/10;
			}
			Reverse obj2=new Reverse();
			obj1.display();
	}
	Reverse(){
		System.out.println("Finding Reverse...");
	}
	Reverse(int a){
		this.a=a;	
	}
	void display() {
		System.out.println("Reverse:"+r);
	}
}
