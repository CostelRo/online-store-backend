import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Receipt {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private        final int id;
    private        int customerID;
    private        int cartID;

    public Receipt(){
        id = counter.getAndIncrement();
    }

    /*  Ma gandesc la o metoda utilizand Map<ProductCategory,Double>
        care returneaza pentru fiecare FinalizedPayment
        o cheie reprezentant categoria produsului
        si o valoare reprezentand suma pentru a putea afisa receipt ca in cerinte
        iar computeTotalAmmount sa imi afiseze totalul.

    public Map<ProductCategory,Double> getPurchases(){ }
    */

    /*to be defined
    public double computeTotalAmmount(){ }
    */

    /* to be defined
    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", customerID=" + customerID +
                ", cartID=" + cartID +
                '}';
    }
    */
}
