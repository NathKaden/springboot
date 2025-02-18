package fr.devavance.tp_springboot_mvc_jpa;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.data.repository.CrudRepository;

public abstract class IEmployeeRepository implements CrudRepository<Employee, Long> {

}
