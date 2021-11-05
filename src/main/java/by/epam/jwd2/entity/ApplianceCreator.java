package by.epam.jwd2.entity;

import java.util.Map;

public class ApplianceCreator {

    public static Appliance createAppliance(Map<String, String> createParams) {

        Appliance appliance;

        if (createParams.containsKey("refrigerator")) {
            appliance = createRefrigerator(createParams);
            return appliance;
        } else if (createParams.containsKey("speaker")) {
            appliance = createSpeaker(createParams);
            return appliance;
        } else if (createParams.containsKey("laptop")) {
            appliance = createLaptop(createParams);
            return appliance;
        } else if (createParams.containsKey("oven")) {
            appliance = createOven(createParams);
            return appliance;
        } else if (createParams.containsKey("vacuumCleaner")) {
            appliance = createVacuumCleaner(createParams);
            return appliance;
        }

        throw new RuntimeException("Unable to create appliance");
    }

    private static Appliance createRefrigerator(Map<String, String> createParams) {

        Refrigerator refrigerator = new Refrigerator();

        createParams.forEach((key, value) -> {

            switch (key) {
                case "refrigerator":
                    break;

                case "height":
                    refrigerator.setHeight(Double.parseDouble(value));
                    break;

                case "width":
                    refrigerator.setWidth(Double.parseDouble(value));
                    break;

                case "length":
                    refrigerator.setLength(Double.parseDouble(value));
                    break;

                case "weight":
                    refrigerator.setWeight(Double.parseDouble(value));
                    break;

                case "powerConsumption":
                    refrigerator.setPowerConsumption(Double.parseDouble(value));
                    break;

                case "freezerCapacity":
                    refrigerator.setFreezerCapacity(Double.parseDouble(value));
                    break;

                case "overallCapacity":
                    refrigerator.setOverallCapacity(Double.parseDouble(value));
                    break;

                default:
                    throw new RuntimeException("Unable to create appliance, there is no such parameter");
            }
        });

        return refrigerator;
    }

    private static Appliance createSpeaker(Map<String, String> createParams) {

        Speaker speaker = new Speaker();

        createParams.forEach((key, value) -> {

            switch (key) {
                case "speaker":
                    break;

                case "height":
                    speaker.setHeight(Double.parseDouble(value));
                    break;

                case "width":
                    speaker.setWidth(Double.parseDouble(value));
                    break;

                case "length":
                    speaker.setLength(Double.parseDouble(value));
                    break;

                case "weight":
                    speaker.setWeight(Double.parseDouble(value));
                    break;

                case "powerConsumption":
                    speaker.setPowerConsumption(Double.parseDouble(value));
                    break;

                case "numberOfSpeakers":
                    speaker.setNumberOfSpeakers(Integer.parseInt(value));
                    break;

                case "frequencyRange":
                    speaker.setFrequencyRange(Double.parseDouble(value));
                    break;

                case "cordLength":
                    speaker.setCordLength(Double.parseDouble(value));
                    break;

                default:
                    throw new RuntimeException("Unable to create appliance, there is no such parameter");
            }
        });

        return speaker;
    }

    private static Appliance createLaptop(Map<String, String> createParams) {

        Laptop laptop = new Laptop();

        createParams.forEach((key, value) -> {

            switch (key) {
                case "laptop":
                    break;

                case "height":
                    laptop.setHeight(Double.parseDouble(value));
                    break;

                case "width":
                    laptop.setWidth(Double.parseDouble(value));
                    break;

                case "length":
                    laptop.setLength(Double.parseDouble(value));
                    break;

                case "weight":
                    laptop.setWeight(Double.parseDouble(value));
                    break;

                case "powerConsumption":
                    laptop.setPowerConsumption(Double.parseDouble(value));
                    break;

                case "memoryRom":
                    laptop.setMemoryRom(Integer.parseInt(value));
                    break;

                case "systemMemory":
                    laptop.setSystemMemory(Integer.parseInt(value));
                    break;

                case "displayInchs":
                    laptop.setDisplayInchs(Integer.parseInt(value));
                    break;

                case "OS":
                    laptop.setOS(value);
                    break;

                default:
                    throw new RuntimeException("Unable to create appliance, there is no such parameter");
            }
        });

        return laptop;
    }

    private static Appliance createOven(Map<String, String> createParams) {

        Oven oven = new Oven();

        createParams.forEach((key, value) -> {

            switch (key) {
                case "oven":
                    break;

                case "height":
                    oven.setHeight(Double.parseDouble(value));
                    break;

                case "width":
                    oven.setWidth(Double.parseDouble(value));
                    break;

                case "length":
                    oven.setLength(Double.parseDouble(value));
                    break;

                case "weight":
                    oven.setWeight(Double.parseDouble(value));
                    break;

                case "powerConsumption":
                    oven.setPowerConsumption(Double.parseDouble(value));
                    break;

                default:
                    throw new RuntimeException("Unable to create appliance, there is no such parameter");
            }
        });

        return oven;
    }

    private static Appliance createVacuumCleaner(Map<String, String> createParams) {

        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        createParams.forEach((key, value) -> {

            switch (key) {
                case "vacuumCleaner":
                    break;

                case "height":
                    vacuumCleaner.setHeight(Double.parseDouble(value));
                    break;

                case "width":
                    vacuumCleaner.setWidth(Double.parseDouble(value));
                    break;

                case "length":
                    vacuumCleaner.setLength(Double.parseDouble(value));
                    break;

                case "weight":
                    vacuumCleaner.setWeight(Double.parseDouble(value));
                    break;

                case "powerConsumption":
                    vacuumCleaner.setPowerConsumption(Double.parseDouble(value));
                    break;

                default:
                    throw new RuntimeException("Unable to create appliance, there is no such parameter");
            }
        });

        return vacuumCleaner;
    }
}
