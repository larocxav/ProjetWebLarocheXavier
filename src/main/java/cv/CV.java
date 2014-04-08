package cv;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by larocxav on 01/04/14.
 */

@XmlRootElement(name = "cv")

public class CV {
    String nom;
    String prenom;
   // String Objectif;
    //Date dateNaissance;

    public CV(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public CV() {
    }

    public String getNom() {
        return nom;
    }

    @XmlElement
    public void setNom(String prenom) {
        this.nom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /*public String getObjectif() { return Objectif; }

    public void setObjectif(String objectif) {
        Objectif = objectif;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }*/
}
