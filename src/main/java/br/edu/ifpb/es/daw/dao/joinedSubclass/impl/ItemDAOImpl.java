package br.edu.ifpb.es.daw.dao.joinedSubclass.impl;

import br.edu.ifpb.es.daw.dao.impl.AbstractDAOImpl;
import br.edu.ifpb.es.daw.dao.joinedSubclass.ItemDAO;
import br.edu.ifpb.es.daw.entities.joinedSubclass.Item;
import jakarta.persistence.EntityManagerFactory;

public class ItemDAOImpl extends AbstractDAOImpl<Item, Long> implements ItemDAO {
    public ItemDAOImpl(EntityManagerFactory emf) {
        super(Item.class, emf);
    }

    protected String getEntityName() {
        return "Item_JS";
    }
}
