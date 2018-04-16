package kr.startupall.events.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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


}
