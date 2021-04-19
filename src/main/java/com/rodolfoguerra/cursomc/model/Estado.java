package com.rodolfoguerra.cursomc.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Estado implements Serializable {

    private static final long serialVersionUID = -1944382683852798814L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "estado")
    private List<City> cities = new ArrayList<>();
}
