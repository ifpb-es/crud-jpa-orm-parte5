package br.edu.ifpb.es.daw.dao.mappedSuperclass.impl;

import br.edu.ifpb.es.daw.dao.impl.AbstractDAOImpl;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.PartTimeEmployeeDAO;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.PartTimeEmployee;
import jakarta.persistence.EntityManagerFactory;

public class PartTimeEmployeeDAOImpl extends AbstractDAOImpl<PartTimeEmployee, Long> implements PartTimeEmployeeDAO {
    public PartTimeEmployeeDAOImpl(EntityManagerFactory emf) {
        super(PartTimeEmployee.class, emf);
    }
}
