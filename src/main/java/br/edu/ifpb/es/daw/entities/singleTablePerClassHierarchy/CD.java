package br.edu.ifpb.es.daw.entities.singleTablePerClassHierarchy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "CD_STPCH")
@DiscriminatorValue("C")
public class CD extends Item {

	private String musicCompany;

	private Integer numberOfCDs;

	private Float totalDuration;

	private String genre;

	public CD() {

	}

	public String getMusicCompany() {
		return musicCompany;
	}

	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}

	public Integer getNumberOfCDs() {
		return numberOfCDs;
	}

	public void setNumberOfCDs(Integer numberOfCDs) {
		this.numberOfCDs = numberOfCDs;
	}

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((musicCompany == null) ? 0 : musicCompany.hashCode());
		result = prime * result + ((numberOfCDs == null) ? 0 : numberOfCDs.hashCode());
		result = prime * result + ((totalDuration == null) ? 0 : totalDuration.hashCode());
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
		CD other = (CD) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (musicCompany == null) {
			if (other.musicCompany != null)
				return false;
		} else if (!musicCompany.equals(other.musicCompany))
			return false;
		if (numberOfCDs == null) {
			if (other.numberOfCDs != null)
				return false;
		} else if (!numberOfCDs.equals(other.numberOfCDs))
			return false;
		if (totalDuration == null) {
			if (other.totalDuration != null)
				return false;
		} else if (!totalDuration.equals(other.totalDuration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CD [musicCompany=" + musicCompany + ", numberOfCDs=" + numberOfCDs + ", totalDuration=" + totalDuration
				+ ", genre=" + genre + ", title=" + title + ", price=" + price + ", description=" + description + "]";
	}

}
