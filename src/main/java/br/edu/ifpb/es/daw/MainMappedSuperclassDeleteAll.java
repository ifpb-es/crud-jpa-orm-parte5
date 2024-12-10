package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.mappedSuperclass.FullTimeEmployeeDAO;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.PartTimeEmployeeDAO;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.impl.FullTimeEmployeeDAOImpl;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.impl.PartTimeEmployeeDAOImpl;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.FullTimeEmployee;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.PartTimeEmployee;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class MainMappedSuperclassDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			FullTimeEmployeeDAO fullTimeEmployeeDAO = new FullTimeEmployeeDAOImpl(emf);
			PartTimeEmployeeDAO partTimeEmployeeDAO = new PartTimeEmployeeDAOImpl(emf);

			List<FullTimeEmployee> fullTimeEmployees = fullTimeEmployeeDAO.getAll();
			for (FullTimeEmployee fullTimeEmployee : fullTimeEmployees) {
				fullTimeEmployeeDAO.delete(fullTimeEmployee.getId());
			}
			
			List<PartTimeEmployee> partTimeEmployees = partTimeEmployeeDAO.getAll();
			for (PartTimeEmployee partTimeEmployee : partTimeEmployees) {
				partTimeEmployeeDAO.delete(partTimeEmployee.getId());
			}
		}
	}
}
