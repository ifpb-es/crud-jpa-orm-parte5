package br.edu.ifpb.es.daw.entities.mappedSuperclass;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "FULL_TIME_EMPLOYEES")
@AttributeOverride(
		name = "id", 
		column = @Column(name="ID_FULL_TIME_EMPLOYEE")
)
public class FullTimeEmployee extends Employee {

	private BigDecimal salary;

	public FullTimeEmployee() {

	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		FullTimeEmployee other = (FullTimeEmployee) obj;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", toString()=" + super.toString() + "]";
	}

}
