abstract class Employee {
	private String name;
	private int age;
	private String employId;
	private int salary;
	
	public Employee() {}
	public Employee(String name, int age, String employId, int salary) {
		this.name = name;
		this.age = age;
		this.employId = employId;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setEmployId(String employId) {
		this.employId = employId;
	}
	public String getEmployId() {
		return employId;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public abstract void jobcontent();
}

class Manager extends Employee {
	private int bonus;
	Manager() {}
	Manager(String name, int age, String employId, int salary, int bonus) {
		super(name, age, employId, salary);
		this.bonus = bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	public void jobcontent() {
		System.out.println("Manager's task is to arrange employ's work");
	}
}

class Programmer extends Employee {
	Programmer() {}
	Programmer(String name, int age, String employId, int salary) {
		super(name, age, employId, salary);
	}
	
	public void jobcontent() {
		System.out.println("Programmer's task is to finish the arranged work");
	}
}
class EmployeeDemo {
	public static void main(String[] args) {
       	Employee programmer = new Programmer("coder", 21, "000017", 7500 );
        System.out.print(programmer.getName() + "----" + programmer.getAge() + "---------" +  programmer.getEmployId() + "-------");
        System.out.println(programmer.getSalary());

        Employee manager = new Manager("manager", 35, "000012", 2000, 10000);
	  	System.out.print(manager.getName() + "----" + manager.getAge() + "---------" +  manager.getEmployId() + "-------");
		Manager m = (Manager) manager;
        System.out.println(m.getSalary() + m.getBonus());	 
	}
}