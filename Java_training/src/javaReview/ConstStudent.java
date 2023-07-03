package javaReview;

	class ConstStudent{
		int rollno;
		String name;
		public static void main (String args[]){
		ConstStudent s1=new ConstStudent(101,"Karuna");
		ConstStudent s2=new ConstStudent(103,"Kripa");
		ConstStudent s3=new ConstStudent();// default constructor
		s1.display();
		s2.display();
		}
		ConstStudent(int roll, String names){
		rollno=roll;
		name=names;
		}
		ConstStudent(){
			System.out.println("This is Default Constructor");
		}
		void display(){
			System.out.println("Roll NO:"+" "+rollno+" "+"Name:"+" "+name);
		}
		}
