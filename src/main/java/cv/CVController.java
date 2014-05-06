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
import java.util.List;

@Controller
@RequestMapping("/CV")
public class CVController {


    CV cv = new CV(1, "Guilmoto", "Arthur", "rien");
    CV cv2 = new CV(2, "James", "Bob", "plein de trucs");
    CV cv3 = new CV(3, "John", "Flint", "plein ");

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    ResumeList getCVInXML() {
        ResumeList resumeList = new ResumeList();
        resumeList.cv.add(cv);
        resumeList.cv.add(cv2);
        resumeList.cv.add(cv3);

        return resumeList;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    CV getCVInXML(@PathVariable int id){

        ResumeList resumeList = new ResumeList();
        resumeList.cv.add(cv);
        resumeList.cv.add(cv2);
        resumeList.cv.add(cv3);

        return resumeList.cv.get(id);
    }
}



