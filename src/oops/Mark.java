package oops;

public class Mark {

	 int id;
	 String name;
	 
	 void display()
	 {
		 System.out.println(id);
		 System.out.println(name);
		 
	 }
	 public static void main(String[] args)
	 {
		 Mark m=new Mark();
		 m.id=10;
		 m.name="Surya";
		 m.display();
	 }
}
