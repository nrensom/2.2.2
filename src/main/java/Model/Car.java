package Model;

import org.springframework.context.annotation.ComponentScan;

public class Car {
    private String color;
    private String model;
    private int series;
    public Car(){
    }

    public Car(String model, int series, String color) {
        this.color = color;
        this.model = model;
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
