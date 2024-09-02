package org.example.Entidades;

import lombok.*;
import org.example.Enums.Estado;
import org.example.Enums.FormaPago;
import org.example.Enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Pedido {
    private Long id;
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Cliente cliente;
    @Builder.Default
    private Set<DetallePedido> detalles =  new HashSet<>();
}
