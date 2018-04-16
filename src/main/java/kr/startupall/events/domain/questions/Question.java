package kr.startupall.events.domain.questions;

import kr.startupall.events.domain.Event;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "EVENT_ID")
    private Event event;

    @Column(name = "QUESTION_TYPE")
    @Enumerated(value = EnumType.STRING)
    private QuestionTypes type;

    @OneToMany(mappedBy = "question")
    private List<QuestionOption> options;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

}
