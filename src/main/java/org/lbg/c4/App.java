package org.lbg.c4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.io.BufferedReader;

import static org.lbg.c4.VAT.calculateVAT;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        double totalCost =0;

        String input;

        while(true){
            try{
                System.out.print("Enter the cost of the item or enter quit: ");
                input = reader.readLine();
                if(input.equals("quit")){
                    System.out.printf("The total price including VAT is: %.2f%n", totalCost);
                    break;
                }
                double cost = Double.parseDouble(input);
                System.out.print("Enter the VAT rate (%): ");
                String vatRatestr = reader.readLine();

                double vatRate = Double.parseDouble(vatRatestr);
                double vat = calculateVAT(cost, vatRate);


                double totalPrice = cost + vat;

                totalCost+=totalPrice;

                System.out.printf("The total price including VAT is: %.2f%n", totalCost);
            }
            catch (IOException e){
                System.out.println("Unhandled exception");
            }

        }
//        scanner.close();

//        int total_price = 0;
//
//        InputStreamReader isr = new InputStreamReader(System.in);
//        LineNumberReader lnr = new LineNumberReader(isr);
//
//            try {
//                while (lnr.readLine() != null){
//
//                }
//                System.out.println("Num of lines: " + lnr.getLineNumber());
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//
        }
}
