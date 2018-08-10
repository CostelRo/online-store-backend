import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FinalizedPayment {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private        final int id;
    private        int customerID;
    private        int cartID;
    String idOfTransactionFromPaymentProcessor;

    PaymentType type;
    PaymentStatus status;

    Map<ProductCategory,Double> products = new HashMap<ProductCategory, Double>();

    public FinalizedPayment(){
        id = counter.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getCartID() {
        return cartID;
    }

    public String getIdOfTransactionFromPaymentProcessor() {
        return idOfTransactionFromPaymentProcessor;
    }

    public PaymentType getType() {
        return type;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public Map<ProductCategory, Double> getProducts() {
        return products;
    }

    public double computeTotalAmount(){

        products.values();
        double sum = 0;
        for ( Double productValue: products.values()) {
            sum = sum + productValue;

        }
        return  sum;
        }

    @Override
    public String toString() {
        return "FinalizedPayment{" +
                "id=" + id +
                ", customerID=" + customerID +
                ", cartID=" + cartID +
                ", idOfTransactionFromPaymentProcessor='" + idOfTransactionFromPaymentProcessor + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", products=" + products +
                '}';
    }
}





