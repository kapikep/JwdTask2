package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Oven extends Appliance {

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
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Oven oven = (Oven) o;

        return type != null ? type.equals(oven.type) : oven.type == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "oven{" + super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
