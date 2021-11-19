package com.undina.graduation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor

@Entity
@Table(name = "restaraunt")
public class Restaurant extends AbstractNamedEntity{

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
//    private List<Menu> listMenu;

//    public Restaurant(Integer id, String name, List<Menu> listMenu) {
//        super(id, name);
//        this.listMenu = listMenu;
//    }
}
