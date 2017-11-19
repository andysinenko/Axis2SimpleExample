package ua.kiev.sinenko;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.builder.StAXBuilder;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayInputStream;

public class AxiomTest {
    public static void main(String[] args) throws XMLStreamException {
        String xmlString = "<book>" +
                "<name>Qucik-start Axis</name>" +
                "<isbn>978-1-84719-286-8</isbn>" +
                "</book>";
        ByteArrayInputStream xmlStream = new ByteArrayInputStream(xmlString.getBytes());
        StAXBuilder builder = new StAXOMBuilder(xmlStream);
        OMElement root = builder.getDocumentElement();
        System.out.println(root.toString());

        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace sin = factory.createOMNamespace("sin", "ns");
        OMElement root1 = factory.createOMElement("book", sin);
        OMElement name = factory.createOMElement("name", sin);
        name.setText("Qucik-start Axis");
        OMElement isbn = factory.createOMElement("isbn", sin);
        isbn.setText("978-1-84719-286-8");
        root1.addChild(name);
        root1.addChild(isbn);
        System.out.println(root1.toString());
    }
}
