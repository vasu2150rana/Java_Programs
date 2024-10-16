public class AnimalFunction {    
public static void main(String[] args) {        
Animal myDog = new Animal("Dog", 5, 12.5);        
myDog.eat();       
myDog.makeSound();       
System.out.println(myDog);
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
