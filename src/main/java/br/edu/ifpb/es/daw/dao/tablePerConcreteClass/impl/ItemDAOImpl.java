package br.edu.ifpb.es.daw.dao.tablePerConcreteClass.impl;

import br.edu.ifpb.es.daw.dao.impl.AbstractDAOImpl;
import br.edu.ifpb.es.daw.dao.tablePerConcreteClass.ItemDAO;
import br.edu.ifpb.es.daw.entities.tablePerConcreteClass.Item;
import jakarta.persistence.EntityManagerFactory;

public class ItemDAOImpl extends AbstractDAOImpl<Item, Long> implements ItemDAO {
    public ItemDAOImpl(EntityManagerFactory emf) {
        super(Item.class, emf);
    }

    protected String getEntityName() {
        return "Item_TPCC";
    }

}
