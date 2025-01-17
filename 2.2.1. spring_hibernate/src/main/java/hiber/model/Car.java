package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    @OneToOne (mappedBy = "car")
    private User user;

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }
    public Car(){}

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
