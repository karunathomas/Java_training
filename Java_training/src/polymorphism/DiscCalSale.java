package polymorphism;
import java.util.*;
public class DiscCalSale {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Season: OffSeason or OnSeason");
		String type=sc.next();
		System.out.println("Enter the cost");
		int cost=sc.nextInt();
		System.out.println("Cost is"+" "+cost);
		SeasonOn obj=new SeasonOn(cost);
		SeasonOff obj1=new SeasonOff(cost);
		if(type.contains("OffSeason")) {
			System.out.println( obj.discount());
		}
		else {
			System.out.println( obj1.discount());
		}
	}
}
