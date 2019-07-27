package com.mgchoo.security2.admin.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgchoo.security2.admin.entity.Admin;
import com.mgchoo.security2.admin.service.AdminService;

@Controller
public class AdminController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Resource
    private AdminService adminService;
    
    @RequestMapping(value="/admin/", method=RequestMethod.GET)
    public String detail(Model model) {
        Admin admin;
        
        logger.info("detail");
        
        admin = adminService.selectOne(1);
        
        model.addAttribute("admin", admin);
        
        return "admin/detail";
    }
}
