package fr.devavance.tp_springboot_mvc_jpa.beans;

import fr.devavance.tp_springboot_mvc_jpa.dao.Fonction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Employee implements Serializable {
    private String name;
    private String address;
    private String email;
    private String phone;
    private Fonction fonction;

    public Employee(String name, String address, String email, String phone, Fonction function) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fonction = function;
    }

    public Employee() {

    }
}
