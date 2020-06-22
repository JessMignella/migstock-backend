package com.migstok.stock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

public enum StateItem {

    NEW(1, "New"),
    USED(2, "Used");

    private int idState;
    private String stateDescription;

    StateItem(int idState,String stateDescription) {
        this.idState = idState;
    }

    public int getIdState() {
        return idState;
    }

    public String getStateDescription() {
        return stateDescription;
    }
}
