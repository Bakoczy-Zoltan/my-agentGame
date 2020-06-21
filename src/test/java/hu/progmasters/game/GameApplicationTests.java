package hu.progmasters.game;

import hu.progmasters.game.domain.AgentCardType;
import hu.progmasters.game.gametools.AgentCardsMixer;
import hu.progmasters.game.gametools.CodeCardsMixer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class GameApplicationTests {

    CodeCardsMixer gameCardMixer;
    AgentCardsMixer agentCardMixer;

    @BeforeEach
    void initTest(){
       gameCardMixer = new CodeCardsMixer();
    }

    @Test
    void mixingWordCardsNumber() {
        gameCardMixer.mixCard();
        String[] mixedCard = gameCardMixer.getActualCodeCards();

        Assertions.assertEquals(mixedCard.length, 25);
    }

    @Test
    void wordMixedCodeCardsListContainsRandomCards() {
        String[] firstMix = gameCardMixer.getActualCodeCards();
        String[] secondMix = gameCardMixer.mixCard();

        boolean isSame = true;
        for (int i = 0; i < firstMix.length ; i++) {
            if(!firstMix[i].equals(secondMix[i])){
                isSame = false;
                break;
            }
        }
       Assertions.assertFalse(isSame);
    }

    @Test
    void testAgentCardsGameInitialization() {
        agentCardMixer = new AgentCardsMixer(AgentCardType.BLUE);
        AgentCardType[] agentCards = agentCardMixer.mixCard();

        Assertions.assertEquals(25, agentCardMixer.getAgentCards().length);
    }

    @Test
    void testMixedCardListContainsRandomCards() {
        agentCardMixer = new AgentCardsMixer(AgentCardType.RED);
        AgentCardType[] firstMix = agentCardMixer.mixCard();
        AgentCardType[] secondMix = agentCardMixer.mixCard();
        int actualIndex = 0;
        boolean hasDifferentCards = false;

        for (AgentCardType card : firstMix) {
            if (secondMix[actualIndex] != card) {
                hasDifferentCards = true;
            }
            actualIndex++;
        }
        Assertions.assertTrue(hasDifferentCards);
    }

}
