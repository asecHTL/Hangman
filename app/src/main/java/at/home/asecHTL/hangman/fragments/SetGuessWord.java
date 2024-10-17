package at.home.asecHTL.hangman.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.home.asecHTL.hangman.databinding.FragmentSetGuessWordBinding;
import at.home.asecHTL.hangman.logic.GuessWordLogic;
import at.home.asecHTL.hangman.viewModel.MainViewModel;


public class SetGuessWord extends Fragment {

    FragmentSetGuessWordBinding binding;

    public SetGuessWord() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSetGuessWordBinding.inflate(inflater, container, false);
        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        binding.btResume.setOnClickListener(view -> {
            String toGuess = binding.tiToGuessWord.toString();
            GuessWordLogic.setGuessWord(toGuess);
            viewModel.show_GameViewScreen();
        });


        return binding.getRoot();
    }
}