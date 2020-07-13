package com.migstok.stock.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private  String description;

	@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	private Set<UserSystem> users = new HashSet<>();

}
