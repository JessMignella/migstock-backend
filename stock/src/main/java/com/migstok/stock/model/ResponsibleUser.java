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
public class ResponsibleUser {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nickName;
	private String email;

	@Override
	public String toString() {
		return "ResponsibleUser{" +
				"id=" + id +
				", nickName='" + nickName + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ResponsibleUser that = (ResponsibleUser) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(nickName, that.nickName) &&
				Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nickName, email);
	}
}


