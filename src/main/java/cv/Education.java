package cv;

import java.util.Date;

/**
 * Created by larocxav on 08/04/14.
 */
public class Education {
    private Date dateDebut;
    private Date dateFin;
    private String diplome;
    private String ecole;

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Education(Date debut, Date fin, String diplome, String ecole){
        dateDebut=debut;
        dateFin=fin;
        this.diplome=diplome;
        this.ecole=ecole;
    }
}
