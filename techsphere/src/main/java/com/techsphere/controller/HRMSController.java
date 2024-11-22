package com.techsphere.controller;

import com.techsphere.model.Employee;
import com.techsphere.model.Attendance;
import com.techsphere.model.Performance;
import com.techsphere.service.HRMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hrms")
public class HRMSController {

    @Autowired
    private HRMSService hrmsService;

    @GetMapping("/employees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", hrmsService.getAllEmployees());
        return "hrms/employees";
    }

    @PostMapping("/employee")
    public String addEmployee(@ModelAttribute Employee employee) {
        hrmsService.addEmployee(employee);
        return "redirect:/hrms/employees";
    }

    @PostMapping("/attendance")
    public String markAttendance(@ModelAttribute Attendance attendance) {
        hrmsService.markAttendance(attendance);
        return "redirect:/hrms/attendance";
    }

    @PostMapping("/performance")
    public String addPerformance(@ModelAttribute Performance performance) {
        hrmsService.addPerformanceReview(performance);
        return "redirect:/hrms/performance";
    }
}
