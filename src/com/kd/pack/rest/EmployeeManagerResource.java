package com.kd.pack.rest;

import com.kd.pack.model.Address;
import com.kd.pack.model.Employee;
import com.kd.pack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by dima on 7.12.14.
 */
@Path("employees")
@Produces("application/json")
public class EmployeeManagerResource extends SpringAwareResource {
    @Autowired EmployeeRepository repo;

    @GET
    public List<Employee> getAllEmplyees() {
        return repo.getAllEmployees();
    }

    @POST
    public Employee createNewEmployee(@FormParam("name") String name, @FormParam("city") String city) {
        return repo.saveEmployee(new Employee(name, new Address(city)));
    }
}
