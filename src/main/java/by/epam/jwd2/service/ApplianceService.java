package by.epam.jwd2.service;

import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> findAppliance(Criteria criteria);

    void addAppliance(Appliance appliance);

    List<Appliance> getApplianceList();

}
