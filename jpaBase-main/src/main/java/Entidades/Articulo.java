package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor

@Audited
@Entity
@Table(name = "Articulo")
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private int cantidad;

    @Column
    @NonNull
    private String denominacion;

    @Column
    @NonNull
    private int precio;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "art_cat", joinColumns = @JoinColumn(name = "articuloid"), inverseJoinColumns = @JoinColumn(name = "categoriaid"))
    private Set<Categoria> ArtCategoria = new HashSet<Categoria>();

    @OneToMany(mappedBy = "articulo")
    private Set<DetalleFactura> ArtDetalleFactura = new HashSet<DetalleFactura>();
}
