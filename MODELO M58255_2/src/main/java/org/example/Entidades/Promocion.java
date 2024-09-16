package org.example.Entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder



public class Promocion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;
    private List<Articulo> articulos;
    private Imagen imagen;

    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
   //ToString.Exclude
   //JoinTable(name = "promocion_articulo"),JoinColumns=@JoinColumn(name="Promocion_id");
    @Builder.Default
    private Set<Articulo>articulo = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "imagen_id")
    @Builder.Default
    private Set<Imagen>promoImagen = new HashSet<>();

}
