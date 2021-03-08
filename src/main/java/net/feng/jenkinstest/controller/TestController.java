package net.feng.jenkinstest.controller;

import net.feng.jenkinstest.service.interfaces.IBlankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController
{

//    @Autowired
//    IBlankService blankService;

    @RequestMapping(method = RequestMethod.GET,value = "/toTestPage")
    public String toTestPage() {return "testPage";}
}
