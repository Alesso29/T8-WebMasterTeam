/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class Payment {
    
    private float aliquot;
    private float [] accessCard = new float [12];
    private float accessControl;
    private float extraordinary;
    
    public Payment() {
        aliquot = 0;
        float [] array = {0,0,0,0,0,0,0,0,0,0,0,0};
        accessCard = array;
        accessControl = 0;
        extraordinary = 0;
    }

    public float getAliquot() {
        return aliquot;
    }

    public void setAliquot(float aliquot) {
        this.aliquot = aliquot;
    }

    public float[] getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(float[] accessCard) {
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
    
    
    
}
