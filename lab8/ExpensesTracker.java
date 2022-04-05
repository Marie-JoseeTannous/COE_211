import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;  // Import the FileWriter class
import java.io.IOException;// Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
    public static void main(String[] args) throws IOException {
	 // Create FileWriter & Scanner objects & y/n string
        String check;
      
        Scanner scan = new Scanner(System.in);
                FileWriter fw = new FileWriter(new File("expenses.txt"));
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outToFile = new PrintWriter(bw);
                
                double payment;
                String purchase;
 // Start gathering information inside the loop you will start

        do {


            System.out.println("Input your name: ");
            String name = scan.nextLine();
            System.out.println("What did you purchase?");
            purchase = scan.nextLine();
            System.out.println("How much did you pay ? (in USD)");
            payment = scan.nextDouble();


// append onto a file

	    outToFile.println(name + " purchased " + purchase + " for " + payment + " US Dollars "); 

            System.out.println("Would you like to log another purchase? (y/n)");
            scan.nextLine();
            check = scan.nextLine();

                           } while (check.equals("y"));


        System.out.println("Get off of ZoodMall!");
        System.out.println("Would you like to read a summary of your purchases?");
        String answer= scan.nextLine();
        scan.close();
         outToFile.close();
                        if (answer.equals("y")) {
                            Scanner fileScan = new Scanner(new File("expenses.txt"));
                            String url;
                                    while (fileScan.hasNext()) {
                                        url = fileScan.nextLine();
                                        System.out.println(url);
                                    }
                         }


             }
}