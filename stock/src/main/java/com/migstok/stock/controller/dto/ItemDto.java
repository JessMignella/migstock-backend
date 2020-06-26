package com.migstok.stock.controller.dto;

import com.migstok.stock.model.Item;
import com.migstok.stock.model.Product;
import com.migstok.stock.model.StateItem;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@EqualsAndHashCode
public class ItemDto {
    private Long id;
    private Product product;
    private String itemCode;
    private Double cost;
    private StateItem state;
    private Integer quantity;

    public ItemDto(Long id, Product product, String itemCode, Double cost, StateItem state, Integer quantity) {
        this.id = id;
        this.product = product;
        this.itemCode = itemCode;
        this.cost = cost;
        this.state = state;
        this.quantity = quantity;
    }

    public ItemDto() {
    }

    public ItemDto(Item item) {
        this.id = item.getId();
        this.product = item.getProduct();
        this.itemCode = item.getItemCode();
        this.cost = item.getCost();
        this.state = item.getState();
    }

    public static List<ItemDto> converter(List<Item> items) {
        /**  List<ItemDto> itemDtoList = new ArrayList<>();
         for(Item item: items){
         itemDtoList.add(new ItemDto(item));
         }
         return  itemDtoList; **/
        return items.stream().map(ItemDto::new).collect(Collectors.toList());
    }

}
