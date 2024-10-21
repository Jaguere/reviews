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
@Table(name = "tb_user")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Review> reviews;
}
