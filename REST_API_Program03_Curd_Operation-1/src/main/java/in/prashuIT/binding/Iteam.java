package in.prashuIT.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Iteam_tbl")
public class Iteam {
	
	@Id
	private Integer id;
	private String name;
	private Double price;
	private Integer qunt;
	
	public Iteam() {
		
	}
	
	public Iteam(Integer id, String name, Double price, Integer qunt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qunt = qunt;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQunt() {
		return qunt;
	}
	public void setQunt(Integer qunt) {
		this.qunt = qunt;
	}
	@Override
	public String toString() {
		return "Iteam [id=" + id + ", name=" + name + ", price=" + price + ", qunt=" + qunt + "]";
	}
	
	

}
