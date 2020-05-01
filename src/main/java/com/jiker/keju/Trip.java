package com.jiker.keju;

public class Trip {
    private float mileage;
    private float minute;

    public float getMileage() {
        return mileage;
    }

    public float getMinute() {
        return minute;
    }

    public Trip initTrip(String trip) {
        String[] split = trip.replaceAll("公里|等待|分钟", "").split(",");
        this.mileage = Float.parseFloat(split[0]);
        this.minute = Float.parseFloat(split[1]);
        return this;
    }

}
