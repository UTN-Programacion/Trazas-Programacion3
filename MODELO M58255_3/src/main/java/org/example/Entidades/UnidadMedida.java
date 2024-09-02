package org.example.Entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UnidadMedida {
    private Long id;
    private String denominacion;
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
}
