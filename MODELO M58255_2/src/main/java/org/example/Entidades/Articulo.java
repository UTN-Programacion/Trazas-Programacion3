package org.example.Entidades;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private String codigo;

    private List<Promocion> promociones;
    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;

   
    @JoinColumn(name = "imagen_id")
    private Imagen imagen;

    protected Set<Imagen> imagenes=new HashSet<>();

  /*  @ManyToOne
    protected UnidadMedida unidadMedida;
   */

    @ManyToOne
    @JoinColumn(name = "unidad_id")
    private UnidadMedida unidadMedida;


}