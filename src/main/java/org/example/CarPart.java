package org.example;

import java.util.Objects;
import java.util.UUID;

public class CarPart {

    private UUID id;
    private String manufacturerName;
    private String model;
    private String series;

    public CarPart(String manufacturerName, String model, String series) {
        this.id = UUID.randomUUID();
        this.manufacturerName = manufacturerName;
        this.model = model;
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPart carPart = (CarPart) o;
        return Objects.equals(id, carPart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
