package hewan;

public abstract class Animal { 
 private String name;
 private int age;

 // Constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

  public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public int getAge() { return age; }
 public void setAge(int age) { this.age = age; }

  public abstract void makeSound();

 
 public void eat() {
     System.out.println(name + " sedang makan.");
 }

 public void sleep() {
     System.out.println(name + " sedang tidur.");
 }

 public void showInfo() {
     System.out.println("Nama: " + name + ", Umur: " + age);
 }
}

