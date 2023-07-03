package packagesWork;

public class TestEmpl {
	public static void main(String[] args) {
		HraCal obj=new HraCal();
		obj.details();
		obj.emplHra();
		obj.emplPf();
		System.out.println("------------------------------------------");
		System.out.println("Basic Pay:"+obj.a+" "+"Deduction:"+obj.b+" "+"Bonus:"+obj.c);
		System.out.println("HRA:"+obj.h);
		System.out.println("PF:"+obj.p);
			double t=obj.a+obj.h-obj.p-obj.b+obj.c;
			System.out.println("Total Salary in Hand"+t);
		}
		}

