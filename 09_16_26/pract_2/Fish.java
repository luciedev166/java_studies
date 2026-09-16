public abstract class Fish extends Animal implements Swimmer{
    public Fish(String name)
    {
        super(name);
    }

    public void swim()
    {
        System.out.printf("%s swims through water.\n", getName());
    }

    

}