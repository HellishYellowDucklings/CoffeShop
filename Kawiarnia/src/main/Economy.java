

package main;

public class Economy
{
    private double current_cash;
    private double actual_cash;
    private double debt;
    
    public void setDebt(double ammount)
    {
        this.debt = ammount;
    }
    
    public double getDebt()
    {
        return debt;
    }
    
    public void setCurrentCash(double ammount)
    {
        this.current_cash = ammount;
    }
    
    public double getCurrentCash()
    {
        return current_cash;
    }
    
    public void setActualCash(double ammount)
    {
        this.actual_cash = ammount;
    }
    public double getActualCash()
    {
        return actual_cash;
    }
}
