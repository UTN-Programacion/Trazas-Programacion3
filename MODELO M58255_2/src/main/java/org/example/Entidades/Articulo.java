package org.example.Entidades;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedida;
    private List<Promocion> promociones;

//    @OneToOne
    @JoinColumn(name = "imagen_id")
    private Imagen imagen;

    protected Set<Imagen> imagenes = new HashSet<>();

    @ManyToOne
    protected UnidadMedida unidadMedida;
    @ManyToOne
    @JoinColumn(name = "categoria_id")

    private UnidadMedida unidadMedida;
}
