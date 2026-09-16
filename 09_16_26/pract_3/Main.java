
/*
SPEC — build these to make Main run correctly:

Interface - Swimmer:
  - void swim();

Interface - Walker:
  - void walk();

Interface - AmphibiousMover extends Swimmer, Walker:
  (no new methods of its own — just combines both into one interface)

Class - Animal (ABSTRACT):
  - private String name
  - public Animal(String name)
  - public String getName()
  - public abstract String makeSound();
  - public String toString() -> returns "{name} says {makeSound()}"

Class - Frog (extends Animal, implements AmphibiousMover):
  - public Frog(String name) -> calls super(name)
  - makeSound() -> "Croak"
  - swim() -> prints "{name} swims across the pond"
  - walk() -> prints "{name} hops along the ground"

Class - Duck (extends Animal, implements Swimmer, Walker):
  -> implements BOTH interfaces separately, NOT via AmphibiousMover — contrast case
  - public Duck(String name) -> calls super(name)
  - makeSound() -> "Quack"
  - swim() -> prints "{name} paddles through the water"
  - walk() -> prints "{name} waddles on land"

Class - Shark (extends Animal, implements Swimmer):
  - public Shark(String name) -> calls super(name)
  - makeSound() -> "..."
  - swim() -> prints "{name} glides silently through the deep"

Class - Kangaroo (extends Animal, implements Walker):
  - public Kangaroo(String name) -> calls super(name)
  - makeSound() -> "Grunt"
  - walk() -> prints "{name} hops powerfully across the outback"

Class - ZooKeeper (a "manager" class — does NOT extend Animal):
  - public void inspect(Animal a)
      -> prints a.toString()
      -> if a is a Swimmer, call swim() on it
      -> if a is a Walker, call walk() on it
      (uses instanceof + cast INSIDE this method — not in Main)
*/

public class Main {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper();

        Animal[] pond = {
            new Frog("Freddy"),
            new Duck("Daffy"),
            new Shark("Bruce"),
            new Kangaroo("Roo")
        };

        for (Animal a : pond) {
            keeper.inspect(a);
            System.out.println("---");
        }
    }
}