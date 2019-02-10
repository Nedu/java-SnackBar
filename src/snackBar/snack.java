package snackBar;

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    public Snack (String name, int quantity, double cost, int vendingMachineID)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }

    /* Setter method to set name */
    public void setName(String name)
    {
        this.name = name;
    }

    /* Getter method to get quantity */
    public int getQuantity()
    {
        return quantity;
    }

    /* add quantity given quantity */
    public void updateQuantity(int quantity)
    {
        this.quantity += quantity
    }

    /* buy snack given quantity */
    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    /* get total cost given a quantity */
    public double getTotalCost(int quantity)
    {
        return this.cost * quantity;
    }
}