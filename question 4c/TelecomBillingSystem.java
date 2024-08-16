/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.number4;

/**
 *
 * @author Shakur
 */
public class TelecomBillingSystem {
    public static void main(String[] args) {
        //  we first initialize balance after loading UGX 10,000
        double initialLoad = 10000.0;

        // now we can deduct 10% of the loaded airtime according to the question
        double chargePercentage = 10.0 / 100.0;
        double airtimeAfterCharge = initialLoad - (initialLoad * chargePercentage);

        // we make sure that the duration is in seconds (5 minutes = 5 * 60 seconds)
        int callDurationInSeconds = 5 * 60;

       
        double chargePerSecond = 200.0;

        
        double totalCallCost = callDurationInSeconds * chargePerSecond;

        
        double remainingBalance = airtimeAfterCharge - totalCallCost;

        // we can now display the balance
        System.out.println("Remaining balance after the call: UGX " + remainingBalance);
    }
}
