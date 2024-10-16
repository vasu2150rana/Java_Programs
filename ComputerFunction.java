public class ComputerFunction {
public static void main(String[] args) {
Computer myComputer = new Computer("Dell", "Intel i5", 16, 512);
myComputer.turnOn();
myComputer.runProgram("Eclipse IDE");
System.out.println(myComputer);
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
