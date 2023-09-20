import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstStage extends MyWorld
{

    /**
     * Constructor for objects of class FirstStage.
     * 
     */
    public FirstStage()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Butterfly butterfly = new Butterfly();
        addObject(butterfly,600,87);
        Butterfly butterfly2 = new Butterfly();
        addObject(butterfly2,600,87);
        butterfly.setLocation(600,87);

        Butterfly butterfly3 = new Butterfly();
        addObject(butterfly3,716,188);
        Butterfly butterfly4 = new Butterfly();
        addObject(butterfly4,724,368);
        Butterfly butterfly5 = new Butterfly();
        addObject(butterfly5,603,522);
        Counter counter = new Counter();
        addObject(counter,78,34);
        Butterfly butterfly6 = new Butterfly();
        addObject(butterfly6,208,117);
        Butterfly butterfly7 = new Butterfly();
        addObject(butterfly7,204,474);
    }
}
