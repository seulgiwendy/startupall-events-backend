package kr.startupall.events.domain.questions;

import kr.startupall.events.domain.EventApply;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "ANSWER_ID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "APPLY_ID")
    private EventApply apply;

    private String answer;

}
