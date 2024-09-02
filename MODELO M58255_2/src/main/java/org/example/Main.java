package org.example;

import org.example.Entidades.Articulo;
import org.example.Entidades.Promocion;
import org.example.Entidades.TipoPromocion;

public class Main {
    public static void main(String[] args) {
        // Crear artículos
        Articulo pizzaGrandeHawaiana = new Articulo("Pizza Grande Hawaiana", "imagen1.png", 800);
        Articulo pizzaChicaHawaiana = new Articulo("Pizza Chica Hawaiana", "imagen4.png", 400);
        Articulo pizzaGrandeNapolitana = new Articulo("Pizza Grande Napolitana", "imagen2.png", 850);
        Articulo pizzaChicaNapolitana = new Articulo("Pizza Chica Napolitana", "imagen5.png", 420);
        Articulo pizzaGrandeMuzza = new Articulo("Pizza Grande Muzza", "imagen3.png", 780);
        Articulo pizzaChicaMuzza = new Articulo("Pizza Chica Muzza", "imagen6.png", 390);
        Articulo cervezaAndes = new Articulo("Cerveza Andes", "imagen7.png", 200);
        Articulo cervezaQuilmes = new Articulo("Cerveza Quilmes", "imagen8.png", 180);

        // Crear promociones
        Promocion happyHour = new Promocion(TipoPromocion.HAPPY_HOUR, "imahappy1.png");
        happyHour.agregarArticulo(pizzaGrandeHawaiana);
        happyHour.agregarArticulo(pizzaGrandeMuzza);
        happyHour.agregarArticulo(cervezaQuilmes);

        Promocion verano = new Promocion(TipoPromocion.VERANO, "verano1.png");
        verano.agregarArticulo(pizzaChicaHawaiana);
        verano.agregarArticulo(pizzaGrandeNapolitana);
        verano.agregarArticulo(cervezaQuilmes);
        verano.agregarArticulo(cervezaAndes);

        Promocion invierno = new Promocion(TipoPromocion.INVIERNO, "invierno1.png");
        invierno.agregarArticulo(pizzaGrandeHawaiana);
        invierno.agregarArticulo(pizzaChicaMuzza);
        invierno.agregarArticulo(cervezaQuilmes);

        // Mostrar las promociones y los artículos
        System.out.println("Promociones Disponibles:");
        mostrarPromocion(happyHour);
        mostrarPromocion(verano);
        mostrarPromocion(invierno);

        // Mostrar la promoción más económica
        Promocion promocionMasEconomica = calcularPromocionMasEconomica(happyHour, verano, invierno);
        System.out.println("La promoción más económica es: " + promocionMasEconomica.getTipo());
    }

    public static void mostrarPromocion(Promocion promocion) {
        System.out.println(promocion.getTipo() + ":");
        promocion.getArticulos().forEach(articulo ->
                System.out.println(" - " + articulo.getNombre() + ": $" + articulo.getPrecio()));
        System.out.println("Precio Total: $" + promocion.calcularPrecioTotal());
    }

    public static Promocion calcularPromocionMasEconomica(Promocion... promociones) {
        Promocion economica = promociones[0];
        for (Promocion promo : promociones) {
            if (promo.calcularPrecioTotal() < economica.calcularPrecioTotal()) {
                economica = promo;
            }
        }
        return economica;
    }

}