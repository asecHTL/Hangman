package at.home.asecHTL.hangman.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.home.asecHTL.hangman.R;
import at.home.asecHTL.hangman.databinding.FragmentGameViewBinding;
import at.home.asecHTL.hangman.databinding.FragmentNewGameBinding;
import at.home.asecHTL.hangman.databinding.FragmentSetDifficultiyBinding;
import at.home.asecHTL.hangman.logic.GameViewLogic;
import at.home.asecHTL.hangman.logic.GuessWordLogic;
import at.home.asecHTL.hangman.viewModel.MainViewModel;


public class GameView extends Fragment {

    FragmentGameViewBinding binding;
    GameViewLogic gameViewLogic;
    private String actualWord;

    public GameView() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGameViewBinding.inflate(inflater, container, false);
        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        gameViewLogic = new GameViewLogic();
        actualWord = GuessWordLogic.getGuessWord();

        String guessWordCaptured = gameViewLogic.paintWord(actualWord);
        binding.tvCaptureWord.setText(guessWordCaptured);

        binding.btGuess.setOnClickListener(s ->{
            String guess = binding.tiInputGuess.toString();
            gameViewLogic.letterIncluded(guess,actualWord);
        });



        return binding.getRoot();
    }
}