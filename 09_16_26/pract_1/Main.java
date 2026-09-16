

/*
SPEC — build these classes to make Main run correctly:

Class - Person (NORMAL, concrete class):
  - private String name
  - private int age
  - public Person(String name, int age)
  - public String getName()
  - public int getAge()
  - public String toString() -> returns "Name: {name}, Age: {age}"

Class - Employee (ABSTRACT, extends Person):
  - private String id
  - public Employee(String name, int age, String id)
      -> calls super(name, age), then sets id
  - public String getId()
  - public abstract double calculateSalary();
  - public String toString() -> returns "ID: {id}, " + super.toString()

Class - Manager (extends Employee):
  - private double baseSalary
  - private double bonus
  - public Manager(String name, int age, String id, double baseSalary, double bonus)
      -> calls super(name, age, id), then sets baseSalary and bonus
  - calculateSalary() -> returns baseSalary + bonus
  - toString() -> returns "Manager | " + super.toString() + ", Salary: " + calculateSalary()

Class - Intern (extends Employee):
  - public Intern(String name, int age, String id)
      -> calls super(name, age, id) — baseSalary is FIXED at 5000, no bonus
  - calculateSalary() -> always returns 5000
  - toString() -> returns "Intern | " + super.toString() + ", Salary: " + calculateSalary()
*/

public class Main {

    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Ana", 32, "M100", 30000, 5000),
            new Intern("Ben", 21, "I200")
        };

        for (Employee e : staff) {
            System.out.println(e);
        }

        // extra checks — should NOT compile if uncommented, since Employee is abstract:
        // Employee bad = new Employee("Test", 1, "X1");

        // instanceof + polymorphism check
        for (Employee e : staff) {
            if (e instanceof Manager) {
                System.out.println(e.getName() + " is a Manager with bonus consideration.");
            } else {
                System.out.println(e.getName() + " is not a Manager.");
            }
        }
    }
}