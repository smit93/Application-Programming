package model;

import java.util.*;
import javafx.beans.property.*;
import javafx.collections.*;

public class Store {

    private CashRegister cashRegister;
    private ObservableList<Product> products = FXCollections.observableArrayList();

    public Store() {
        cashRegister = new CashRegister();
        addProduct("Whiteboard Marker", 85, 1.50);
        addProduct("Whiteboard Eraser", 45, 5.0);
        addProduct("Black Pen", 100, 1.50);
        addProduct("Red Pen", 100, 1.50);
        addProduct("Blue Pen", 100, 1.50);
    }

    public void addProduct(String name, int stock, double price) {
        Product product = new Product(name, stock, price);
        product.addProductObserver(cashRegister);
        products.add(product);
    }

    public final CashRegister getCashRegister() {
        return cashRegister;
    }

    public ObservableList<Product> getProducts() {
        return products;
    }
}
