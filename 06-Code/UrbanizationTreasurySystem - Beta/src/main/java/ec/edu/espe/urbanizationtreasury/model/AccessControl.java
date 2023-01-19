package ec.edu.espe.urbanizationtreasury.model;

import java.util.ArrayList;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class AccessControl {
    
    private ArrayList<Payment> accessControlPayment = new ArrayList<>();

    public ArrayList<Payment> getAliquotPayment() {
        return accessControlPayment;
    }

    public void setAliquotPayment(ArrayList<Payment> aliquotPayment) {
        this.accessControlPayment = aliquotPayment;
    }
    
}
