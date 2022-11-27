
package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Resident {
    
    private long dni;
    private String name;
    private int batchNumber;
    private float aliquot;
    private float accessCard;
    private float accessControl;
    private float extraordinary;
    private String mounths;

    @Override
    public String toString() {
        return "Resident{" + "dni=" + dni + ", name=" + name + ", batchNumber=" + batchNumber + ", setDni=" + '}';
    }

    public Resident() {
        this.dni = 0;
        this.name = "";
        this.batchNumber = 0;
        this.aliquot = 0;
        this.accessCard = 0;
        this.accessControl = 0;
        this.extraordinary = 0;
        this.mounths = "";
    }
    
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public float getAliquot() {
        return aliquot;
    }

    public void setAliquot(float aliquot) {
        this.aliquot = aliquot;
    }

    public float getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(float accessCard) {
        this.accessCard = accessCard;
    }

    public float getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(float accessControl) {
        this.accessControl = accessControl;
    }

    public float getExtraordinary() {
        return extraordinary;
    }

    public void setExtraordinary(float extraordinary) {
        this.extraordinary = extraordinary;
    }

    public String getMounths() {
        return mounths;
    }

    public void setMounths(String mounths) {
        this.mounths = mounths;
    }
    
}
