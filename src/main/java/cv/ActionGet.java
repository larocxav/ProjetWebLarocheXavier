package cv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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


    public ActionGet(InterfaceSwing interfaceSwing){
        super("get");
        this.interfaceSwing = interfaceSwing;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s ="";
        try {
            final URL url = new URL("http://projetweblarochexavier.solylok.cloudbees.net/CV/");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();


            while(inputStream.available() != 0){
                s += (char) inputStream.read();
            }


        } catch (MalformedURLException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
       interfaceSwing.getJTextArea().setText(s);

    }


}
