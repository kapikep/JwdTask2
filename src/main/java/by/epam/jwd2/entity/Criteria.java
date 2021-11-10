package by.epam.jwd2.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Criteria for finding an appliance
 */
public class Criteria {

    private List<String> paramsList = new ArrayList<>();

    public Criteria(String applianceName) {
        paramsList.add(applianceName);
    }

    /**
     * @param param desired parameter of appliance
     * @param value value of the desired parameter of appliance
     */
    public void addCriteria(String param, String value) {

        double valueDouble;
        param = param.trim();

        try {
            valueDouble = Double.parseDouble(value);
            paramsList.add(param + "=" + valueDouble);
        } catch (NumberFormatException e) {
            paramsList.add(param + "=" + value);
        }
    }

    public List<String> getParamsList() {
        return paramsList;
    }
}
