package by.epam.jwd2.main;

import by.epam.jwd2.entity.Appliance;

import java.util.List;

/**
 * Print to console
 */
public class PrintConsoleInfo {

    /**
     * @param applianceList prints to console in a column
     */
    public static void print(List<Appliance> applianceList) {

        for (Appliance a :
                applianceList) {
            System.out.println(a);
        }
        System.out.println();
    }
}
