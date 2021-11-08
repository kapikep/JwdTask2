package by.epam.jwd2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class VacuumCleaner extends Appliance {

    private String bagType;
    private String filterType;
    private int motorSpeed;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double height, double width, double length, double weight, double powerConsumption, String bagType, String filterType, int motorSpeed) {
        super(height, width, length, weight, powerConsumption);
        this.bagType = bagType;
        this.filterType = filterType;
        this.motorSpeed = motorSpeed;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }

    public void setMotorSpeed(int motorSpeed) {
        this.motorSpeed = motorSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (motorSpeed != that.motorSpeed) return false;
        if (bagType != null ? !bagType.equals(that.bagType) : that.bagType != null) return false;
        return filterType != null ? filterType.equals(that.filterType) : that.filterType == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + motorSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "vacuumCleaner{" + super.toString() +
                "bagType='" + bagType + '\'' +
                ", filterType='" + filterType + '\'' +
                ", motorSpeed=" + motorSpeed +
                '}';
    }
}
