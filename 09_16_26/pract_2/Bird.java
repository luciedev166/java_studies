public abstract class Bird extends Animal implements EggLayer{
    public Bird(String name)
    {
        super(name);
    }

    public void layEgg()
    {
        System.out.printf("%s lays an egg.\n", getName());
    }

    

}