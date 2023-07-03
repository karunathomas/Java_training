package revision;

public class Department {
		int id;
		String name;
		static String organization="ABC";
		static void change() {
			organization="CBA";
		}
		public static void main(String args[]){
			Department.change();
			Department s1 = new Department();
		s1.id=101;
		s1.name="Karuna";
		s1.display();
		}
		void display(){
			System.out.println(name+" "+id+" "+organization);
		}
		
		}
