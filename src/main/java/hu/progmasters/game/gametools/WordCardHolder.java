package hu.progmasters.game.gametools;

import java.util.Arrays;
import java.util.List;

public class WordCardHolder {

    private static List<String> cards = Arrays.asList(
            "ablak", "szék", "határ", "telefon", "Ufo", "cékla",
            "szerelem", "óra", "gép", "ribizli", "piros", "görög",
            "éghajlat", "illatos", "élet", "könyv", "nyaklánc", "gyanta",
            "papír", "zenél", "mozi", "csillag", "filmsztár", "csata",
            "hajó", "vasmacska", "levél", "kulcs", "farag", "harag",
            "vihar", "béke", "posta", "szerelem", "kórház", "könyv",
            "Sidney", "Róma", "Busz", "vitatkozás", "Atlantisz", "szörny"
    );

    public static List<String> getCodeCards(){
        return cards;
    }
}
