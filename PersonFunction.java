public class PersonFunction {    
public static void main(String[] args) {        
Person person1 = new Person("John", 25, "Male");        
person1.speak();        
person1.work();        
System.out.println(person1);    
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
