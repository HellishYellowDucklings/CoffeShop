package main;

import org.junit.Test;
import static org.junit.Assert.*;


public class DrinksTest
{ 
    @Test
    public void AddDrinksTest()
    {
        Drinks drink = new Drinks();
        Integer[] ingridients = {1,2,3,4,5};
        drink.addDrink("Latte", 12.5, ingridients);
    }
    
    @Test
    public void GetDrinksAsStringTest()
    {
        Drinks drink = new Drinks();
        Integer[] ingridients = {1,2,3,4,5};
        drink.addDrink("Latte", 12.5, ingridients);
        assertEquals("Name : Latte Cost : 12.5 Ingridients : [1, 2, 3, 4, 5]", drink.getDrinksAsString());
    }
    
}
