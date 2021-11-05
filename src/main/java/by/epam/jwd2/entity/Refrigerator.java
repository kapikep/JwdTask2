package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Refrigerator extends Appliance {

    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public Refrigerator(double height, double width, double length, double weight, double powerConsumption, double freezerCapacity, double overallCapacity) {
        super(height, width, length, weight, powerConsumption);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.getHeight(), getHeight()) == 0 && Double.compare(that.getWidth(), getWidth()) == 0 &&
                Double.compare(that.getLength(), getLength()) == 0 && Double.compare(that.getWeight(), getWeight()) == 0 &&
                Double.compare(that.getPowerConsumption(), getPowerConsumption()) == 0 && Double.compare(that.getFreezerCapacity(), getFreezerCapacity()) == 0 &&
                Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength(), getWeight(), getPowerConsumption(), getFreezerCapacity(), getOverallCapacity());
    }

    @Override
    public String toString() {
        return "refrigerator{" + super.toString() +
                "freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                '}';
    }
}
