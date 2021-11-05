package by.epam.jwd2.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Laptop extends Appliance {

    private int batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private int displayInchs;
    private String oS;

    public Laptop() {
    }

    public Laptop(double height, double width, double length, double weight, double powerConsumption, int batteryCapacity, int memoryRom, int systemMemory, int displayInchs, String OS) {
        super(height, width, length, weight, powerConsumption);
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.displayInchs = displayInchs;
        this.oS = OS;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    public String getOS() {
        return oS;
    }

    public void setOS(String oS) {
        this.oS = oS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getHeight(), getHeight()) == 0 && Double.compare(laptop.getWidth(), getWidth()) == 0 &&
                Double.compare(laptop.getLength(), getLength()) == 0 && Double.compare(laptop.getWeight(), getWeight()) == 0 &&
                Double.compare(laptop.getPowerConsumption(), getPowerConsumption()) == 0 && batteryCapacity == laptop.batteryCapacity
                && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && displayInchs == laptop.displayInchs && Objects.equals(oS, laptop.oS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth(), getLength(), getWeight(), getPowerConsumption(), batteryCapacity, memoryRom, systemMemory, displayInchs, oS);
    }

    @Override
    public String toString() {
        return "laptop{" + super.toString() +
                "batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", displayInchs=" + displayInchs +
                ", OS='" + oS + '\'' +
                '}';
    }
}
