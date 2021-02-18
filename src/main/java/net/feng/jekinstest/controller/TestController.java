package net.feng.jekinstest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController
{
    @RequestMapping(method = RequestMethod.GET,value = "/testPage")
    public String toTestPage() {return "testPage.html";}
}
