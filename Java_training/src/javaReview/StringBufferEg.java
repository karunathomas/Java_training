package javaReview;

public class StringBufferEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st=new StringBuffer("Hai Java");
		System.out.println(st.reverse());
		System.out.println(st.reverse());
		System.out.println(st.append(" "+"Welcome to Java"));
		System.out.println(st.replace(1,2, "Wor"));
		System.out.println(st.delete(1,4));
		System.out.println(st.insert(1,"a"));
		System.out.println("---------------------");
		StringBuilder str=new StringBuilder("Hello World");
		System.out.println("String Builder reverse:"+" "+str.reverse());
		System.out.println("String Builder reversed:"+" "+str.reverse());
		System.out.println(str.append(" "+"Welcome to Java"));
		System.out.println(str.replace(1,2, "Wor"));
		System.out.println(str.delete(1,4));
		System.out.println(str.insert(1,"e"));
	}

}
