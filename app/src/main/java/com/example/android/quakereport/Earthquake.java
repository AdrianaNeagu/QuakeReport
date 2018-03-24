package com.example.android.quakereport;



public class Earthquake {
    private double magnitude;
    private String location;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long mTimeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
