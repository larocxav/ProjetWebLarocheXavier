package cv;

import javax.swing.*;
import java.awt.*;

/**
 * Created by larocxav on 06/05/14.
 */
public class InterfaceSwing extends JFrame {

       private JTextArea jTextArea;

       public InterfaceSwing(){
           super("Projet Web");
           BorderLayout borderLayout = new BorderLayout();
           setLayout(borderLayout);

           JButton buttonGet = new JButton(new ActionGet(this));
           add(buttonGet,BorderLayout.NORTH);

           JPanel panelAffichage = new JPanel();
           jTextArea = new JTextArea();
           jTextArea.setEditable(false);
           panelAffichage.add(jTextArea, BorderLayout.CENTER);
           add(panelAffichage);

           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           setSize(700, 700);
           setVisible(true);
       }

        public JTextArea getJTextArea(){
            return jTextArea;
        }

        public static void main(String args[]){
            new InterfaceSwing();
        }
}
