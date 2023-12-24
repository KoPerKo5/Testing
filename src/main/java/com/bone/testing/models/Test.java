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
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id", nullable = false, unique = true)
    private Long id;
    @Column(name = "test_title", nullable = false,
            columnDefinition = "varchar(55)")
    private String title;
    @Column(name = "test_number_of_questions", nullable = false,
            columnDefinition = "integer")
    private int number_of_questions;

    @OneToMany(mappedBy = "test")
    Set<Question> questions;
    @OneToMany(mappedBy = "test")
    Set<Result> results;
}
