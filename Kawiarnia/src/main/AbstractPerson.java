

package main;

public abstract class AbstractPerson
{
    private String Name;
    private double Welth;
    private Integer[] Taste; //if 3 out of 6 are correct will buy product with -10 happyness, 
    //if 4 +10 if 5 +20 max 100 starts with 0 if -50 will never visit shop again if less will buy nothing -20 happyness and will cheack later untill -100;  
    private int Happyness;
    
    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public void setWelth(double welth)
    {
       this.Welth = welth;
    }
    
    public double getWelth()
    {
        return Welth;
    }
    
    public void setTaste(Integer[] taste)
    {
        this.Taste = taste;
    }
    
    public Integer[] getTaste()
    {
        return Taste;
    }
    
    public void setHappyness(int happyness)
    {
        this.Happyness = happyness;
    }
    
    public int getHappyness()
    {
        return Happyness;
    }
}
