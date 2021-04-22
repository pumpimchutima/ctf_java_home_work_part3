

public class Programmer extends Employee{

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}
	public Programmer(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput,0);
		// TODO Auto-generated constructor stub
	}
	
	public void createWebsite(String template,String titleName) {
		System.out.println("Template is "+template+" and  Title is "+titleName);
	}

	public void installWindows(String version,String productKey) {
		System.out.println("Version is "+version+" and product key is "+productKey);
	}
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer("Chutima","L", 100);
		System.out.println(programmer.getSalary());
		
		
		Programmer programmer0 = new Programmer("Chutima0","L0");
		System.out.println(programmer0.getSalary());
	}
}
