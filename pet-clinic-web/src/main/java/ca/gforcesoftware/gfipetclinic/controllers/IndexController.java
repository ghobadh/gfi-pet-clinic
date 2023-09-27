package ca.gforcesoftware.gfipetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2023-09-26
 */
@Controller
public class IndexController {
    @RequestMapping({"","/","index", "index.html"})
    public String index(){
        return  "index";
    }
}
