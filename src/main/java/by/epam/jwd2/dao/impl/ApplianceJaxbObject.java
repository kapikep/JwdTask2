package by.epam.jwd2.dao.impl;

import by.epam.jwd2.entity.*;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Object for save and restore in XML by the parser Jaxb
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class ApplianceJaxbObject {

    private static ApplianceJaxbObject applianceJaxbObject = ApplianceXmlParser.parseXML();

    @XmlTransient
    private List<Appliance> applianceList = new ArrayList<>();
    @XmlElementWrapper(name = "Refrigerators")
    @XmlElement(name = "Refrigerator")
    private List<Refrigerator> refrigerators = new ArrayList<>();
    @XmlElementWrapper(name = "Speakers")
    @XmlElement(name = "Speaker")
    private List<Speaker> speakers = new ArrayList<>();
    @XmlElementWrapper(name = "Laptops")
    @XmlElement(name = "Laptop")
    private List<Laptop> laptops = new ArrayList<>();
    @XmlElementWrapper(name = "Ovens")
    @XmlElement(name = "Oven")
    private List<Oven> ovens = new ArrayList<>();
    @XmlElementWrapper(name = "VacuumCleaners")
    @XmlElement(name = "VacuumCleaner ")
    private List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

    ApplianceJaxbObject() {
    }

    public List<Appliance> getApplianceList() {
        if (applianceList.size() == 0) {
            applianceList.addAll(refrigerators);
            applianceList.addAll(speakers);
            applianceList.addAll(laptops);
            applianceList.addAll(ovens);
            applianceList.addAll(vacuumCleaners);
        }
        return applianceList;
    }

    public static ApplianceJaxbObject getApplianceJaxbObject() {
        return applianceJaxbObject;
    }

    public void addAppliance(Appliance newAppliance) {

        applianceList.add(newAppliance);

        if (newAppliance instanceof Refrigerator) {
            refrigerators.add((Refrigerator) newAppliance);
        } else if (newAppliance instanceof Speaker) {
            speakers.add((Speaker) newAppliance);
        } else if (newAppliance instanceof Laptop) {
            laptops.add((Laptop) newAppliance);
        } else if (newAppliance instanceof Oven) {
            ovens.add((Oven) newAppliance);
        } else if (newAppliance instanceof VacuumCleaner) {
            vacuumCleaners.add((VacuumCleaner) newAppliance);
        } else {
            throw new RuntimeException("Unable to save");
        }

        ApplianceXmlParser.saveToXML(applianceJaxbObject);
    }
}
