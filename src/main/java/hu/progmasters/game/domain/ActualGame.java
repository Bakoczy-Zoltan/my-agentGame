package hu.progmasters.game.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ActualGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime lastActionTime;

    @OneToMany(mappedBy = "actualGame")
    private List<UserGameConnector>users = new ArrayList<>();

    private Integer redScore;
    private Integer blueScore;

   // private List<AgentCardType>agentCardTypeList = new ArrayList<>();

    private String codeCards;



}
