package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Oven extends Appliance{

    private String type;

    public Oven() {
    }

    public Oven(double height, double width, double length, double weight, double powerConsumption, String type) {
        super(height, width, length, weight, powerConsumption);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.getHeight(), getHeight()) == 0 && Double.compare(oven.getWidth(), getWidth()) == 0 &&
                Double.compare(oven.getLength(), getLength()) == 0 && Double.compare(oven.getWeight(), getWeight()) == 0 &&
                Double.compare(oven.getPowerConsumption(), getPowerConsumption()) == 0 && Objects.equals(getType(), oven.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength(), getWeight(), getPowerConsumption(), getType());
    }

    @Override
    public String toString() {
        return "oven{"+ super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
