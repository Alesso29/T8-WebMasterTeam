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

        float[] accesCard = new float[12];
        for (int i = 0; i < 12; i++) {
            accesCard[i] = 0;
        }

        Payment payments[];
        payments = new Payment[100];
        for (int i = 0; i < 100; i++) {
            payments[i] = new Payment();
        }

        Resident residents[];
        residents = new Resident[100];

        //Initializing the array
        for (int i = 0; i < 100; i++) {
            residents[i] = new Resident();
        }

        

            Scanner sc = new Scanner(System.in);

            System.out.println(" ---- National Polytechnic School Urbanization ---- ");
            System.out.println("              ---- Treasury System ---- ");

            while (!exit) {

                System.out.println("================================");
                System.out.println("#####Residents and Payments#####");
                System.out.println("1. Enter Resident");
                System.out.println("2. Aliquot");
                System.out.println("3. Access Card");
                System.out.println("4. Access Control");
                System.out.println("5. Extraordinary");
                System.out.println("6. Exit");
                System.out.println("=================================");
                try {
                    System.out.print("Enter an option: ");
                    option = sc.nextInt();
                    optionVerifier(option);

                    switch (option) {
                        case 1 -> {
                            enterResident(residents[residentNumber], sc); //Enter Residents
                            residentNumber++;
                        }
                        case 2 -> {
                            
                            if (residentNumber != 0) {
                                System.out.println("----------------------------------------");

                                

                                System.out.println("----------------------------------------");
                            }else{
                                System.out.println("|||No residents registered|||");
                            }
                        }
                        case 3 -> {
                            if (residentNumber != 0) {
                                System.out.println("----------------------------------------");

                                accesCardPayment(residents, accesCard, payments);

                                System.out.println("----------------------------------------");
                            }else{
                                System.out.println("|||No residents registered|||");
                            }
                            

                        }
                        case 4 -> {
                            
                            if (residentNumber != 0) {
                                System.out.println("----------------------------------------");

                                

                                System.out.println("----------------------------------------");
                            }else{
                                System.out.println("|||No residents registered|||");
                            }

                        }
                        case 5 -> {
                            
                            if (residentNumber != 0) {
                                System.out.println("----------------------------------------");

                              

                                System.out.println("----------------------------------------");
                            }else{
                                System.out.println("|||No residents registered|||");
                            }

                        }
                        case 6 -> {
                            System.out.println("=================================");
                            System.out.println("== Thanks for using the system ==");
                            System.out.println("=================================");
                            exit = true;
                        }

                    }

                } catch (InputMismatchException e) {
                    System.out.println("You need to enter a number");
                    sc.next();
                }

            }
        }
    

    private static void accesCardPayment(Resident[] residents, float[] accesCard, Payment[] payments) {
        Scanner sc = new Scanner(System.in);
        boolean accesCardVerification, monthVerification;
        long id;
        String month;
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        do {
            accesCardVerification = true;
            monthVerification = true;
            id = readOfLong("Enter the id of resident: ", "Please enter a number");
            digitVerification(id, sc);
            for (int i = 0; i < 100; i++) {
                if (id == residents[i].getDni()) {
                    do {
                        accesCardVerification = false;
                        System.out.print("Please enter the month whose payment will be modified: ");
                        month = sc.nextLine();
                        for (int j = 0; j < 12; j++) {
                            if (month.equals(months[j])) {
                                monthVerification = false;
                                accesCard[j] = readOfFloat("Enter the card payment made: ", "Please enter a real number");
                            }
                        }
                        payments[i].setAccessCard(accesCard);
                        if (monthVerification == true) {
                            System.out.println("Please enter a month (Example: january)");
                        }
                    } while (monthVerification);
                }
            }
            if (accesCardVerification == true) {
                System.out.println("Please enter values that exist");
            }
        } while (accesCardVerification);
    }

    private static void enterResident(Resident residents, Scanner sc) {

        System.out.print("Recident Id:");
        residents.setDni(sc.nextLong());
        digitVerification(residents.setDni, sc);

        System.out.print("Enter recident name: ");
        residents.setName(sc.next());

        System.out.print("Enter batch number: ");
        residents.setBatchNumber(sc.nextInt());

        System.out.println("|||User entered |||");

    }

    private static float readOfFloat(String readMessage, String errorMessage) {
        Scanner read = new Scanner(System.in);
        float auxiliar = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print(readMessage);
                auxiliar = read.nextFloat();
                if (auxiliar <= 0) {
                    System.out.println("Please enter a positive number");
                }
            } catch (InputMismatchException ex) {
                System.out.println(errorMessage);
                read.next();
                correctReading = true;
            }
        } while (correctReading || auxiliar <= 0);
        return auxiliar;
    }

    private static long readOfLong(String readMessage, String errorMessage) {
        Scanner read = new Scanner(System.in);
        long auxiliar = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print(readMessage);
                auxiliar = read.nextLong();
            } catch (InputMismatchException ex) {
                System.out.println(errorMessage);
                read.next();
                correctReading = true;
            }
        } while (correctReading || auxiliar <= 0);
        return auxiliar;
    }

    private static void digitVerification(long residentsId, Scanner sc) {

        while (residentsId < 100000000 || residentsId > 2000000000) {

            System.out.println("Error enter the ID again:");
            residentsId = sc.nextLong();
        }
    }

    private static void optionVerifier(int option) {

        if (option < 1 || option > 6) {
            System.out.println("||||||||||||||||||||||||||||||||");
            System.out.println("||Error enter the option again||");
            System.out.println("||||||||||||||||||||||||||||||||");
        }

    }

}
