package ec.edu.espe.urbanizationtreasury.model;

import java.util.ArrayList;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class AccessCard {
    
    private ArrayList<Payment> AccessCardPayment = new ArrayList<>();

    public ArrayList<Payment> getAliquotPayment() {
        return AccessCardPayment;
    }

    public void setAliquotPayment(ArrayList<Payment> aliquotPayment) {
        this.AccessCardPayment = aliquotPayment;
    }
    
}
