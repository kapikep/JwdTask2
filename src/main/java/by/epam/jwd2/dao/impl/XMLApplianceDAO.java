package by.epam.jwd2.dao.impl;

import by.epam.jwd2.dao.ApplianceDAO;
import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.Criteria;
import java.util.List;

/**
 * DAO
 */
public class XMLApplianceDAO implements ApplianceDAO {

    private CriteriaSearcher criteriaSearcher;
    private ApplianceJaxbObject applianceJaxbObject;

    public XMLApplianceDAO() {
        criteriaSearcher = new CriteriaSearcher();
        applianceJaxbObject = ApplianceJaxbObject.getApplianceJaxbObject();
    }

    @Override
    public List<Appliance> findAppliance(Criteria criteria) {
        return criteriaSearcher.findAppliance(criteria);
    }

    @Override
    public boolean addAppliance(Appliance newAppliance) {
        ApplianceJaxbObject.getApplianceJaxbObject().addAppliance(newAppliance);
        return false;
    }

    @Override
    public List<Appliance> getApplianceList() {
        return applianceJaxbObject.getApplianceList();
    }

}
