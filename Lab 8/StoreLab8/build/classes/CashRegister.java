
import java.text.DecimalFormat;
import javafx.beans.property.*;


public class CashRegister implements ProductObserver {
    private DoubleProperty cash = new SimpleDoubleProperty();
    
    public CashRegister() {
        this.cash.set(0.0); 
        
    }

    
    public void add(double money) {
        cash.set(money + cash.get());
        
    }

    public final double getCash(){return cash.get();}
    public ReadOnlyDoubleProperty cashProperty(){return cash;}
    
    @Override
    public void handleSale(double amount) {
        add(amount);
    }
   
    

    
    
}