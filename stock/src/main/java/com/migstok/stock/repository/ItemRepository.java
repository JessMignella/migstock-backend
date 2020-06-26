package com.migstok.stock.repository;

import com.migstok.stock.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository <Item, Long> {
}
