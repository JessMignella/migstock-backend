package com.migstok.stock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "role_users",
			joinColumns = {
					@JoinColumn(name = "id_role", referencedColumnName = "id_role", nullable = false, updatable = false)},
			inverseJoinColumns = {
					@JoinColumn(name = "id_userSystem", referencedColumnName = "id_userSystem", nullable = false, updatable = false)})
	private Set<Roles> roles = new HashSet<>();

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
