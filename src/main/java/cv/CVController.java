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
    List<CV> getCVInXML() {
        ArrayList<CV> cvs = new ArrayList<CV>();
        cvs.add(cv);
        cvs.add(cv2);
        cvs.add(cv3);

        return cvs;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    CV getCVById(@PathVariable int id){

        ArrayList<CV> cvs = new ArrayList<CV>();
        cvs.add(cv);
        cvs.add(cv2);
        cvs.add(cv3);

        return cvs.get(id);
    }
}



