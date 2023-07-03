package javaReview;

public class Reverse {
		public static void main(String args[]){
			int num=352, rem;
					//int rev=0;
			while(num!=0){
				/*rem=num%10;
				rev=rev*10+rem;
				num=num/10;*/
				rem=num%10;
				System.out.print(rem);
				num=num/10;
				
			}
			//System.out.println("reverse:"+rev);
		}
		
}
