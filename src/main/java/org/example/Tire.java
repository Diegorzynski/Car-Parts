package org.example;


public class Tire extends CarPart{

    private int size;
    private int width;

    public Tire(String manufacturerName, String model, String series, int size, int width) {
        super(manufacturerName, model, series);
        this.size = size;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "size=" + size +
                ", width=" + width +
                '}';
    }
}
