package by.epam.jwd2.entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class VacuumCleaner extends Appliance{

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
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return motorSpeed == that.motorSpeed && Objects.equals(bagType, that.bagType) && Objects.equals(filterType, that.filterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagType, filterType, motorSpeed);
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
