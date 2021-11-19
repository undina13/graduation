package com.undina.graduation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "dish")

public class Dish extends AbstractNamedEntity{
    @Column(name = "price")
    private int price;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    @JsonIgnore
    private Menu menu;

    public Dish(Integer id, String name, int price, Menu menu) {
        super(id, name);
        this.price = price;
        this.menu = menu;
    }

   }
