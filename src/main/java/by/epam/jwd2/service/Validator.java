package by.epam.jwd2.service;

import by.epam.jwd2.entity.Criteria;

import java.util.List;

/**
 * Validate parameters for search
 */
public class Validator {

    public static boolean validate(Criteria criteria) {

        List<String> params = criteria.getParams();
        String param = "";
        String value = "";
        double valueDouble = 0.0;
        boolean validateValue;

        if (params.size() == 0) {
            return false;
        } else if (params.size() == 1 && params.get(0).equals("")) {
            return false;
        }

        for (int i = 1; i < params.size(); i++) {

            String s = params.get(i);

            param = s.substring(0, s.indexOf("="));
            value = s.substring(s.indexOf("=") + 1);

            try {
                valueDouble = Double.parseDouble(value);
            } catch (NumberFormatException e) {

            }

            if (params.get(0).equals("refrigerator")) {
                validateValue = validateRefrigerator(param, valueDouble);
            } else if ((params.get(0).equals("speaker"))) {
                validateValue = validateSpeaker(param, valueDouble);
            } else if ((params.get(0).equals("laptop"))) {
                validateValue = validateLaptop(param, valueDouble);
            }else if ((params.get(0).equals("oven"))) {
                validateValue = validateOven(param, valueDouble);
            }else {
                validateValue = validateAppliance(param, valueDouble);
            }

            if (!validateValue) {
                return false;
            }
        }

        return true;
    }

    private static boolean validateSpeaker(String param, Double valueDouble) {

        switch (param) {
            case "height":
            case "width":
            case "length":
                if (valueDouble <= 0 || valueDouble > 100) {
                    return false;
                }
                break;

            case "weight":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "powerConsumption":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "numberOfSpeakers":
                if (valueDouble <= 0 || valueDouble > 20) {
                    return false;
                }
                break;

            case "frequencyRange":
                if (valueDouble <= 0 || valueDouble > 1000000) {
                    return false;
                }
                break;

            case "cordLength":
                if (valueDouble <= 0 || valueDouble > 20) {
                    return false;
                }
                break;

            default:
                return false;
        }
        return true;
    }


    private static boolean validateLaptop(String param, Double valueDouble) {

        switch (param) {
            case "height":
            case "width":
            case "length":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "weight":
                if (valueDouble <= 0 || valueDouble > 100000) {
                    return false;
                }
                break;

            case "powerConsumption":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "freezerCapacity":
            case "overallCapacity":
                if (valueDouble <= 0 || valueDouble > 50) {
                    return false;
                }
                break;

            default:
                return false;
        }
        return true;
    }

    private static boolean validateOven(String param, Double valueDouble) {

        switch (param) {
            case "height":
            case "width":
            case "length":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "weight":
                if (valueDouble <= 0 || valueDouble > 100000) {
                    return false;
                }
                break;

            case "powerConsumption":
                if (valueDouble <= 0 || valueDouble > 100) {
                    return false;
                }
                break;

            default:
                return false;
        }
        return true;
    }

    private static boolean validateRefrigerator(String param, Double valueDouble) {

        switch (param) {
            case "height":
            case "width":
            case "length":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "weight":
                if (valueDouble <= 0 || valueDouble > 100000) {
                    return false;
                }
                break;

            case "powerConsumption":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;

            case "freezerCapacity":
            case "overallCapacity":
                if (valueDouble <= 0 || valueDouble > 100) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }


    private static boolean validateAppliance(String param, Double valueDouble) {

        switch (param) {
            case "height":
            case "width":
            case "length":
                if (valueDouble <= 0 || valueDouble > 10000) {
                    return false;
                }
                break;
            case "weight":
                if (valueDouble <= 0 || valueDouble > 100000) {
                    return false;
                }
                break;
        }
        return true;
    }

}