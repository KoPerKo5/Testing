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
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "result_score", nullable = false,
            columnDefinition = "integer")
    private int score;

    @ManyToOne
    @JoinColumn(name = "testtaker_id")
    private Testtaker testtaker;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;
}
