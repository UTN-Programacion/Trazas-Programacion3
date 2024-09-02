package org.example.Entidades;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
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
}
