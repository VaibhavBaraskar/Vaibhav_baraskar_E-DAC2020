public class DataOfEmployee{

	public static void main(String... args)
	{
	Employee e1=new Employee();
		e1.setempId(1);
		e1.setempName("Vaibhav");
	System.out.println("The entered data of = ");
		int id=e1.getId();
		String name=e1.getName();
		System.out.println("id = "+id);
		System.out.println("Name of Employee = "+name);
	}

}