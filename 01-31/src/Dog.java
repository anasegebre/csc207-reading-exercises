
public class Dog {
	public String name;
	public String breed;
	public int age;

	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public void bark() {
		System.out.println("BARK!\nName: " + name + "\nBreed: " + breed + "\nAge: " + age);
	}

	public static void main(String[] args) {
		Dog d = new Dog("Doggo", "Pomeranian", 2);
		d.bark();
	}

}