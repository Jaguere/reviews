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
@Table(name = "tb_genero")
public class Genero {
    @Id
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genero")
    private List<Filme> filmes;
}
