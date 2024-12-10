package br.edu.ifpb.es.daw.entities.tablePerConcreteClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Book_TPCC")
@Table(name = "TPCC_BOOKS")
public class Book extends Item {

	private String isbn;

	private String publisher;

	private Integer nbOfPage;

	private Boolean illustrations;

	public Book() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public Boolean getIllustrations() {
		return illustrations;
	}

	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((illustrations == null) ? 0 : illustrations.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nbOfPage == null) ? 0 : nbOfPage.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (illustrations == null) {
			if (other.illustrations != null)
				return false;
		} else if (!illustrations.equals(other.illustrations))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (nbOfPage == null) {
			if (other.nbOfPage != null)
				return false;
		} else if (!nbOfPage.equals(other.nbOfPage))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", publisher=" + publisher + ", nbOfPage=" + nbOfPage + ", illustrations="
				+ illustrations + ", title=" + title + ", price=" + price + ", description=" + description + "]";
	}
}
