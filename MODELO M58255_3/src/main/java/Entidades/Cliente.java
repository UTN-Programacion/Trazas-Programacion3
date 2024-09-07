package Entidades;

import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class Cliente {
    private String nombre;
    private Set<Pedido> pedidos = new HashSet<>();

    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public int cantidadPedidos() {
        return pedidos.size();
    }
}