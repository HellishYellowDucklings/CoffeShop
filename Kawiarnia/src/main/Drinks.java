
package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Drinks
{
    private final ArrayList<Liquids> liquids_list;

    public Drinks()
    {
     liquids_list = new ArrayList<Liquids>(Arrays.asList(new Liquids()));
    }
    
    public ArrayList<Liquids> getDrinkList()
    {
        return liquids_list;
    }
    
    public void addDrink(String name, double cost, Integer[] ingridients)
    {
        getDrinkList().add(new Liquids());
        //This doesn't want to work for me for some reason...
        getDrinkList().get(getDrinkList().size()-1).setName(name);
        getDrinkList().get(getDrinkList().size()-1).setCost(cost);
        getDrinkList().get(getDrinkList().size()-1).setIngridients(ingridients);
     }
    
    public String getDrinksAsString()
    {
        String Text = null;
        for(int i = 0; i < getDrinkList().size(); i++)
        {
           Text = "Name : " + getDrinkList().get(i).getName() + " Cost : " + getDrinkList().get(i).getCost()
           + " Ingridients : " + Arrays.toString(getDrinkList().get(i).getIngridients());
        }
        return Text;
    }
    
    public String getDrinkNameById(int index)
    {
        return getDrinkList().get(index).getName();
    }
    
    public double getDrinkCostById(int index)
    {
        return getDrinkList().get(index).getCost();
    }
    
    public Integer[] getDrinkIngridientsById(int index)
    {
        return getDrinkList().get(index).getIngridients();
    }
}
