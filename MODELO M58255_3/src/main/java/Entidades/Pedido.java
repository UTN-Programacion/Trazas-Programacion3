package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Cliente cliente;
    private Set<Articulo> articulos = new HashSet<>();
    private double total;

    // Método para agregar un artículo y sumar su precio al total
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
        total += articulo.getPrecio(); // Asegúrate de que getPrecio() esté bien definido en Articulo
    }

    // Método para mostrar el pedido
    public void mostrarPedido() {
        System.out.println("Pedido del Cliente: " + cliente.getNombre()); // Asegúrate de que Cliente tenga setNombre() y getNombre()
        articulos.forEach(articulo -> System.out.println(articulo.getNombre() + " - $" + articulo.getPrecio())); // getNombre() y getPrecio() deberían funcionar bien con Lombok
        System.out.println("Total a pagar: $" + total);
    }
}
