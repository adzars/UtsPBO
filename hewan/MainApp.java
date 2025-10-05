package hewan;


import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     ArrayList<Animal> animals = new ArrayList<>(); 
     int choice;

     do {
         System.out.println("\n=== APLIKASI MANAJEMEN HEWAN PELIHARAAN ===");
         System.out.println("1. Tambah Hewan Bawaan");
         System.out.println("2. Tambah Jenis Hewan Baru (Custom)");
         System.out.println("3. Lihat Daftar Hewan");
         System.out.println("4. Interaksi dengan Hewan");
         System.out.println("0. Keluar");
         System.out.print("Pilih menu: ");
         choice = input.nextInt();
         input.nextLine();

         switch (choice) {
             case 1:
                 System.out.println("Pilih jenis hewan bawaan (1.Kucing 2.Anjing 3.Burung): ");
                 int jenis = input.nextInt();
                 input.nextLine();
                 System.out.print("Masukkan nama: ");
                 String nama = input.nextLine();
                 System.out.print("Masukkan umur: ");
                 int umur = input.nextInt();
                 input.nextLine();

  
                 Animal a = null;
                 if (jenis == 1) a = new Cat(nama, umur);
                 else if (jenis == 2) a = new Dog(nama, umur);
                 else if (jenis == 3) a = new Bird(nama, umur);
                 else System.out.println("Jenis tidak valid!");

                 if (a != null) {
                     animals.add(a);
                     System.out.println("Hewan bawaan berhasil ditambahkan!");
                 }
                 break;

             case 2:
                 System.out.print("Masukkan jenis hewan baru: ");
                 String type = input.nextLine();
                 System.out.print("Masukkan nama: ");
                 String name = input.nextLine();
                 System.out.print("Masukkan umur: ");
                 int age = input.nextInt();
                 input.nextLine();
                 System.out.print("Masukkan suara hewan: ");
                 String sound = input.nextLine();

                 // INHERITANCE + POLYMORPHISM: objek CustomAnimal juga dianggap sebagai Animal
                 Animal custom = new CustomAnimal(type, name, age, sound);
                 animals.add(custom);
                 System.out.println("Hewan baru berhasil ditambahkan!");
                 break;

             case 3:
                 System.out.println("=== DAFTAR HEWAN ===");
                 if (animals.isEmpty()) {
                     System.out.println("Belum ada hewan yang ditambahkan.");
                 } else {
                     for (int i = 0; i < animals.size(); i++) {
                         System.out.print((i + 1) + ". ");
                         animals.get(i).showInfo();
                     }
                 }
                 break;

             case 4:
                 if (animals.isEmpty()) {
                     System.out.println("Belum ada hewan untuk diinteraksikan.");
                     break;
                 }
                 System.out.println("Pilih hewan untuk interaksi: ");
                 for (int i = 0; i < animals.size(); i++) {
                     System.out.println((i + 1) + ". " + animals.get(i).getName());
                 }
                 int idx = input.nextInt() - 1;
                 if (idx >= 0 && idx < animals.size()) {
                     Animal selected = animals.get(idx);
                     System.out.println("1. Makan\n2. Tidur\n3. Bersuara");
                     int aksi = input.nextInt();
                     switch (aksi) {
                         case 1: selected.eat(); break;
                         case 2: selected.sleep(); break;
                         case 3: selected.makeSound(); break;
                         default: System.out.println("Aksi tidak valid!");
                     }
                 } else {
                     System.out.println("Pilihan tidak ada.");
                 }
                 break;

             case 0:
                 System.out.println("Keluar dari program...");
                 break;

             default:
                 System.out.println("Pilihan tidak valid!");
         }

     } while (choice != 0);
 }
}
