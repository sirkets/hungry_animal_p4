import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootImage[] images;
    
    public Elephant()
    {
        images = new GreenfootImage[8];
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(images[4]);
    }
    
    int curIndex = 0;
    void animate()
    {
        setImage(images[curIndex]);
        curIndex++;
        curIndex %= 8;
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
        
        animate();
        
        // Eat the apple
        if(isTouching(Apple.class)){
            Greenfoot.playSound("sounds/elephantcub.mp3");
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
    
    
    
}
