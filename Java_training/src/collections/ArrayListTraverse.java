package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListTraverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> color=new ArrayList<String>();
color.add("Black");
color.add("Red");
color.add("Blue");
color.add("White");
	Iterator itr=color.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next()+ " ");
	}
	}
}
