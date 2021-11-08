package by.epam.jwd2.main;

import by.epam.jwd2.entity.Appliance;
import by.epam.jwd2.entity.ApplianceCreator;
import by.epam.jwd2.entity.Criteria;
import by.epam.jwd2.service.ApplianceService;
import by.epam.jwd2.service.ApplianceServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * It's main class of task2
 */
public class Main {

    public static void main(String[] args) {

        ApplianceService service = new ApplianceServiceImpl();

        System.out.println("I can search \n");
        Criteria cr = new Criteria("refrigerator");
        cr.addCriteria("overallCapacity", "30");
        cr.addCriteria("powerConsumption", "100");
        Criteria cr1 = new Criteria("");
        cr1.addCriteria("height", "10");

        List<Appliance> search = service.findAppliance(cr);
        List<Appliance> search1 = service.findAppliance(cr1);

        PrintConsoleInfo.print(search);
        PrintConsoleInfo.print(search1);

        System.out.println("I can add appliance \n");

        Map<String, String> newRefMap = new HashMap<>();
        newRefMap.put("refrigerator", "");
        newRefMap.put("height", "200");
        newRefMap.put("width", "70");
        newRefMap.put("length", "10");
        newRefMap.put("weight", "20");
        newRefMap.put("freezerCapacity", "10");
        newRefMap.put("overallCapacity", "30");
        newRefMap.put("powerConsumption", "100");

        service.addAppliance(ApplianceCreator.createAppliance(newRefMap));

        System.out.println("My data base \n");

        PrintConsoleInfo.print(service.getApplianceList());
    }
}
