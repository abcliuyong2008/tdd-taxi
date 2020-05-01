package com.jiker.keju;

public class AppRunner {

    public static void main(String[] args) throws Exception {
        String testDataFile = args[0];
        String receipt = new TaxiReceipt().translateToTrip(testDataFile);
        System.out.println(receipt);
    }
}
