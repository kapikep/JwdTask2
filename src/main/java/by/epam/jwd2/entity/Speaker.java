package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

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
        if (!(o instanceof Speaker)) return false;
        Speaker speaker = (Speaker) o;
        return Double.compare(speaker.getHeight(), getHeight()) == 0 && Double.compare(speaker.getWidth(), getWidth()) == 0 &&
                Double.compare(speaker.getLength(), getLength()) == 0 && Double.compare(speaker.getWeight(), getWeight()) == 0 &&
                Double.compare(speaker.getPowerConsumption(), getPowerConsumption()) == 0 && getNumberOfSpeakers() == speaker.getNumberOfSpeakers() &&
                Double.compare(speaker.getFrequencyRange(), getFrequencyRange()) == 0 && Double.compare(speaker.getCordLength(), getCordLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength(), getWeight(), getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
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
