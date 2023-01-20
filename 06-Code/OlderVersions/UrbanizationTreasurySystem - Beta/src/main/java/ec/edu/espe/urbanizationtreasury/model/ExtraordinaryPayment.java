package ec.edu.espe.urbanizationtreasury.model;

import java.util.ArrayList;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ExtraordinaryPayment {
    
    private ArrayList<Payment> extraordinaryPayment = new ArrayList<>();

    public ArrayList<Payment> getAliquotPayment() {
        return extraordinaryPayment;
    }

    public void setAliquotPayment(ArrayList<Payment> aliquotPayment) {
        this.extraordinaryPayment = aliquotPayment;
    }
    
}
