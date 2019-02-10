package snackBar;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    /* Getter method to get name */
    public String getName()
    {
        return name;
    }

    /* Getter method to get id */
    public int getId()
    {
        return id;
    }
    
    /* Setter method to set name */
    public void setName(String name)
    {
        this.name = name;
    }
}