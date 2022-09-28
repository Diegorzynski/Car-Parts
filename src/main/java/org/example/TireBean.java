package org.example;


import java.io.Serializable;

public class TireBean extends CarPartBean implements Serializable {

    private int size;
    private int width;

    public TireBean() {
    }


    @Override
    public String toString() {
        return super.toString() +
                "size=" + size +
                ", width=" + width +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
