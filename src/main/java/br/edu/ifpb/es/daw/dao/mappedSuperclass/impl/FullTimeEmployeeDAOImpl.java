package br.edu.ifpb.es.daw.dao.mappedSuperclass.impl;

import br.edu.ifpb.es.daw.dao.impl.AbstractDAOImpl;
import br.edu.ifpb.es.daw.dao.mappedSuperclass.FullTimeEmployeeDAO;
import br.edu.ifpb.es.daw.entities.mappedSuperclass.FullTimeEmployee;
import jakarta.persistence.EntityManagerFactory;

public class FullTimeEmployeeDAOImpl extends AbstractDAOImpl<FullTimeEmployee, Long> implements FullTimeEmployeeDAO {
    public FullTimeEmployeeDAOImpl(EntityManagerFactory emf) {
        super(FullTimeEmployee.class, emf);
    }
}
