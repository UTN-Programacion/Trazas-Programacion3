package org.example.Entidades;
import lombok.Data;
import java.util.List;


@Data
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private UnidadMedida unidadMedida;
    private List<Promocion> promociones;
}
