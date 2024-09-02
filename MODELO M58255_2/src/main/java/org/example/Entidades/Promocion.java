package org.example.Entidades;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;


@Data
public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private List<Articulo> articulos;
    private Imagen imagen;


    public Promocion(TipoPromocion tipoPromocion, Imagen imagen) {
        this.tipoPromocion = tipoPromocion;
        this.articulos = new HashSet<>();
        this.imagen = imagen;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public double calcularPrecioTotal() {
        return articulos.stream().mapToDouble(Articulo::getPrecio).sum();
    }
}
