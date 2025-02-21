package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeRepository;
import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class EmployeeControleur {
    @Autowired
    private final IEmployeeRepository employee;

    public EmployeeControleur(IEmployeeRepository employee) {
        this.employee = employee;
    }
    
    @RequestMapping("/addemployee")
    public String addEmployee(Employee e) {
        employee.save(e);
        return "redirect:/";
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model m){
        m.addAttribute("employees",employee.findAll());
        m.addAttribute("employee",new Employee());
        return "view_employees";
    }

    @RequestMapping("/")
    public String home(Model m){
        m.addAttribute("employees",employee.findAll());
        return "view_home";
    }
}
