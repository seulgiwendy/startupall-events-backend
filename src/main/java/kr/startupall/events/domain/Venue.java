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
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VENUE_ID")
    private long id;

    @Column(name = "VENUE_X_COORD")
    private double latitude;

    @Column(name = "VENUE_Y_COORD")
    private double longitude;

    private String description;

}
