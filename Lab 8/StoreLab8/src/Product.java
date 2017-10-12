
import java.text.*;
import java.util.LinkedList;
import javafx.beans.property.*;

public class Product {
    private LinkedList<ProductObserver> observers = new LinkedList<ProductObserver>();

    private String name;
    private IntegerProperty stock = new SimpleIntegerProperty();
    private double price;
   
    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock.set(stock);
        this.price = price;
        
    }

   
    
    public final String getName(){return name;}
    public final String getPrice() { return formatted(price); }
    public final int getStock(){return stock.get();}
    public ReadOnlyIntegerProperty stockProperty(){return stock;} 

    public void sell(int n) {
        stock.set(stock.get()- n);
        double money = n * price;
        
        for (ProductObserver observer : observers)
            observer.handleSale(money);
    }
 
    public void restock(int n) {
        stock.set(stock.get() + n);
    }

    public boolean has(int n) {
        return stock.get() >= n;
    }

    public void addProductObserver(ProductObserver observer) {
        observers.add(observer);
    }

    @Override
    public String toString() {
        return stock + " " + name + " at $" + formatted(price);
    }
    private String formatted(double money){
        return new DecimalFormat("###,##0.00").format(money);
    }
}
