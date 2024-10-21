package com.github.jaguere.ms_reviews.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Table(name = "tb_review")
public class Review {
    @Id
    private Long id;
    private String texto;
    @ManyToOne(optional = false)
    @JoinColumn(name = "filme_id")
    private Filme filme;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;
}
