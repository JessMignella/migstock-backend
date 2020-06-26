package com.migstok.stock.controller;

import com.migstok.stock.controller.dto.ItemDto;
import com.migstok.stock.model.Item;
import com.migstok.stock.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/listItems")
    public List<ItemDto> listItems() {
        return ItemDto.converter(itemRepository.findAll());
    }
}
