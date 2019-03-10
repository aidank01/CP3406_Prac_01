package au.edu.jcu.cp3406.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view){
        View text = findViewById(R.id.editText);
        View.
        game.check();
    }
}
