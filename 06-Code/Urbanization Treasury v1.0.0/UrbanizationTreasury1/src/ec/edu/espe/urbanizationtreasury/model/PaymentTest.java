/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class PaymentTest {
    private final int aliquotFee;
    private float [] registerCard = new float [12];
    private final float registerEnterCard;
    private final float extraordinaryFee; 
    
    public PaymentTest() {
    aliquotFee = 0;
    float [] array = {0,0,0,0,0,0,0,0,0,0,0,0};
    registerCard = array;
    registerEnterCard = 0;
    extraordinaryFee = 0;
    }

    public int getAliquotFee() {
        return aliquotFee;
    }

    public float[] getRegisterCard() {
        return registerCard;
    }

    public float getRegisterEnterCard() {
        return registerEnterCard;
    }

    public float getExtraordinaryFee() {
        return extraordinaryFee;
    }

    public PaymentTest(int aliquotFee, float registerEnterCard, float extraordinaryFee) {
        this.aliquotFee = aliquotFee;
        this.registerEnterCard = registerEnterCard;
        this.extraordinaryFee = extraordinaryFee;
    }
    
}
