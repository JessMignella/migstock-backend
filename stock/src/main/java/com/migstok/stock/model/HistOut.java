package com.migstok.stock.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class HistOut {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateOut;

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
