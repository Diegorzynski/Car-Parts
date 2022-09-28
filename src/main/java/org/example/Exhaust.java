package org.example;

import java.io.Serializable;
import java.util.UUID;

public class Exhaust extends CarPart implements Serializable {

    private boolean compliesWithEMS;

    public Exhaust(String manufacturerName, String model, String series, boolean compliesWithEMS) {
        super(manufacturerName, model, series);
        this.compliesWithEMS = compliesWithEMS;
    }

    public Exhaust(String manufacturerName, String model, String series) {
        super(manufacturerName, model, series);
    }

    @Override
    public String toString() {
        return super.toString() +
               "compliesWithEMS=" + compliesWithEMS +
                '}';
    }
}
