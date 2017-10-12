package model;

import java.text.*;
import javafx.beans.property.*;

public class CashRegister implements ProductObserver {
    private DoubleProperty cash = new SimpleDoubleProperty();

    public CashRegister() {
        cash.set(0.0);
    }

    public final double getCash() { return cash.get(); }
    private final void setCash(double cash) { this.cash.set(cash); }
    public ReadOnlyDoubleProperty cashProperty() { return cash; }

    public void add(double money) {
        setCash(getCash() + money);
    }

    @Override
    public void handleSale(double amount) {
        add(amount);
    }
    
}
