
package Fundamentals;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Employee e = new Employee("Bryan", "Lincuna", "Computer Science", "Pluto", "Male", 22);
        Employee e1 = new Employee("Lebron", "James", "Proffesional Basketball player");
        Employee e2 = new Employee();
        
        System.out.println("e2.firstname");
        
        Person p = new Person();
        Toddler t = new Toddler("Jerald", "unisex", 34);
        Kid k = new Kid("Melanie", "Female", 22);
        
        p.name = "Miguel Capule";
        p.sex = "unidentify";
        p.age = 50;
        
        t.name = "zoro";
        t.sex = "Male";
        t.age = 99;
        
        p.checkStatus();
        t.checkStatus();
        
        p.drink();
        t.drink();
        
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.makeSound();
        c.makeSound();
        
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
        
        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();
        
        we.dialog();
        se.dialog();
        
        we.showStats();
        se.showStats();
        
    }
    
}
