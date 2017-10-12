import java.text.*;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        // insert 3 lines of code to initialise the fields.
    }

    public String getName() {
        return "";
    }

    public boolean isEmpty() {
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
        return 0.0;
    }

    /**
     * Increase stock by n.
     */
    public void restock(int n) {
    }

    @Override
    public String toString() {
        return name + " -- " + stock + " at $" + formatted(price);
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
