public class Kangaroo extends Animal implements Walker
{
    public Kangaroo(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "Grunt";
    }

    public void walk()
    {
        System.out.printf("%s hops powerfully across the outback.\n", getName());
    }

}