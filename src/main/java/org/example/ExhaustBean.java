package org.example;

import java.io.Serializable;

public class ExhaustBean extends CarPartBean implements Serializable {

    private boolean compliesWithEMS;

    public ExhaustBean() {
    }

    public boolean isCompliesWithEMS() {
        return compliesWithEMS;
    }

    public void setCompliesWithEMS(boolean compliesWithEMS) {
        this.compliesWithEMS = compliesWithEMS;
    }

    @Override
    public String toString() {
        return super.toString() +
               "compliesWithEMS=" + compliesWithEMS +
                '}';
    }
}
