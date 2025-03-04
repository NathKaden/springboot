package fr.devavance.tp_springboot_mvc_jpa.controller.implementation;

import fr.devavance.tp_springboot_mvc_jpa.controller.IEmployeeController;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/employee")
public class EmployeeControleur implements IEmployeeController {
    @Autowired
    private final IEmployeeRepository employee;

    public EmployeeControleur(IEmployeeRepository employee) {
        this.employee = employee;
    }

    @Override
    @GetMapping("/home")
    public String displayHome(Model m) {
        m.addAttribute("employees",employee.findAll());
        m.addAttribute("employee",new Employee());
        return "view_home";
    }

    @Override
    @PostMapping("/addemployee")
    public String addEmployee(Employee e) {
        employee.save(e);
        String num = String.valueOf(e.getId());
        return "redirect:/employee/"+num;
    }

    @Override
    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        model.addAttribute("employee",employee.findById(id));
        return "view_employee";
    }

    @RequestMapping
    public String findAllEmployee(Model m){
        m.addAttribute("employees",employee.findAll());
        m.addAttribute("employee",new Employee());
        return "view_home";
    }


}
