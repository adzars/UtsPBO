package hewan;

public class CustomAnimal extends Animal { 
 private String type;   
 private String sound;  

 public CustomAnimal(String type, String name, int age, String sound) {
     super(name, age);
     this.type = type;
     this.sound = sound;
 }

 public String getType() { return type; }

 @Override
 public void makeSound() {
     System.out.println(getName() + " (" + type + ") berkata: " + sound);
 }
}

