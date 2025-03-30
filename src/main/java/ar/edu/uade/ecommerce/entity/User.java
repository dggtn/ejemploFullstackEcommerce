package ar.edu.uade.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String name;


    @Column
    private String surname;
    @OneToMany
    private List<Order> orders;

}
