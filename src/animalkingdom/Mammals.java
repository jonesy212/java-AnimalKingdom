package animalkingdom;

public class Mammals implements Animals
{
    private int food = 0;
    private String name;

    public Mammals()
    {

    }

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

    //implement the interfaces

    @Override
    public void move()
    {
        // return "walk";
    }

    @Override
    public void breath()
    {
        // return "lungs";
    }

    @Override
    public void reproduce()
    {
        // return "live births";
    }
}

String eat(int i);
void move();
void breath();
void reproduce();