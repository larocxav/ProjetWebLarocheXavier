package cv; /**
 * Created by larocxav on 01/04/14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/CV")
public class CVController {

    @RequestMapping(method = RequestMethod.GET)

    public
    @ResponseBody
    CV getCVInXML() {
        CV cv = new CV(1, "Guilmoto", "Arthur", "rien");

        cv.setObjectif("Rien");

        ArrayList<String> experiences = new ArrayList<String>();
        experiences.add("Portier");
        cv.setExperiencesPro(experiences);

        ArrayList<Education> educations = new ArrayList<Education>();
        Education education = new Education(new Date(188),new Date(789),"Bac","ICI");
        educations.add(education);
        cv.setEducations(educations);

        ArrayList<String> competences = new ArrayList<String>();
        competences.add("Aucune");
        cv.setCompetences(competences);

        ArrayList<String> langues = new ArrayList<String>();
        langues.add("Esperanto");
        langues.add("Français");
        cv.setLangues(langues);

        return cv;
    }
}



