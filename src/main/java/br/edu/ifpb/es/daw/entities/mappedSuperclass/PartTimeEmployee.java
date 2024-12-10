package br.edu.ifpb.es.daw.entities.mappedSuperclass;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "PART_TIME_EMPLOYEES")
@AssociationOverride(
		name="address", 
		joinColumns = @JoinColumn(name="ADDR_ID")
)
public class PartTimeEmployee extends Employee {

	private BigDecimal hourlyWage;

	public PartTimeEmployee() {

	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(BigDecimal hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hourlyWage == null) ? 0 : hourlyWage.hashCode());
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
		PartTimeEmployee other = (PartTimeEmployee) obj;
		if (hourlyWage == null) {
			if (other.hourlyWage != null)
				return false;
		} else if (!hourlyWage.equals(other.hourlyWage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyWage=" + hourlyWage + ", toString()=" + super.toString() + "]";
	}

}
