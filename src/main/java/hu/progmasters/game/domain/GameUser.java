package hu.progmasters.game.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class GameUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String mail;

    private String password;

    private Status status;

    @OneToOne(mappedBy = "user")
    private UserGameConnector userGame;


}
