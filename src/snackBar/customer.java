package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    /* Setter method to add cash */
    public void addCash(double cashOnHand)
    {
        this.cashOnHand += cashOnHand;
    }

    /* buy given total cash used in purchase */
    public void canBuy(double cashOnHand)
    {
        this.cashOnHand -= cashOnHand;
    }

    /* Getter method to get name */
    public String getName()
    {
        return name;
    }

    /* Setter method to set name */
    public void setName(String name)
    {
        this.name = name;
    }

    /* Getter method to get cash on hand */
    public double getCashOnHand()
    {
        return cashOnHand;
    }
}