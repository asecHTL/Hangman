package at.home.asecHTL.hangman.logic;

import java.util.ArrayList;
import java.util.List;

public class GuessWordLogic {
    private static String guessWord;
    private static List<String>guessWordList;

    public GuessWordLogic() {
        guessWordList = new ArrayList<>();
    }


    public static String getGuessWord() {
        return guessWord;
    }

    public static void setGuessWord(String guessWord) {
        GuessWordLogic.guessWord = guessWord;
    }

    public static List<String> getGuessWordList() {
        return guessWordList;
    }

    public static void setGuessWordList(List<String> guessWordList) {
        GuessWordLogic.guessWordList = guessWordList;
    }
}
