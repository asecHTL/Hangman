package at.home.asecHTL.hangman.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.home.asecHTL.hangman.R;
import at.home.asecHTL.hangman.databinding.FragmentNewGameBinding;
import at.home.asecHTL.hangman.databinding.FragmentSetDifficultiyBinding;
import at.home.asecHTL.hangman.viewModel.MainViewModel;


public class NewGame extends Fragment {
    FragmentNewGameBinding binding;


    public NewGame() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewGameBinding.inflate(inflater, container, false);
        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);




        return binding.getRoot();
    }
}