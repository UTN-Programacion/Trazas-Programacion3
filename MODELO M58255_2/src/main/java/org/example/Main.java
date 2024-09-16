package org.example;

import org.example.Entidades.*;
import org.example.Repositorios.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Articulo> articuloRepo = new InMemoryRepository<>();
        InMemoryRepository<Promocion> promoRepo = new InMemoryRepository<>();
        InMemoryRepository<Imagen> imagenRepo = new InMemoryRepository<>();

        // Unidades de Medida
        UnidadMedida porciones8 = new UnidadMedida();
        porciones8.setId(1L);
        porciones8.setDenominacion("8 Porciones");

        UnidadMedida porciones4 = new UnidadMedida();
        porciones4.setId(2L);
        porciones4.setDenominacion("4 Porciones");

        UnidadMedida litro = new UnidadMedida();
        litro.setId(3L);
        litro.setDenominacion("1 Litro");

        // Crear Artículos
        Articulo pizzaGrandeHawaiana = new Articulo();
        pizzaGrandeHawaiana.setId(1L);
        pizzaGrandeHawaiana.setDenominacion("Pizza Grande Hawaiana");
        pizzaGrandeHawaiana.setPrecioVenta(12.50);
        pizzaGrandeHawaiana.setStockActual(10);
        pizzaGrandeHawaiana.setUnidadMedida(porciones8);
        articuloRepo.save(pizzaGrandeHawaiana);


        Articulo pizzaChicaHawaiana = new Articulo();
        pizzaChicaHawaiana.setId(2L);
        pizzaChicaHawaiana.setDenominacion("Pizza Chica Hawaiana");
        pizzaChicaHawaiana.setPrecioVenta(8.50);
        pizzaChicaHawaiana.setStockActual(15);
        pizzaChicaHawaiana.setUnidadMedida(porciones4);
        articuloRepo.save(pizzaChicaHawaiana);

        Articulo cervezaAndes = new Articulo();
        cervezaAndes.setId(3L);
        cervezaAndes.setDenominacion("Cerveza Andes");
        cervezaAndes.setPrecioVenta(5.00);
        cervezaAndes.setStockActual(20);
        cervezaAndes.setUnidadMedida(litro);
        articuloRepo.save(cervezaAndes);

        // Crear Imágenes
        Imagen imagenPizzaGrandeHawaiana = new Imagen();
        imagenPizzaGrandeHawaiana.setId(1L);
        imagenPizzaGrandeHawaiana.setDenominacion("Imagen Pizza Grande Hawaiana");
        imagenRepo.save(imagenPizzaGrandeHawaiana);

        Imagen imagenCervezaAndes = new Imagen();
        imagenCervezaAndes.setId(2L);
        imagenCervezaAndes.setDenominacion("Imagen Cerveza Andes");
        imagenRepo.save(imagenCervezaAndes);

        // Crear Promoción Happy Hour
        Promocion happyHour = new Promocion();
        happyHour.setId(1L);
        happyHour.setDenominacion("Happy Hour");
        happyHour.setFechaDesde(LocalDate.now());
        happyHour.setHoraDesde(LocalTime.of(18, 0));
        happyHour.setHoraHasta(LocalTime.of(20, 0));
        happyHour.setPrecioPromocional(18.00);
        happyHour.setTipoPromocion(TipoPromocion.HAPPY_HOUR);


        // Mostrar todas las promociones
        System.out.println("Promociones disponibles:");
        promoRepo.findAll().forEach(System.out::println);

        // Mostrar todos los artículos
        System.out.println("Artículos disponibles:");
        articuloRepo.findAll().forEach(System.out::println);

        // Mostrar detalles de la promoción "Happy Hour"
        promoRepo.findById(1L).ifPresent(promo -> {
            System.out.println("Detalles de la promoción Happy Hour:");
            System.out.println(promo);
            System.out.println("Artículos incluidos:");
            promo.getArticulos().forEach(System.out::println);
        });


        // Comparar las promociones para obtener la más económica
        Promocion promocionMasEconomica = promoRepo.findAll().stream()
                .min(Comparator.comparing(Promocion::getPrecioPromocional)).orElse(null);

        if (promocionMasEconomica != null) {
            System.out.println("La promoción más económica es: " + promocionMasEconomica.getDenominacion() + " - Precio: $" + promocionMasEconomica.getPrecioPromocional());
        }
    }
}

