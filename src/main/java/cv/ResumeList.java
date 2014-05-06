package cv;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by larocxav on 06/05/14.
 */
@XmlRootElement(name="cv")
public class ResumeList {

    private List<CV> cv = new ArrayList<CV>();

    public List<CV> getCv(){
        return cv;
    }

    public void setCv(List<CV> cv){
        this.cv = cv;
    }

}
