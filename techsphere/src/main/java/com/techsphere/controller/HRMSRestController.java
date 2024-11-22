package com.techsphere.controller;

import com.techsphere.model.Employee;
import com.techsphere.model.Attendance;
import com.techsphere.model.Performance;
import com.techsphere.service.HRMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hrms")
public class HRMSRestController {

    @Autowired
    private HRMSService hrmsService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return hrmsService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return hrmsService.addEmployee(employee);
    }

    @PostMapping("/attendance")
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return hrmsService.markAttendance(attendance);
    }

    @PostMapping("/performance")
    public Performance addPerformance(@RequestBody Performance performance) {
        return hrmsService.addPerformanceReview(performance);
    }
}
