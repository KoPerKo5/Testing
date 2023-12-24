package com.bone.testing.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "question_text", nullable = false,
            columnDefinition = "varchar(256)")
    private String text;
    @Column(name = "question_value", nullable = false,
            columnDefinition = "integer")
    private int questionValue;


    @OneToMany(mappedBy = "question")
    private Set<Answer> answers;

//    @OneToMany(cascade = CascadeType.MERGE,
//            mappedBy = "question", fetch = FetchType.EAGER)
//    private Set<Answer> answers = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;
}
