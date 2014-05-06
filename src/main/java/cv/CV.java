package cv;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by larocxav on 01/04/14.
 */

@XmlRootElement(name = "cv")

public class CV {
    int id;
    String nom;
    String prenom;
    String objectif;
    List<Education> educations;
    List<String> experiencesPro;
    List<String> competences;
    List<String> langues;

    public CV(int id,String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public CV() {
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public String getObjectif() {
        return objectif;
    }

    @XmlElement
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public List<Education> getEducations() {
        return educations;
    }

    @XmlElement
    public void setEducations(List<Education> educations) {
        educations = educations;
    }

    public List<String> getExperiencesPro() {
        return experiencesPro;
    }

    @XmlElement
    public void setExperiencesPro(List<String> experiencesPro) {
        experiencesPro = experiencesPro;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public List<String> getLangues() {
        return langues;
    }

    @XmlElement
    public void setLangues(List<String> langues) {
        this.langues = langues;
    }

    @XmlElement
    public void setCompetences(List<String> competences) {
        competences = competences;
    }
}
