package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Articulo {
    private String nombre;
    private double precio;
    private String unidadMedida;

}