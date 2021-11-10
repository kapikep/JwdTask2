package by.epam.jwd2.dao.impl;

import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for finding by criteria an appliance
 */
public class CriteriaSearcher {

    private ApplianceJaxbObject applianceJaxbObject;
    private List<String> searchDataList;

    public CriteriaSearcher() {
        this.applianceJaxbObject = ApplianceJaxbObject.getApplianceJaxbObject();
        searchDataList = initSearchData();
    }

    public List<Appliance> findAppliance(Criteria criteria) {
        List<Appliance> applianceList = applianceJaxbObject.getApplianceList();
        List<Appliance> result = new ArrayList<>();
        boolean fullMatch;

        for (int i = 0; i < searchDataList.size(); i++) {

            fullMatch = true;

            for (String s : criteria.getParamsList()) {

                if (!searchDataList.get(i).contains(s)) {
                    fullMatch = false;
                    break;
                }
            }
            if (fullMatch) {
                result.add(applianceList.get(i));
            }
        }

        return result;
    }

    /**
     * @return List<String> from List<Appliance>
     */
    private List<String> initSearchData() {
        List<Appliance> applianceList = applianceJaxbObject.getApplianceList();
        List<String> result = new ArrayList<>();

        for (Appliance a :
                applianceList) {
            result.add(a.toString());
        }
        return result;
    }

}
