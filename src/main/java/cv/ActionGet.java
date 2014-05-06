package cv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;



/**
 * Created by larocxav on 06/05/14.
 */
public class ActionGet extends AbstractAction {

    private InterfaceSwing interfaceSwing;
    private Service service;
    private JAXBContext jc;

    private static final QName qname = new QName("", "");
    private static final String url = "http://projetweblarochexavier.solylok.cloudbees.net/CV/Bob";

    public ActionGet(InterfaceSwing interfaceSwing){
        super("get");
        this.interfaceSwing = interfaceSwing;
        try {
            jc = JAXBContext.newInstance(CV.class);
        } catch (JAXBException je) {
            System.out.println("Cannot create JAXBContext " + je);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        service = Service.create(qname);
        service.addPort(qname, HTTPBinding.HTTP_BINDING, url);
        Dispatch<Source> dispatcher = service.createDispatch(qname,
                Source.class, Service.Mode.MESSAGE);
        Map<String, Object> requestContext = dispatcher.getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_METHOD, "GET");

        Source result = null;
        try {
            result = dispatcher.invoke(new JAXBSource(jc, new CV()));
        } catch (JAXBException e1) {
            e1.printStackTrace();
        }


    }

    public void printSource(Source s) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(s, new StreamResult(System.out));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
