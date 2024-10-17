package at.home.asecHTL.hangman.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.home.asecHTL.hangman.R;
import at.home.asecHTL.hangman.databinding.FragmentStartingScreenBinding;
import at.home.asecHTL.hangman.viewModel.MainViewModel;


public class StartingScreen extends Fragment {

    FragmentStartingScreenBinding binding;

    public StartingScreen() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStartingScreenBinding.inflate(inflater, container, false);
        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        binding.btPVSc.setOnClickListener(s -> {
            viewModel.show_Difficulty_SCREEN();
        });
        binding.btPVSp.setOnClickListener(s -> {
            viewModel.show_CreateGuessWordScreen();
        });



        return binding.getRoot();
    }
}