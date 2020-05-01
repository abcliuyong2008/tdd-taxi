package com.jiker.keju;

import java.util.List;

public class TaxiReceipt {

    private static final float FIRST_MILEAGE = 2.0f;
    private static final float FIRST_PRICE = 6.0f;
    private static final float LONG_MILEAGE = 8.0f;
    private static final float UNIT_PRICE = 0.8f;
    private static final float LONG_PRICE_RATE = 0.5f;
    private static final float WAITTIME_UNIT_PRICE = 0.25f;

    public String translateToTrip(String fileName) throws Exception {
        List<String> tripStrList = new FileUtil().readFileByLines(fileName);
        return tripStrList.stream()
                .map(s -> calculatePrice(new Trip().initTrip(s)))
                .map(onePrice -> "收费" + onePrice + "元\n")
                .reduce("", String::concat);
    }

    public int calculatePrice(Trip trip) {
        float mileage = trip.getMileage();
        float minute = trip.getMinute();
        return Math.round(WAITTIME_UNIT_PRICE * minute + FIRST_PRICE
                + Math.max(0, mileage - FIRST_MILEAGE) * UNIT_PRICE
                + Math.max(0, mileage - LONG_MILEAGE) * UNIT_PRICE * LONG_PRICE_RATE);
    }
}
