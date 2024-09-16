package org.example.Entidades;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Promocion  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    @Enumerated(EnumType.STRING)
    private TipoPromocion tipoPromocion;



    //  @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)

//    @{1:MULTICHOICE_S:=OneToMany~OneToOne~ManyToOne~ManyToMany} (cascade = {1:MULTICHOICE_S:{CascadeType.PERSIST , CascadeType.MERGE\}~=CascadeType.ALL~CascadeType.REFRESH~CascadeType.REMOVE~CascadeType.DETACHED~CascadeType.PERSIST~CascadeType.MERGE }")
    @ToString.Exclude
    @JoinTable(name = "promocion_articulo",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "articulo_id"))

    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    @OneToMany

    @JoinColumn(name = "imagen_id")

    @Builder.Default

    private Set<Imagen> promoImagen = new HashSet<>();



}
