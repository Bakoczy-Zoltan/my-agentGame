package hu.progmasters.game.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class UserGameConnector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @MapsId
    private GameUser user;

    private LocalDateTime lastActionTime;

    @ManyToOne
    private ActualGame actualGame;



}
