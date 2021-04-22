

public class Day10 {
	public static void main(String[] args) {
		Employee pim = new Employee("Pum","Pim",500);
		System.out.println(pim.getSalary());
		pim.hello();
		
		CEO ceo = new CEO("CEO","Last CEO", 1000);
		System.out.println(ceo.getSalary());
		ceo.hello();
		ceo.fire(pim);
	}
}
