package com.mgchoo.security2.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(Model model) {
        logger.info("login.do");
        
        return "auth/login";
    }

    @RequestMapping(value = "/login_failed.do", method = RequestMethod.GET)
    public String login_failed(Model model) {
        logger.info("login_failed.do");
        
        return "auth/login_failed";
    }

    @RequestMapping(value = "/logout.do", method = RequestMethod.GET)
    public String logout(Model model) {
        logger.info("logout.do");
        
        return "auth/logout";
    }

    @RequestMapping(value = "/login_duplicated.do", method = RequestMethod.GET)
    public String login_duplicated(Model model) {
        logger.info("login_duplicated.do");
        
        return "auth/login_duplicated";
    }
}
