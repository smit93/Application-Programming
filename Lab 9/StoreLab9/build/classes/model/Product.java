package model;

import java.text.*;
import javafx.beans.property.*;
import javafx.beans.binding.*;
import java.util.*;

public class Product {
    private LinkedList<ProductObserver> observers = new LinkedList<ProductObserver>();

    private String name;
    public final String getName() { return name; }

    private IntegerProperty stock = new SimpleIntegerProperty();
    public final int getStock() { return stock.get(); }
    public ReadOnlyIntegerProperty stockProperty() { return stock; }
    
    private double price;
    public final double getPrice() { return price; }
   
    
    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock.set(stock);
        this.price = price;
    }

    public void sell(int n) {
        stock.set(stock.get() - n);
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
        return String.format("%s ($%.2f)", name, price);
    }
}
