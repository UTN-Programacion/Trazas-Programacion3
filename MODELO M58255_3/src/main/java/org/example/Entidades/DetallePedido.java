// DetallePedido.java
package org.example.Entidades;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class DetallePedido {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Pedido pedido;
    private Articulo articulo;
}