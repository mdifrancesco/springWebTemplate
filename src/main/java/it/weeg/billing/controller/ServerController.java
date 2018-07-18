package it.weeg.billing.controller;

import it.weeg.billing.service.ServerService;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/server")
public class ServerController {
    final static Logger logger = LoggerFactory.getLogger(ServerController.class);

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ServerService serverService;


    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Map<String, String> version() {
        logger.info("calling version");

        Map<String, String> infos = new HashMap<>();

        infos.put("application", applicationContext.getApplicationName());
        infos.put("version", serverService.version);
        infos.put("startup", new DateTime(applicationContext.getStartupDate()).toString());
        infos.put("frameworks", String.join(",", serverService.frameworks));
        return infos;
    }
}
