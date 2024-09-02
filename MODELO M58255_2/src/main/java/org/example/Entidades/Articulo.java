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

    public Articulo(String nombre, String imagen, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }
}
