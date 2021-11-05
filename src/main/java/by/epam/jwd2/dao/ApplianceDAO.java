package by.epam.jwd2.dao;

import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.Criteria;
import java.util.List;

/**
 * DAO
 */
public interface ApplianceDAO {

    List<Appliance> findAppliance(Criteria criteria);
    boolean addAppliance(Appliance newAppliance);
    List<Appliance> getApplianceList();
}
