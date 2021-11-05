package by.epam.jwd2.dao.impl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Jaxb parser
 */
public class ApplianceXmlParser {

    final static File fileXML = new File("src/main/resources/appliances.xml");
    private static JAXBContext context;

    /**
     * @return object from XML
     */
    public static ApplianceJaxbObject parseXML() {

        try {
            context = JAXBContext.newInstance(ApplianceJaxbObject.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            return (ApplianceJaxbObject) unmarshaller.unmarshal(fileXML);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return new ApplianceJaxbObject();
    }

    /**
     * @param jaxbObject object to save in XML
     */
    public static void saveToXML(ApplianceJaxbObject jaxbObject) {

        try {
            context = JAXBContext.newInstance(ApplianceJaxbObject.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(jaxbObject, fileXML);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
