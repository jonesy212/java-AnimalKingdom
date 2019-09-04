package animalkingdom;

public class Birds implements Animals

{
    private int food = 0;
    private String name;

    public Birds( String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name);
    {
        this.name
    }

    @Override
    public void move()
    {
        return fly
    }

    @Override
    public String breath()
    {
        return "lungs"
    }

    @Override
    public String reproduce()
    {
        return "eggs"
    }
}