import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 */
public class Elephant extends Actor
{
    String name;
    public Elephant(String name)
    {
        this.name = name;
    }
    
    public void act()
    {
        // Add your action code here.
        move(1);
    }
}
