package com.macrobiotica.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "carShop")
public class CarShop implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Long id_car;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

}
