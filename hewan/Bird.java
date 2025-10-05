package hewan;


public class Bird extends Animal { // INHERITANCE dari Animal
 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " berkata: Tweet!");
 }
}
