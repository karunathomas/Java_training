package thisSuper;
public class Factorial {
	 static int fact=0;
	public static void main(String[] args){
        fact=factCal(5);
        //System.out.println("fact="+fact);
        Factorial obj=new Factorial();
        obj.display();
	}
	static int factCal(int a)
	{
	    int fact=1;
	    for(int i=1;i<=a;i++)
	    {
	    	fact=fact*i;
	    }
	    return fact;
	}
	void display() {
		 System.out.println("factorial="+fact);
	}
}
