

/*
SPEC — build these to make Main run correctly:

Interface - Swimmer:
  - void swim();

Interface - Flyer:
  - void fly();

Interface - EggLayer:
  - void layEgg();

Class - Animal (ABSTRACT):
  - private String name
  - public Animal(String name)
  - public String getName()
  - public abstract String makeSound();
  - public String toString() -> returns "{name} says {makeSound()}"

Class - Mammal (ABSTRACT, extends Animal):
  - public Mammal(String name) -> calls super(name)
  - public void giveBirth() -> prints "{name} gives birth to live young"
  (Mammal does NOT implement any locomotion interface — not all mammals fly/swim)

Class - Bird (ABSTRACT, extends Animal, implements EggLayer):
  - public Bird(String name) -> calls super(name)
  - layEgg() -> prints "{name} lays an egg"
  (ALL birds lay eggs, so Bird implements this directly. makeSound() stays abstract —
   subclasses still decide their own sound. Bird does NOT implement Flyer/Swimmer directly,
   since not all birds fly or swim — those get added per-subclass as needed.)

Class - Fish (ABSTRACT, extends Animal, implements Swimmer):
  - public Fish(String name) -> calls super(name)
  - swim() -> prints "{name} swims through water"
  (ALL fish swim, so Fish implements this directly, same reasoning as Bird/EggLayer.)

Class - Penguin (extends Bird, implements Swimmer):
  -> a bird that ALSO swims — curveball case
  - public Penguin(String name) -> calls super(name)
  - makeSound() -> "Honk"
  - swim() -> prints "{name} waddles then swims gracefully in icy water"
  (inherits layEgg() from Bird automatically — no need to rewrite it)

Class - Eagle (extends Bird, implements Flyer):
  - public Eagle(String name) -> calls super(name)
  - makeSound() -> "Screech"
  - fly() -> prints "{name} soars high in the sky"
  (inherits layEgg() from Bird automatically)

Class - Bat (extends Mammal, implements Flyer):
  -> a mammal that flies, NOT a bird — curveball case
  - public Bat(String name) -> calls super(name)
  - makeSound() -> "Eee"
  - fly() -> prints "{name} flies using echolocation"
  (inherits giveBirth() from Mammal automatically)

Class - Dog (extends Mammal):
  - public Dog(String name) -> calls super(name)
  - makeSound() -> "Woof"
  (no extra interfaces — just a plain mammal)

Class - Salmon (extends Fish):
  - public Salmon(String name) -> calls super(name)
  - makeSound() -> "Blub"
  (inherits swim() from Fish automatically — no extra interfaces needed)
*/

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {
            new Penguin("Pingu"),
            new Eagle("Sam"),
            new Bat("Bruce"),
            new Dog("Rex"),
            new Salmon("Nemo")
        };

        for (Animal a : zoo) {
            System.out.println(a);

            if (a instanceof Swimmer) {
                ((Swimmer) a).swim();
            }
            if (a instanceof Flyer) {
                ((Flyer) a).fly();
            }
            if (a instanceof EggLayer) {
                ((EggLayer) a).layEgg();
            }
            if (a instanceof Mammal) {
                ((Mammal) a).giveBirth();
            }

            System.out.println("---");
        }
    }
}