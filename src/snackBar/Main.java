// * Instantiate 2 customers
//     * Jane with $45.25
//     * Bob with $33.14
// * Instantiate 3 Vending Machines
//     * Food
//     * Drink
//     * Office
// * Instantiate 5 snacks
//     * In Vending Machine Food
//         * 36 Chips at $1.75
//         * 36 Chocolate Bar at $1.00
//         * 30 Pretzel at $2.00
//     * In Vending Machine Drink
//         * 24 Soda at $2.50
//         * 20 Water at $2.75
	
// Processing

// 1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
// 1. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
// 1. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
// 1. Customer 1 finds $10. Print Customer 1 Cash on Hand.
// 1. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
// 1. Snack 3 gets 12 more. Print quantity of snack 3.
// 1. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

package snackBar;

public class Main
{
    private static void initialize()
    {
	Customer c1 = new Customer("Jane", 45.25);
	Customer c2 = new Customer("Bob", 33.14);

	VendingMachine v1 = new VendingMachine("Food");
	VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

	Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
	Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
	Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
	Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
	Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    c1.canBuy(s4.getTotalCost(3));
    s4.buySnack(3);
    processing(c1, 3, s4);

    c1.canBuy(s3.getTotalCost(1));
    s3.buySnack(1);
    processing(c1, 1, s3);

    c2.canBuy(s4.getTotalCost(2));
    s4.buySnack(2);
    processing(c2, 2, s4);

    c1.addCash(10.00);
    System.out.println(c1.getName() + " added $10. Cash on Hand is now: " + c1.getCashOnHand());
    System.out.println("========================================");

    c1.canBuy(s2.getTotalCost(1));
    s2.buySnack(1);
    processing(c1, 1, s2);

    s3.updateQuantity(12);
    System.out.println("12 more " + s3.getName() + " were added. Quantity is now: " + s3.getQuantity());
    System.out.println("========================================");

    c2.canBuy(s3.getTotalCost(3));
    s3.buySnack(3);
    processing(c2, 3, s3);
    }

    private static void processing(Customer customer, int quantity, Snack snack)
    {
        System.out.println(customer.getName() + " buys " + quantity + " " +  snack.getName() + ".");
        System.out.println("Cash on Hand Left: " + customer.getCashOnHand() + ".");
        System.out.println("Quantity of " + snack.getName() + " left: " + snack.getQuantity());
        System.out.println("========================================");
    }

    public static void main(String[] args)
    {
	    initialize();
    }
}
