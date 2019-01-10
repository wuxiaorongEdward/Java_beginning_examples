class Animal {
	private String name;
	private int age;
	
	Animal () {
		System.out.println("This is super class");
	}
	Animal (String name, int age) {
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
	
	public void eat() {
		System.out.println("Animal can eat food");
	}
}

class Dog extends Animal {
	Dog () {
		System.out.println("This is a subclass");
	}
	Dog(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("dog liks eating meat");
	}
}

class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setName("cat");
		animal.setAge(2);
		System.out.println(animal.getName() + "-------" + animal.getAge());
		animal.eat();
		
		Animal animal2 = new Animal("tiger", 5);
		System.out.println(animal2.getName() + "-------" + animal2.getAge());

		Dog dog = new Dog();
	    dog.setName("dog");
	    dog.setAge(3);
		System.out.println(dog.getName() + "-------" + dog.getAge());
		dog.eat();
		
		Dog dog1 = new Dog("dog4", 6);
		System.out.println(dog1.getName() + "-------" + dog1.getAge());
		
	}
}