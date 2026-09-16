public abstract class Mammal extends Animal{
    public Mammal(String name)
    {
        super(name);
    }

    public void giveBirth()
    {
        System.out.printf("%s gives birth to live young.\n", getName());
    }
}