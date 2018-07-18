package it.weeg.billing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class HomeController {
    final static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model, Principal principal){
        logger.info("calling /index");
        model.addAttribute("nome", principal!=null?principal.getName():"");
        return "index";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String version(){
        logger.info("calling /welcome");
        return "welcome";
    }

}
