package at.home.asecHTL.hangman.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public static final int STARTING_SCREEN = 0;
    public static final int Difficulty_SCREEN = 1;
    public static final int Create_Guess_Word_SCREEN = 2;
    public static final int New_Game_Screen = 3;
    public static final int Game_View_Screen = 4;

    private MutableLiveData<Integer> _state = new MutableLiveData<>(0);
    public LiveData<Integer> state = _state;

    public void showStartingScreen(){
        _state.postValue(STARTING_SCREEN);
    }
    public void show_Difficulty_SCREEN(){
        _state.postValue(Difficulty_SCREEN);
    }
    public void show_CreateGuessWordScreen(){
        _state.postValue(Create_Guess_Word_SCREEN);
    }
    public void show_NewGameScreen(){
        _state.postValue(New_Game_Screen);
    }
    public void show_GameViewScreen(){
        _state.postValue(Game_View_Screen);
    }


}
