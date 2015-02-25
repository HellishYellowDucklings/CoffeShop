
package main;

public abstract class Edible
{
    private String Name;
    private double Cost;
    private Integer[] ingridients;
    
    public Edible(){}
    
    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public void setCost(double cost)
    {
        this.Cost = cost;
    }
    
    public double getCost()
    {
        return Cost;
    }

    public void setIngridients(Integer[] ingridients)
    {
        this.ingridients = ingridients;
    }
    
    public Integer[] getIngridients()
    {
        return ingridients;
    }
}
