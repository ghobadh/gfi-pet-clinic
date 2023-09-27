package ca.gforcesoftware.gfipetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gavinhashemi on 2023-09-27
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index", "/index.html"})
    public String ownerList(){
        return "owners/index";
    }
}
