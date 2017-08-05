package com.wb3tech.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, produces = "text/html")
    public String HelloK8s(Map<String, Object> model){

        model.put("title", "K8s CI/CD");
        model.put("titlePageHeader", "Hello K8s!");
        model.put("titleSideNav", "WB3Tech");
        model.put("message", "Kubernetes, you rock!");

        return "hello-k8s";
    }
}
