package kr.startupall.events.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import kr.startupall.events.domain.questions.Question;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
public class Event extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EVENT_ID")
    private long id;

    private String title;

    private String speaker;

    private LocalDateTime dateTime;

    @Column(name = "DUE_DATE")
    private LocalDateTime applyFinishTime;

    @Column(columnDefinition = "TEXT NULL")
    private String description;

    @ManyToOne
    @JoinColumn(name = "VENUE_ID")
    private Venue venue;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<EventApply> applies;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

    public void addApplies(EventApply apply) {
        if(this.applies == null) {
            this.applies = Lists.newArrayList();
        }
        this.applies.add(apply);
    }

    public void addQuestion(Question question) {
        if(this.questions == null) {
            this.questions = Lists.newArrayList();
        }

        this.questions.add(question);
        question.setEvent(this);
    }
}
