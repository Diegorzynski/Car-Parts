package org.example;

import java.util.UUID;

public class Exhaust extends CarPart{

    private boolean compliesWithEMS;

    public Exhaust(String manufacturerName, String model, String series, boolean compliesWithEMS) {
        super(manufacturerName, model, series);
        this.compliesWithEMS = compliesWithEMS;
    }

    @Override
    public String toString() {
        return super.toString() +
               "compliesWithEMS=" + compliesWithEMS +
                '}';
    }
}
