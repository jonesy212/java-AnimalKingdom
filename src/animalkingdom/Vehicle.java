package animalkingdom;

//just another class
//this has attributes of an 
//animal and a vehicls
//so it will move

public interface Vehicle

{
    //a vehicle has a certain path
    String getPath();
    //a vehicle can move
    void move();
    //get fuel
    int getFuelLevel();
    void addFuel();
}