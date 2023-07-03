package javaReview;

public class StringNewLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s2="World";
		String s3="";
		String s4="HELLO";
		String s1=new String("Welcome");
		System.out.println(s+"\n"+s1+"\n"+s2);
		System.out.println("Length of s is:"+s.length());
		System.out.println(s.equals(s2));
		System.out.println(s.charAt(4));
		System.out.println("String s3 is empty:"+s3.isEmpty());
		System.out.println("S and s4 is equal or not:"+s.equalsIgnoreCase(s4));
	}
}
