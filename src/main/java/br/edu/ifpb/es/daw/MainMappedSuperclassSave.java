package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.mappedSuperclass.FullTimeEmployeeDAO;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.PartTimeEmployeeDAO;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.impl.FullTimeEmployeeDAOImpl;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.impl.PartTimeEmployeeDAOImpl;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.Address;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.FullTimeEmployee;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.PartTimeEmployee;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class MainMappedSuperclassSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			FullTimeEmployeeDAO fullTimeEmployeeDAO = new FullTimeEmployeeDAOImpl(emf);
			PartTimeEmployeeDAO partTimeEmployeeDAO = new PartTimeEmployeeDAOImpl(emf);
		
			FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
			fullTimeEmployee.setEmail("email FullTimeEmployee");
			fullTimeEmployee.setFirstName("firstName FullTimeEmployee");
			fullTimeEmployee.setLastName("lastName FullTimeEmployee");
			fullTimeEmployee.setPhoneNumber("12345");
			fullTimeEmployee.setSalary(new BigDecimal("3000.0"));
			Address addressFullTimeEmployee = new Address();
			addressFullTimeEmployee.setStreet1("street1 FullTimeEmployee");
			addressFullTimeEmployee.setStreet2("street2 FullTimeEmployee");
			addressFullTimeEmployee.setZipcode("123456 FullTimeEmployee");
			addressFullTimeEmployee.setCity("city FullTimeEmployee");
			addressFullTimeEmployee.setCountry("country FullTimeEmployee");
			addressFullTimeEmployee.setState("state FullTimeEmployee");
			fullTimeEmployee.setAddress(addressFullTimeEmployee);
			
			PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
			partTimeEmployee.setEmail("email PartTimeEmployee");
			partTimeEmployee.setFirstName("firstName PartTimeEmployee");
			partTimeEmployee.setLastName("lastName PartTimeEmployee");
			partTimeEmployee.setPhoneNumber("67890");
			partTimeEmployee.setHourlyWage(new BigDecimal("50.0"));
			Address addressPartTimeEmployee = new Address();
			addressPartTimeEmployee.setStreet1("street1 PartTimeEmployee");
			addressPartTimeEmployee.setStreet2("street2 PartTimeEmployee");
			addressPartTimeEmployee.setZipcode("123456 PartTimeEmployee");
			addressPartTimeEmployee.setCity("city PartTimeEmployee");
			addressPartTimeEmployee.setCountry("country PartTimeEmployee");
			addressPartTimeEmployee.setState("state PartTimeEmployee");
			partTimeEmployee.setAddress(addressPartTimeEmployee);
			
			System.out.println(fullTimeEmployee);
			System.out.println(partTimeEmployee);
			
			fullTimeEmployeeDAO.save(fullTimeEmployee);
			partTimeEmployeeDAO.save(partTimeEmployee);
			
			System.out.println(fullTimeEmployee);
			System.out.println(partTimeEmployee);
		}
	}
}
