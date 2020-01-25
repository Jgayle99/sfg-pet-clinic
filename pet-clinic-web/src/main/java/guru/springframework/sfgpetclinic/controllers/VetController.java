package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Joel Gayle on 25 Jan, 2020
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/index","/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
