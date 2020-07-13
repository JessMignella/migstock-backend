package com.migstok.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class HistIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateIn;

    private String typeEntry;

    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "id_respUser")
    private ResponsibleUser respUser;

    @ManyToOne
    @JoinColumn(name = "id_userSystem")
    private UserSystem userSystem;

}
