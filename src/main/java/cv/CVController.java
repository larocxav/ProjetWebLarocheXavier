package cv; /**
 * Created by larocxav on 01/04/14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/CV")
public class CVController {

    @RequestMapping(value="{nom}", method = RequestMethod.GET)
    public  @ResponseBody CV getCVInXML(@PathVariable String nom){
        CV cv = new CV(nom, "Arthur");

        cv.setObjectif("Maître du monde");

        ArrayList<String> experiences = new ArrayList<String>();
        experiences.add("Portier");
        cv.setExperiencesPro(experiences);

        ArrayList<String> educations = new ArrayList<String>();
        educations.add("Université de harvard");
        cv.setEducations(educations);

        ArrayList<String> competences = new ArrayList<String>();
        competences.add("Aucune");
        cv.setCompetences(competences);

        return cv;
    }
}



