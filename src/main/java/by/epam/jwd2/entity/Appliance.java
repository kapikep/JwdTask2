package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Entity
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public abstract class Appliance implements Serializable {

    private double height;
    private double width;
    private double length;
    private double weight;
    private double powerConsumption;

    public Appliance() {
    }

    public Appliance(double height, double width, double length, double weight, double powerConsumption) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                ", powerConsumption=" + powerConsumption + ", ";
    }
}
