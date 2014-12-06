package com.kd.pack.model;

import javax.persistence.*;

import static javax.persistence.AccessType.*;
import static javax.persistence.GenerationType.*;

/**
 * Created by dima on 7.12.14.
 */
@Entity @Access(FIELD)
public class Employee {
    @GeneratedValue(strategy = IDENTITY)
    @Id Long id;

    String name;
    Address address;

    public Employee() {
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
