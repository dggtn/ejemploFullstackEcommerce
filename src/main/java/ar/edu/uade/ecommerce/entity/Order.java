package ar.edu.uade.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long count;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

}
