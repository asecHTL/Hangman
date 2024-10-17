package at.home.asecHTL.hangman.logic;

public class GameViewLogic {


    public int letterIncluded(String guess, String word){
        if (word.contains(guess)){
            return word.indexOf(guess);
        }
        //999 --> Keine Übereinstimmung
        return 999;
    }

    public String paintWord(String word){
        String wordOutput = "";
        int letters = word.length();
        for (int i = 0; i <= letters; i++){
            wordOutput += "_ ";
        }
        return wordOutput;
    }
}
