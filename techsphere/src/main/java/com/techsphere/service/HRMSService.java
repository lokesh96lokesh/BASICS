package com.techsphere.service;

import com.techsphere.model.Employee;
import com.techsphere.model.Attendance;
import com.techsphere.model.Performance;
import com.techsphere.repository.EmployeeRepository;
import com.techsphere.repository.AttendanceRepository;
import com.techsphere.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HRMSService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private PerformanceRepository performanceRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Attendance markAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public Performance addPerformanceReview(Performance performance) {
        return performanceRepository.save(performance);
    }
}
