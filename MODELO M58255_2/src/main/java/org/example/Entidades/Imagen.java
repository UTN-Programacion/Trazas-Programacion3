package org.example.Entidades;

import lombok.Data;
import java.util.List;


@Data
public class Imagen {
    private Long id;
    private String denominacion;
    private List<Promocion> promociones;
}
