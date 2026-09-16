public class Frog extends Animal implements AmphibiousMover
{
    public Frog(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "Croak";
    }

    public void swim()
    {
        System.out.printf("%s swims accross the pond.\n", getName());
    }

    public void walk()
    {
        System.out.printf("%s hops along the ground.\n", getName());
    }

    
}