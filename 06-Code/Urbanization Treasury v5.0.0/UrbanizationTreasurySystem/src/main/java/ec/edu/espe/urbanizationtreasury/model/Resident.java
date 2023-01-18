package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Resident {
    
    private long id;
    private int batchNumber;
    private String name;


    public int getBatch() {
        return batchNumber;
    }

    public void setBatch(int batch) {
        this.batchNumber = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
