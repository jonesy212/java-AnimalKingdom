package animalkingdom;

public class Mammals implements Animal
{
    private int food = 0;
    private String name;

    public Mammals(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void move()
    {
        return "walk"
    }

    @Override
    public void breath()
    {
        return "lungs"
    }

    @Override
    public void reproduce()
    {
        "live births"
    }
}