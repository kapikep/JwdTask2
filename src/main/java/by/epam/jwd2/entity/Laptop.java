package by.epam.jwd2.entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

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
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Laptop laptop = (Laptop) o;

        if (batteryCapacity != laptop.batteryCapacity) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (displayInchs != laptop.displayInchs) return false;
        return oS != null ? oS.equals(laptop.oS) : laptop.oS == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + batteryCapacity;
        result = 31 * result + memoryRom;
        result = 31 * result + systemMemory;
        result = 31 * result + displayInchs;
        result = 31 * result + (oS != null ? oS.hashCode() : 0);
        return result;
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
