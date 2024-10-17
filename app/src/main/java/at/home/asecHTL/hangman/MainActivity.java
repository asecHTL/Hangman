package at.home.asecHTL.hangman;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import at.home.asecHTL.hangman.databinding.ActivityMainBinding;
import at.home.asecHTL.hangman.fragments.GameView;
import at.home.asecHTL.hangman.fragments.NewGame;
import at.home.asecHTL.hangman.fragments.SetDifficultyScreen;
import at.home.asecHTL.hangman.fragments.SetGuessWord;
import at.home.asecHTL.hangman.fragments.StartingScreen;
import at.home.asecHTL.hangman.viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.state.observe(this, state -> {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            if (state == MainViewModel.STARTING_SCREEN){

                fragmentTransaction.add(R.id.main,new StartingScreen(),"Starting Screen");

            } else if (state == MainViewModel.Difficulty_SCREEN) {
                fragmentTransaction.replace(R.id.main,new SetDifficultyScreen(),"Difficulty Screen");
                fragmentTransaction.addToBackStack("Difficulty Screen");
            }else if (state == MainViewModel.Create_Guess_Word_SCREEN) {
                fragmentTransaction.replace(R.id.main,new SetGuessWord(),"Set Guess Word Screen");
                fragmentTransaction.addToBackStack("Set Guess Word Screen");
            }else if (state == MainViewModel.New_Game_Screen) {
                fragmentTransaction.replace(R.id.main,new NewGame(),"New Game Screen");
                fragmentTransaction.addToBackStack("New Game Screen");
            }else if (state == MainViewModel.Game_View_Screen) {
                fragmentTransaction.replace(R.id.main,new GameView(),"Game View Screen");
                fragmentTransaction.addToBackStack("Game View Screen");
            }

            fragmentTransaction.commit();

        });
    }
}