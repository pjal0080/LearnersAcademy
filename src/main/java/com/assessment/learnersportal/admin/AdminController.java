package com.assessment.learnersportal.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(path = "/dashboard")
    public String adminDashboard(){

        return "admin_dashboard";

    }




}
