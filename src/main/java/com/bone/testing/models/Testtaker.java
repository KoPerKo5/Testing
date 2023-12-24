package com.bone.testing.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "testtaker")
public class Testtaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "testtaker_id", nullable = false, unique = true)
    private Long id;
    @Column(name = "testtaker_fio", nullable = false,
            columnDefinition = "varchar(128)")
    private String fio;
    @Column(name = "testtaker_email", nullable = false, unique = true,
            columnDefinition = "varchar(55)")
    private String email;


    @OneToMany(mappedBy = "testtaker")
    Set<Result> results;
}
