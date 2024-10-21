package com.github.jaguere.ms_reviews.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Table(name = "tb_filme")
public class Filme {
    private Long id;
    private String titulo;
    private Integer ano;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filme")
    private List<Review> reviews;
    @ManyToOne(optional = false)
    @JoinColumn(name = "genero_id")
    private Genero genero;
}
