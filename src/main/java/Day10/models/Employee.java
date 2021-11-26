package Day10.models;

public class Employee {
	
	private int id;
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("parameterized constr with 1 param invoked");
	}
	
	public Employee(int id, String name) {
		super();
		this.id=id;
		this.name = name;
		System.out.println("parameterized constr with 2 param invoked");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default constr invoked");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
