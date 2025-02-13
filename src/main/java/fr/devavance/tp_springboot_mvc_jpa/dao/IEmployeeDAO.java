package fr.devavance.tp_springboot_mvc_jpa.dao;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;

import java.util.ArrayList;

public interface IEmployeeDAO {

    public ArrayList<Employee> findAll();

    public void add(Employee employe);
}
