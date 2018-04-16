package kr.startupall.events.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID")
    private long id;

    @Column(name = "QUESTION_CONTENT")
    private String content;

    @Column(name = "QUESTION_TITLE")
    private String title;

    @Column(name = "QUESTION_TYPE")
    @Enumerated(value = EnumType.STRING)
    private QuestionTypes type;

}
