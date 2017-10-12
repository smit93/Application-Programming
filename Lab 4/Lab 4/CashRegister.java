import java.text.*;

/**
 * The cash register stores cash.
 *
 * You can add cash to the cash register.
 */
public class CashRegister {
    private double cash;

    public CashRegister() {
        
    }
    
    public void add(double money){
        cash += money;
        
    }
    // insert 1 method here

    /**
     * Return a string in the form:
     *
     * Cash: $[cash]
     *
     * e.g. "Cash: $29.90"
     */
    @Override
    public String toString() {
        return "Cash: $"+formatted(cash) ;
    }
    
    private String formatted(double amount){
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
