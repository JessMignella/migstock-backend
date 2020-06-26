package com.migstok.stock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@Entity
public class UserSystem {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String login;
	private String pass;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserSystem that = (UserSystem) o;
		return id.equals(that.id) &&
				login.equals(that.login);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, login);
	}
}
