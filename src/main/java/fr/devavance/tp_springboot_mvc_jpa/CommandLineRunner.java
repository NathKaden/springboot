package fr.devavance.tp_springboot_mvc_jpa;

import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import fr.devavance.tp_springboot_mvc_jpa.enumeration.Fonction;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.ArrayList;

@Component
class InitDataRepository implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository employees;

    @Override
    public void run(String... strings) throws Exception {

        ArrayList<Employee> employees = new ArrayList<>();
        this.employees.save(new Employee("Karim Mahmoud","kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        this.employees.save(new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));
        this.employees.save(new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET));
        this.employees.save(new Employee("Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI));
        this.employees.save(new Employee("Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT));
        this.employees.save(new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI));
        this.employees.save(new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB));
        this.employees.save(new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS));

    }
}
