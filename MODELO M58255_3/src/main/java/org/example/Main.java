package org.example;

import org.example.Entidades.*;
import org.example.Repositorios.InMemoryRepository;

import java.net.UnixDomainSocketAddress;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Repositorios Relevantes que podrian luego listarse
        InMemoryRepository<Cliente> clienteRepository = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesRepository = new InMemoryRepository<>();
        InMemoryRepository<Pedido> pedidoRepository = new InMemoryRepository<>();

        Cliente cliente1 = Cliente.builder()
                .nombre("Juan")
                .apellido("Perez")
                .telefono("123456789")
                .email("example1@ej.com")
                .build();
        Cliente cliente2 = Cliente.builder()
                .nombre("Maria")
                .apellido("Gomez")
                .telefono("987654321")
                .email("example2@ej.com")
                .build();
        Cliente cliente3 = Cliente.builder()
                .nombre("Pedro")
                .apellido("Gonzalez")
                .telefono("456789123")
                .email("example3@ej.com")
                .build();

        UnidadMedida porciones8 = UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();
        UnidadMedida porciones4 = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();
        UnidadMedida litro = UnidadMedida.builder()
                .denominacion("1 litro")
                .build();

        //Pizzas Chicas
        Imagenes imagen1 = Imagenes.builder()
                .nombre("imagen1")
                .url("url1")
                .build();
        Imagenes imagen2 = Imagenes.builder()
                .nombre("imagen2")
                .url("url2")
                .build();
        Imagenes imagen3 = Imagenes.builder()
                .nombre("imagen3")
                .url("url3")
                .build();
        //Pizzas Grandes
        Imagenes imagen4 = Imagenes.builder()
                .nombre("imagen4")
                .url("url4")
                .build();
        Imagenes imagen5 = Imagenes.builder()
                .nombre("imagen5")
                .url("url5")
                .build();
        Imagenes imagen6 = Imagenes.builder()
                .nombre("imagen6")
                .url("url6")
                .build();
        //Bebidas
        Imagenes imagen7 = Imagenes.builder()
                .nombre("imagen7")
                .url("url7")
                .build();
        Imagenes imagen8 = Imagenes.builder()
                .nombre("imagen8")
                .url("url8")
                .build();

        Articulo pizzaGrandeHawaiana = Articulo.builder()
                .denominacion("Pizza Hawaiana Grande")
                .precioVenta(500.0)
                .precioCompra(250.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(30)
                .unidad(porciones8)
                .imagen(imagen1)
                .build();
        Articulo pizzaChicaHawaiana = Articulo.builder()
                .denominacion("Pizza Hawaiana Chica")
                .precioVenta(300.0)
                .precioCompra(150.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(20)
                .unidad(porciones4)
                .imagen(imagen4)
                .build();
        Articulo pizzaGrandeNapolitana = Articulo.builder()
                .denominacion("Pizza Napolitana Grande")
                .precioVenta(500.0)
                .precioCompra(250.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(30)
                .unidad(porciones8)
                .imagen(imagen2)
                .build();
        Articulo pizzaChicaNapolitana = Articulo.builder()
                .denominacion("Pizza Napolitana Chica")
                .precioVenta(300.0)
                .precioCompra(150.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(20)
                .unidad(porciones4)
                .imagen(imagen5)
                .build();
        Articulo pizzaGrandeMuzza = Articulo.builder()
                .denominacion("Pizza Muzza Grande")
                .precioVenta(500.0)
                .precioCompra(250.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(30)
                .unidad(porciones8)
                .imagen(imagen3)
                .build();
        Articulo pizzaChicaMuzza = Articulo.builder()
                .denominacion("Pizza Muzza Chica")
                .precioVenta(300.0)
                .precioCompra(150.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(20)
                .unidad(porciones4)
                .imagen(imagen6)
                .build();
        Articulo cervezaAndes = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(100.0)
                .precioCompra(50.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(0)
                .unidad(litro)
                .imagen(imagen7)
                .build();
        Articulo cervezaQuilmes = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(100.0)
                .precioCompra(50.0)
                .stockActual(10)
                .stockMaximo(20)
                .tiempoEstimadoMinutos(0)
                .unidad(litro)
                .imagen(imagen8)
                .build();

        //Repositorios
        clienteRepository.save(cliente1);
        clienteRepository.save(cliente2);
        clienteRepository.save(cliente3);

        unidadMedidaRepository.save(porciones8);
        unidadMedidaRepository.save(porciones4);
        unidadMedidaRepository.save(litro);

        imagenesRepository.save(imagen1);
        imagenesRepository.save(imagen2);
        imagenesRepository.save(imagen3);
        imagenesRepository.save(imagen4);
        imagenesRepository.save(imagen5);
        imagenesRepository.save(imagen6);
        imagenesRepository.save(imagen7);
        imagenesRepository.save(imagen8);

        articuloRepository.save(pizzaGrandeHawaiana);
        articuloRepository.save(pizzaChicaHawaiana);
        articuloRepository.save(pizzaGrandeNapolitana);
        articuloRepository.save(pizzaChicaNapolitana);
        articuloRepository.save(pizzaGrandeMuzza);
        articuloRepository.save(pizzaChicaMuzza);
        articuloRepository.save(cervezaAndes);
        articuloRepository.save(cervezaQuilmes);

        //Cliente 1
        DetallePedido detallePedido1 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaGrandeHawaiana.getPrecioVenta())
                .articulo(pizzaGrandeHawaiana)
                .build();
        DetallePedido detallePedido2 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(cervezaQuilmes.getPrecioVenta())
                .articulo(cervezaQuilmes)
                .build();
        Pedido pedido1 = Pedido.builder()
                .cliente(cliente1)
                .fechaPedido(java.time.LocalDate.now())
                .horaEstimadaFinalizacion(java.time.LocalTime.now())
                .total(detallePedido1.getSubTotal() + detallePedido2.getSubTotal())
                .totalCosto(pizzaGrandeHawaiana.getPrecioCompra() + cervezaQuilmes.getPrecioCompra())
                .detalles(Set.of(detallePedido1, detallePedido2))
                .build();
        cliente1.getHace().add(pedido1);

        System.out.println("Pedido 1" +
                "\nCliente: " + pedido1.getCliente().getNombre() + " " + pedido1.getCliente().getApellido() +
                "\nFecha de pedido: " + pedido1.getFechaPedido() +
                "\nHora estimada de finalización: " + pedido1.getHoraEstimadaFinalizacion() +
                "\nDetalle del pedido: " +
                "\n" + detallePedido1.getArticulo().getDenominacion() + " x" + detallePedido1.getCantidad() + " = " + detallePedido1.getSubTotal() +
                "\n" + detallePedido2.getArticulo().getDenominacion() + " x" + detallePedido2.getCantidad() + " = " + detallePedido2.getSubTotal() +
                "\n-----------------------------" +
                "\nTotal a pagar: " + pedido1.getTotal() +
                "\n/////////////////////////////" );

        //Cliente 2
        DetallePedido detallePedido3 = DetallePedido.builder()
                .cantidad(3)
                .subTotal(cervezaQuilmes.getPrecioVenta() * 3)
                .articulo(cervezaQuilmes)
                .build();
        DetallePedido detallePedido4 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaChicaHawaiana.getPrecioVenta())
                .articulo(pizzaChicaHawaiana)
                .build();
        Pedido pedido2 = Pedido.builder()
                .cliente(cliente2)
                .fechaPedido(java.time.LocalDate.now())
                .horaEstimadaFinalizacion(java.time.LocalTime.now())
                .total(detallePedido3.getSubTotal() + detallePedido4.getSubTotal())
                .totalCosto(cervezaQuilmes.getPrecioCompra() * 3 + pizzaChicaHawaiana.getPrecioCompra())
                .detalles(Set.of(detallePedido3, detallePedido4))
                .build();
        cliente2.getHace().add(pedido2);

        System.out.println("Pedido 2" +
                "\nCliente: " + pedido2.getCliente().getNombre() + " " + pedido2.getCliente().getApellido() +
                "\nFecha de pedido: " + pedido2.getFechaPedido() +
                "\nHora estimada de finalización: " + pedido2.getHoraEstimadaFinalizacion() +
                "\nDetalle del pedido: " +
                "\n" + detallePedido3.getArticulo().getDenominacion() + " x" + detallePedido3.getCantidad() + " = " + detallePedido3.getSubTotal() +
                "\n" + detallePedido4.getArticulo().getDenominacion() + " x" + detallePedido4.getCantidad() + " = " + detallePedido4.getSubTotal() +
                "\n-----------------------------" +
                "\nTotal a pagar: " + pedido2.getTotal() +
                "\n/////////////////////////////" );

        //Cliente 3
        DetallePedido detallePedido5 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaGrandeHawaiana.getPrecioVenta())
                .articulo(pizzaGrandeHawaiana)
                .build();
        DetallePedido detallePedido6 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaChicaMuzza.getPrecioVenta())
                .articulo(pizzaChicaMuzza)
                .build();
        DetallePedido detallePedido7 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaGrandeNapolitana.getPrecioVenta())
                .articulo(pizzaGrandeNapolitana)
                .build();
        DetallePedido detallePedido8 = DetallePedido.builder()
                .cantidad(2)
                .subTotal(cervezaAndes.getPrecioVenta() * 2)
                .articulo(cervezaAndes)
                .build();
        Pedido pedido3 = Pedido.builder()
                .cliente(cliente3)
                .fechaPedido(java.time.LocalDate.now())
                .horaEstimadaFinalizacion(java.time.LocalTime.now())
                .total(detallePedido5.getSubTotal() + detallePedido6.getSubTotal() + detallePedido7.getSubTotal() + detallePedido8.getSubTotal())
                .totalCosto(pizzaGrandeHawaiana.getPrecioCompra() + pizzaChicaMuzza.getPrecioCompra() + pizzaGrandeNapolitana.getPrecioCompra() + cervezaAndes.getPrecioCompra() * 2)
                .detalles(Set.of(detallePedido5, detallePedido6, detallePedido7, detallePedido8))
                .build();
        cliente3.getHace().add(pedido3);

        System.out.println("Pedido 3" +
                "\nCliente: " + pedido3.getCliente().getNombre() + " " + pedido3.getCliente().getApellido() +
                "\nFecha de pedido: " + pedido3.getFechaPedido() +
                "\nHora estimada de finalización: " + pedido3.getHoraEstimadaFinalizacion() +
                "\nDetalle del pedido: " +
                "\n" + detallePedido5.getArticulo().getDenominacion() + " x" + detallePedido5.getCantidad() + " = " + detallePedido5.getSubTotal() +
                "\n" + detallePedido6.getArticulo().getDenominacion() + " x" + detallePedido6.getCantidad() + " = " + detallePedido6.getSubTotal() +
                "\n" + detallePedido7.getArticulo().getDenominacion() + " x" + detallePedido7.getCantidad() + " = " + detallePedido7.getSubTotal() +
                "\n" + detallePedido8.getArticulo().getDenominacion() + " x" + detallePedido8.getCantidad() + " = " + detallePedido8.getSubTotal() +
                "\n-----------------------------" +
                "\nTotal a pagar: " + pedido3.getTotal() +
                "\n/////////////////////////////" );

        //Cliente 1 otra compra
        DetallePedido detallePedido9 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(pizzaChicaMuzza.getPrecioVenta())
                .articulo(pizzaChicaMuzza)
                .build();
        DetallePedido detallePedido10 = DetallePedido.builder()
                .cantidad(1)
                .subTotal(cervezaAndes.getPrecioVenta())
                .articulo(cervezaAndes)
                .build();
        Pedido pedido4 = Pedido.builder()
                .cliente(cliente1)
                .fechaPedido(java.time.LocalDate.now())
                .horaEstimadaFinalizacion(java.time.LocalTime.now())
                .total(detallePedido9.getSubTotal() + detallePedido10.getSubTotal())
                .totalCosto(pizzaChicaMuzza.getPrecioCompra() + cervezaAndes.getPrecioCompra())
                .detalles(Set.of(detallePedido9, detallePedido10))
                .build();
        cliente1.getHace().add(pedido4);

        System.out.println("Pedido 4" +
                "\nCliente: " + pedido4.getCliente().getNombre() + " " + pedido4.getCliente().getApellido() +
                "\nFecha de pedido: " + pedido4.getFechaPedido() +
                "\nHora estimada de finalización: " + pedido4.getHoraEstimadaFinalizacion() +
                "\nDetalle del pedido: " +
                "\n" + detallePedido9.getArticulo().getDenominacion() + " x" + detallePedido9.getCantidad() + " = " + detallePedido9.getSubTotal() +
                "\n" + detallePedido10.getArticulo().getDenominacion() + " x" + detallePedido10.getCantidad() + " = " + detallePedido10.getSubTotal() +
                "\n-----------------------------" +
                "\nTotal a pagar: " + pedido4.getTotal() +
                "\n/////////////////////////////" );

        //Repositorio Pedidos
        pedidoRepository.save(pedido1);
        pedidoRepository.save(pedido2);
        pedidoRepository.save(pedido3);
        pedidoRepository.save(pedido4);

        //Cliente 1 cantidad de veces que compró
        System.out.println("El cliente " + cliente1.getNombre() + " compró " + cliente1.getHace().size() + " veces");
        System.out.println("/////////////////////////////");

        //Artículos
        List<Articulo> articulos = articuloRepository.findAll();
        System.out.println("Artículos disponibles: ");
        for (Articulo articulo : articulos) {
            System.out.println(articulo.getId()+ " - " + articulo.getDenominacion());
        }
    }
}