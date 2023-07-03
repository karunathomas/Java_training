package inheritanceEg;


public class TestHierarchial {

  public static void main(String args[])
  {
	  HierarchialChild1 Obj1 = new HierarchialChild1 ();
	  HierarchialChild2 Obj2 = new HierarchialChild2 ();
    System.out.println("Num * Num1 = " + Obj1.Num * Obj1.Num1);
    System.out.println("Num * Num2 = " + Obj2.Num * Obj2.Num2);
  }
}