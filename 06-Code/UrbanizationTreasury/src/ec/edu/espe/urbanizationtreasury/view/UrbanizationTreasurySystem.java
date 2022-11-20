/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.urbanizationtreasury.view;

import ec.edu.espe.urbanizationtreasury.model.Payment;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author WebMasterTeam, DCCO-ESPE
 */
public class UrbanizationTreasurySystem {
    
    public static void main(String[] args) {
        
        int option; //For options menu
        boolean exit = false; //Exit menu
        int residentNumber = 0; //position in the array
        
        Resident residents[];
        residents = new Resident [100];
        
        //Initializing the array
        for(int i = 0; i < 100; i++){
            residents[i] = new Resident();
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ---- National Polytechnic School Urbanization ---- ");
        System.out.println("              ---- Treasury System ---- ");
        
        while (!exit){
            
            System.out.println("Residents and Payments");
            System.out.println("1. Enter Residents");
            System.out.println("2. Aliquot");
            System.out.println("3. Access Card");
            System.out.println("4. Access Control");
            System.out.println("5. Extraordinary");
            System.out.println("6. Exit");
            
            try{
                System.out.print("Enter an option: ");
                option = sc.nextInt();
                
                switch (option){
                    case 1 -> {
                        enterResident(residents[residentNumber], sc); //Enter Residents
                        residentNumber++;
                    }
                    case 2 -> {
                        //Enter the payments resident to resident
                        // maybe use an options menu and into put the option like
                        //pay, history, print recive, and obviously exit.
                    }
                    case 3 -> {
                        
                    }
                    case 4 -> {
                    
                    }
                    case 5 -> {
                    
                    }
                    case 6 -> exit = true;
                }
                
                
            }catch (InputMismatchException e){
                System.out.println("You need to enter a number");
                sc.next();
            }
        
        }
        
    }

    private static void enterResident(Resident residents, Scanner sc) {
        
        System.out.print("Recident Id:");
        residents.setDni(sc.nextLong());
        
        System.out.print("Enter recident name: ");
        residents.setName(sc.next());
        
        System.out.print("Enter batch number: ");
        residents.setBatchNumber(sc.nextInt());
        
    }
}
