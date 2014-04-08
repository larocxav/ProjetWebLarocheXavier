package cv;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by larocxav on 01/04/14.
 */

@XmlRootElement(name = "cv")

public class CV {
    String nom;
    String prenom;
    String objectif;
    List<String> Educations;
    List<String> ExperiencesPro;
    List<String> Competences;

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

    public String getObjectif() {
        return objectif;
    }

    @XmlElement
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public List<String> getEducations() {
        return Educations;
    }

    @XmlElement
    public void setEducations(List<String> educations) {
        Educations = educations;
    }

    public List<String> getExperiencesPro() {
        return ExperiencesPro;
    }

    @XmlElement
    public void setExperiencesPro(List<String> experiencesPro) {
        ExperiencesPro = experiencesPro;
    }

    public List<String> getCompetences() {
        return Competences;
    }

    @XmlElement
    public void setCompetences(List<String> competences) {
        Competences = competences;
    }
}
