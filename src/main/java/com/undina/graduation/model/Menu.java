package com.undina.graduation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;


@NoArgsConstructor
@Entity
@Table(name = "menu")

public class Menu extends AbstractBaseEntity{
    @OneToOne
    @JoinColumn(name = "restaraunt_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Restaurant restaurant;

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDate date;


    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "menu")
    private Set<Dish> dishes;

    public Menu(Integer id, Restaurant restaurant, LocalDate date, Set<Dish> dishes) {
        super(id);
        this.restaurant = restaurant;
        this.date = date;
        this.dishes = dishes;
    }
}
