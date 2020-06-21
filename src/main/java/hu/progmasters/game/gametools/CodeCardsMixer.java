package hu.progmasters.game.gametools;

import lombok.Getter;

import java.util.*;

@Getter
public class CodeCardsMixer implements GameToolsMaker<String> {

    private final String[] actualCodeCards;
    private final List<String> allCards = WordCardHolder.getCodeCards();

    public CodeCardsMixer() {
        this.actualCodeCards = this.mixCard();
    }


    @Override
    public String[] mixCard() {
        String[] gameCodeCards = new String[25];
        List<String> tempCards = allCards;

        Collections.shuffle(tempCards);
        for (int i = 0; i < gameCodeCards.length ; i++) {
            gameCodeCards[i] = tempCards.get(i);
        }
        return gameCodeCards;
    }

}
