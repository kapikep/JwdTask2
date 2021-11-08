package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Speaker extends Appliance {

    private int numberOfSpeakers;
    private double frequencyRange;
    private double cordLength;

    public Speaker() {
    }

    public Speaker(double height, double width, double length, double weight, double powerConsumption, int numberOfSpeakers, double frequencyRange, double cordLength) {
        super(height, width, length, weight, powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(double frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Speaker speaker = (Speaker) o;

        if (numberOfSpeakers != speaker.numberOfSpeakers) return false;
        if (Double.compare(speaker.frequencyRange, frequencyRange) != 0) return false;
        return Double.compare(speaker.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + numberOfSpeakers;
        temp = Double.doubleToLongBits(frequencyRange);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cordLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {

        return "speaker{" + super.toString() +
                "numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
