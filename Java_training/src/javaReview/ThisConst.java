package javaReview;

public class ThisConst {

		int id;
		String name;
		static String college="Obsqura";
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ThisConst s1=new ThisConst (101,"Karuna");
				s1.display();
				//ThisConst s2=new ThisConst();
			}
			ThisConst(int id, String name){
				this();
				this.id=id;
				this.name=name;		
		}
			ThisConst(){
				System.out.println("This is a default constructor");
			}
			void display() {
				this.print();
				System.out.println("Roll NO:"+" "+id+" "+"Name:"+" "+name+" "+"College name:"+" "+college);
			}
			void print() {
				System.out.println("Print");
			}
		}
