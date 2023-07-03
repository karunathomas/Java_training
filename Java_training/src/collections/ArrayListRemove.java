package collections;
import java.util.ArrayList;
public class ArrayListRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> color=new ArrayList<String>();
color.add("Black");
color.add("Red");
color.add("Blue");
color.add("White");
color.remove(3);
for (String i:color) {
	System.out.println(i);
}
}
}