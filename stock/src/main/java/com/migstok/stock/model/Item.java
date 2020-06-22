package com.migstok.stock.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Product product;
	private String itemCode;
	private Double cost;
	@Enumerated(EnumType.STRING)
	private StateItem state;

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", product=" + product +
				", itemCode='" + itemCode + '\'' +
				", cost=" + cost +
				", state=" + state +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(id, item.id) &&
				Objects.equals(product, item.product) &&
				Objects.equals(itemCode, item.itemCode) &&
				state == item.state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, product, itemCode, state);
	}
}
