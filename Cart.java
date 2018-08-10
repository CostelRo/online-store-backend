
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cart {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private        final int id;
    private        int customerID;

    Date date;

    List<FinalizedPayment> processedFinalizedPayments = new ArrayList<FinalizedPayment>();


    public Cart() {
        id = counter.getAndIncrement();

    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getCustomerID() {
        return customerID;
    }

    public double computeTotalAmount(List<FinalizedPayment> finalizedPayments) {
        double totalAmount = 0;
        for (FinalizedPayment p : finalizedPayments) {
            totalAmount = totalAmount + p.computeTotalAmount();

        }

        return totalAmount;

    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", customerID=" + customerID +
                ", date=" + date +
                ", processedFinalizedPayments=" + processedFinalizedPayments +
                '}';
    }
}
