public class ClassObject {
public static void main(String[] args) {
Computer myComputer = new Computer("Dell", "Intel i5", 16, 512);
myComputer.turnOn();
myComputer.runProgram("Eclipse IDE");
System.out.println(myComputer);

Animal myDog = new Animal("Dog", 5, 12.5);
myDog.eat();
myDog.makeSound();
System.out.println(myDog);

Person person = new Person("John", 25, "Male");
person.speak();
person.work();
System.out.println(person);

Bird parrot = new Bird("Parrot", 0.5);
parrot.fly();
parrot.chirp();
System.out.println(parrot);
}
}

class Computer {
String brand;
String processor;
int RAM;
int storage;

public Computer(String brand, String processor, int RAM, int storage) {
this.brand = brand;
this.processor = processor;
this.RAM = RAM;
this.storage = storage;
}

public void turnOn() {
System.out.println(brand + " computer is turning on...");
}

public void runProgram(String programName) {
System.out.println("Running " + programName + " on " + brand + " computer.");
}

@Override
public String toString() {
return "Computer [Brand=" + brand + ", Processor=" + processor + ", RAM=" + RAM + "GB, Storage=" + storage + "GB]";
}
}

class Animal {
String species;
int age;
double weight;

public Animal(String species, int age, double weight) {
this.species = species;
this.age = age;
this.weight = weight;
}

public void eat() {
System.out.println(species + " is eating.");
}

public void makeSound() {
System.out.println(species + " is making a sound.");
}

@Override
public String toString() {
return "Animal [Species=" + species + ", Age=" + age + ", Weight=" + weight + "kg]";
}
}

class Person {
String name;
int age;
String gender;

public Person(String name, int age, String gender) {
this.name = name;
this.age = age;
this.gender = gender;
}

public void speak() {
System.out.println(name + " is speaking.");
}

public void work() {
System.out.println(name + " is working.");
}

@Override
public String toString() {
return "Person [Name=" + name + ", Age=" + age + ", Gender=" + gender + "]";
}
}

class Bird {
String species;
double wingspan;

public Bird(String species, double wingspan) {
this.species = species;
this.wingspan = wingspan;
}

public void fly() {
System.out.println(species + " is flying.");
}

public void chirp() {
System.out.println(species + " is chirping.");
}

@Override
public String toString() {
return "Bird [Species=" + species + ", Wingspan=" + wingspan + " meters]";
}
}



