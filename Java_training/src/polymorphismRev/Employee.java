package polymorphismRev;

public class Employee {
int id;
String name;
Address address;
Employee(int id, String name, Address address){
	this.id=id;
	this.name=name;;
	this.address=address;
}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state);
}
public static void main(String args[]) {
	Address a=new Address("PTA","Kerala");
	Employee emp=new Employee(111,"Karuna",a);
	emp.display();
}
}
