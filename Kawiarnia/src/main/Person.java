package main;

import java.text.DecimalFormat;



public class Person extends AbstractPerson
{
    public Person()
    {
        this.generateName();
        this.generateWelth();
        this.generateTaste(8);
        setHappyness(0);
    }
    
    public void generateName()
    {
        String Name = null;
        
        setName(Name);
    }
    
    public void generateWelth()
    {
        java.util.Random rand = new java.util.Random();
        double roll = rand.nextDouble();
        double welth = 25.0 + (roll *(800.0 - 25.0));
        DecimalFormat df = new DecimalFormat("#.00"); //niedziaua xD
        df.format(welth);
        setWelth(welth);
    }
    
    public void generateTaste(int max)
    {
        Integer[] taste = null;
        java.util.Random rand = new java.util.Random();
        
        setTaste(taste);
    }
}
