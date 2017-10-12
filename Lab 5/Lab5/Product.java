import java.text.*;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        // insert 3 lines of code to initialise the fields.
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        
        return name;
    }

    public boolean isEmpty() {
        if (stock == 0)
        return true;
        else
        return false;
    }

    /**
     * Return true iff this product has at least n stock
     */
    public boolean has(int n) {
        return true;
    }

    /**
     * Sell n stock of this product (decrease stock by n)
     * and return the amount of money earned (price * n)
     */
    public double sell(int n) {
        if (n<=stock)
        stock -= n ;
        else
        System.out.println("Not enough stock");
         // a dummy return value - which you will change
        double total = n * price;
        
         return total;
    }

    /**
     * Increase stock by n.
     */
    public void restock(int n) {
        stock += n;
    }

    @Override
    public String toString() {
        return name + " -- " + stock + " at $" + formatted(price);
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
