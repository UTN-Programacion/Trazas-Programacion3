package org.example;

import Entidades.Articulo;
import Entidades.Cliente;
import Entidades.Pedido;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Crear artículos
        Articulo pizzaGrandeHawaiana = new Articulo("Pizza grande Hawaiana", 10.0, "8 porciones");
        Articulo pizzaChicaHawaiana = new Articulo("Pizza chica Hawaiana", 7.0, "4 porciones");
        Articulo pizzaGrandeNapolitana = new Articulo("Pizza grande Napolitana", 10.0, "8 porciones");
        Articulo pizzaChicaNapolitana = new Articulo("Pizza chica Napolitana", 7.0, "4 porciones");
        Articulo cervezaQuilmes = new Articulo("Cerveza Quilmes", 5.0, "1 litro");
        Articulo cervezaAndes = new Articulo("Cerveza Andes", 5.0, "1 litro");

        // Crear clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Cliente 1");

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Cliente 2");

        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Cliente 3");

        // Realizar pedidos
        Pedido pedido1 = new Pedido(cliente1, new HashSet<>(), 0);
        pedido1.agregarArticulo(pizzaGrandeHawaiana);
        pedido1.agregarArticulo(cervezaQuilmes);
        cliente1.realizarPedido(pedido1);
        pedido1.mostrarPedido();

        Pedido pedido2 = new Pedido(cliente2, new HashSet<>(), 0);
        pedido2.agregarArticulo(cervezaQuilmes);
        pedido2.agregarArticulo(pizzaChicaHawaiana);
        cliente2.realizarPedido(pedido2);
        pedido2.mostrarPedido();

        Pedido pedido3 = new Pedido(cliente3, new HashSet<>(), 0);
        pedido3.agregarArticulo(pizzaGrandeHawaiana);
        pedido3.agregarArticulo(pizzaGrandeNapolitana);
        pedido3.agregarArticulo(cervezaAndes);
        cliente3.realizarPedido(pedido3);
        pedido3.mostrarPedido();

        // Mostrar la cantidad de compras del cliente1
        System.out.println("El cliente1 ha realizado " + cliente1.cantidadPedidos() + " compras.");
    }
}