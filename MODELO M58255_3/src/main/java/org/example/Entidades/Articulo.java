package org.example.Entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Integer tiempoEstimadoMinutos;
    @Builder.Default
    private Set<DetallePedido> detallesPedido = new HashSet<>();
    private Imagenes imagen;
    private UnidadMedida unidad;
}
