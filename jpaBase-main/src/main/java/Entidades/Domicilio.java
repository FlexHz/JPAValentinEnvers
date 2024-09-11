package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor

@Audited
@Entity
@Table(name = "Domicilio")
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String nombrecalle;

    @Column
    @NonNull
    private int nrocalle;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}
