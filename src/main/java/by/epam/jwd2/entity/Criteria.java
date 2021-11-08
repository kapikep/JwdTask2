package by.epam.jwd2.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria for finding an appliance
 */
public class Criteria {

    private List<String> params = new ArrayList<>();

    public Criteria(String nameAppliance) {
        params.add(nameAppliance);
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
            params.add(param + "=" + valueDouble);
        } catch (NumberFormatException e) {
            params.add(param + "=" + value);
        }
    }

    public List<String> getParams() {
        return params;
    }

}
