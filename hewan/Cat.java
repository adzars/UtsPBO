
package hewan;

public class Cat extends Animal { // INHERITANCE: class Cat mewarisi class Animal
 public Cat(String name, int age) {
     super(name, age); // panggil constructor dari class induk (Animal)
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + " berkata: Meow!");
 }
}

