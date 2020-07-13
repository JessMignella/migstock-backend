package com.migstok.stock.repository;

import com.migstok.stock.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository <Item, Long> {

   abstract List<Item> findByProductName(String productName);
}
