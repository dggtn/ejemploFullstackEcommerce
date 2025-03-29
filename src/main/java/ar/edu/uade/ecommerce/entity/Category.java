package ar.edu.uade.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String description;

    public Category(String description) {
        this.description = description;
    }

    public Category() {
    }
}
