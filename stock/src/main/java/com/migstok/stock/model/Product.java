package com.migstok.stock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String model;
	@ManyToOne
	@JoinColumn(name = "id_type")
	private Type type;


	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", model='" + model + '\'' +
				", type=" + type.getNameType() +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id.equals(product.id) &&
				name.equals(product.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}
