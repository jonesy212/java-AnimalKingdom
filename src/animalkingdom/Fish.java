package animalkingdom;

public class Fish implements Animals
{
    private int food = 0;
    private String name;

    public Fish(String name)
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
            return "swim";
        }
    @Override
    public String breath()
        {
        return "gills";
        }
    public String reproduce()
    {
        return "eggs";
    }
   
}