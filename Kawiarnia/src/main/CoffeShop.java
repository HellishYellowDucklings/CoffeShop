package main;

public class CoffeShop extends Economy
{

    public void getLoan(double ammount)
    {
        setDebt(ammount);
        setActualCash(getCurrentCash()-ammount);
        setCurrentCash(getCurrentCash()+ammount);
    }
    //gameover
    public boolean isBancrupt()
    {   
        if(getActualCash() == -10000)
            return true;
        return false;
    }
    
}
