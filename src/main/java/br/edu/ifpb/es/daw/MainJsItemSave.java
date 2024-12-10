package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.joinedSubclass.ItemDAO;
import br.edu.ifpb.es.daw.dao.joinedSubclass.impl.ItemDAOImpl;
import br.edu.ifpb.es.daw.entities.joinedSubclass.Book;
import br.edu.ifpb.es.daw.entities.joinedSubclass.CD;
import br.edu.ifpb.es.daw.entities.joinedSubclass.Item;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MainJsItemSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ItemDAO dao = new ItemDAOImpl(emf);
			Item item = new Item();
			Book book = new Book();
			CD cd = new CD();

			item.setDescription("descrição do item");
			item.setPrice(10.0f);
			item.setTitle("título do item");
			
			book.setDescription("descrição do livro");
			book.setPrice(115.0f);
			book.setTitle("título do livro");
			book.setIsbn("1234567891234");
			book.setPublisher("Apress");
			book.setNbOfPage(537);
			book.setIllustrations(true);
			
			cd.setDescription("descrição do CD");
			cd.setPrice(25.0f);
			cd.setTitle("título do CD");
			cd.setMusicCompany("Som Livre");
			cd.setNumberOfCDs(10);
			cd.setTotalDuration(60.0f);
			cd.setGenre("Bossa Nova");

			System.out.println(item);
			System.out.println(book);
			System.out.println(cd);

			dao.save(item);
			dao.save(book);
			dao.save(cd);

			System.out.println(item);
			System.out.println(book);
			System.out.println(cd);
		}
	}

}