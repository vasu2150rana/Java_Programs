public class BirdFunction {    
public static void main(String[] args) {        
Bird parrot = new Bird("Parrot", 0.5);        
parrot.fly();        
parrot.chirp();        
System.out.println(parrot);    
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
