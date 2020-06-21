package hu.progmasters.game.gametools;

import hu.progmasters.game.domain.AgentCardType;
import lombok.Getter;

import java.util.*;

@Getter
public class AgentCardsMixer implements GameToolsMaker<AgentCardType> {

    private AgentCardType[] agentCards;
    private AgentCardType actualTeamColor;

    public AgentCardsMixer(AgentCardType actualTeamColor) {
        this.actualTeamColor = actualTeamColor;
        this.agentCards = mixCard();
    }

    @Override
    public AgentCardType[] mixCard() {
        AgentCardType[] gameCards = new AgentCardType[25];
        AgentCardType actTeamColor = this.actualTeamColor;

        List<AgentCardType> tempAllCards = new LinkedList<>(
                Arrays.asList(
                        actTeamColor, AgentCardType.BLUE, AgentCardType.BLUE, AgentCardType.BLUE, AgentCardType.BLUE,
                        AgentCardType.BLUE, AgentCardType.BLUE, AgentCardType.BLUE, AgentCardType.BLUE,
                        AgentCardType.RED, AgentCardType.RED, AgentCardType.RED, AgentCardType.RED,
                        AgentCardType.RED, AgentCardType.RED, AgentCardType.RED, AgentCardType.RED,
                        AgentCardType.CIVIL, AgentCardType.CIVIL, AgentCardType.CIVIL, AgentCardType.CIVIL,
                        AgentCardType.CIVIL, AgentCardType.CIVIL, AgentCardType.CIVIL, AgentCardType.ASSASSIN));

        Collections.shuffle(tempAllCards);
        for (int i = 0; i < tempAllCards.size() ; i++) {
            gameCards[i] = tempAllCards.get(i);
        }
        return gameCards;
    }
}
