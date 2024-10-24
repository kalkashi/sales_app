package org.lbg.c4;

public class VAT {

    // Function to calculate VAT
    public static double calculateVAT(double cost, double vatRate) {
        return cost * (vatRate / 100);
    }

}
