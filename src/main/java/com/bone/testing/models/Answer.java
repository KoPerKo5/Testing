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
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "answer_text", nullable = false,
            columnDefinition = "varchar(256)")
    private String text;
    @Column(name = "answer_truth", nullable = false, unique = true,
            columnDefinition = "boolean")
    private boolean truth;  //boolean or BIT????????????

    //@OneToMany(cascade = CascadeType.MERGE,
     //       mappedBy = "question", fetch = FetchType.EAGER)
    //private Set<Answer> answers = new HashSet<>();

//    @ManyToOne
//    @JoinColumn(name = "question_id")
//    private Question question;

    @ManyToOne
    (cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "question_id")
    private Question question;



}
