package by.epam.jwd2.service;

import by.epam.jwd2.dao.ApplianceDAO;
import by.epam.jwd2.dao.impl.XMLApplianceDAO;
import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.Criteria;

import java.util.List;


/**
 * Service
 */
public class ApplianceServiceImpl implements ApplianceService {

    ApplianceDAO applianceDAO = new XMLApplianceDAO();

    @Override
    public List<Appliance> findAppliance(Criteria criteria) {

        List<Appliance> applianceList;

        if (!Validator.validate(criteria)) {
            throw new RuntimeException("Incorrect conditions search");
        }

        applianceList = applianceDAO.findAppliance(criteria);

        return applianceList;
    }

    @Override
    public void addAppliance(Appliance appliance) {
        applianceDAO.addAppliance(appliance);
    }

    @Override
    public List<Appliance> getApplianceList() {
        return applianceDAO.getApplianceList();
    }
}

