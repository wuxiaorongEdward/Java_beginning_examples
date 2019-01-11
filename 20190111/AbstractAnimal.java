abstract class Animal {
	private String name;
	private int age;
	
	Animal () {}
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public void run() {
		System.out.println("Running !");
	}
	
	public abstract void eat();
}

class Dog extends Animal {
	Dog() {}
	Dog(String name, int age) {
		super(name, age);
	}
    public void eat() {
		System.out.println("Dog eats bones");
	}	
}

class Cat extends Animal {
	Cat() {}
	Cat(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("cat eats fishes");
	}
}
class AbstractAnimal {
	public static void main(String[] args) {
        Animal dog = new Dog("little dog", 3);
        System.out.println(dog.getName() + "--------" + dog.getAge());

        Animal dog1 = new Dog();
        dog1.setName("little dog1");
        dog1.setAge(2);
		System.out.println(dog1.getName() + "--------" + dog1.getAge());
		
		Animal cat0 = new Cat("little cat0", 2);
		System.out.println(cat0.getName() + "--------" + cat0.getAge());
		
		Animal cat1 = new Cat();
		cat1.setName("little cat1");
		cat1.setAge(1);
		System.out.println(cat1.getName() + "--------" + cat1.getAge());
		
	}
} 