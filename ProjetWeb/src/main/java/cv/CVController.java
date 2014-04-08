package cv; /**
 * Created by larocxav on 01/04/14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/CV")
public class CVController {

    @RequestMapping(value="{nom}", method = RequestMethod.GET)
    public  @ResponseBody CV getCVInXML(@PathVariable String nom){
        CV cv = new CV(nom, "Arthur");

        return cv;
    }
}



