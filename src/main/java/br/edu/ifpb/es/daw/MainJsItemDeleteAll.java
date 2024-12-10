package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.joinedSubclass.ItemDAO;
import br.edu.ifpb.es.daw.dao.joinedSubclass.impl.ItemDAOImpl;
import br.edu.ifpb.es.daw.entities.joinedSubclass.Item;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class MainJsItemDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ItemDAO dao = new ItemDAOImpl(emf);
			List<Item> items = dao.getAll();
			for (Item item : items) {
				dao.delete(item.getId());
			}
		}
	}

}
