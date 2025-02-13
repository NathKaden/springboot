package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class EmployeeControleur {
    @Autowired
    private final IEmployeeDAO employeeDAO;

    public EmployeeControleur(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/employes")
    public String findAllEmployee(Model m){
        m.addAttribute("name",employeeDAO);
        return "view_employes";
    }
}
