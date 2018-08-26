package br.edu.ifsp.scl.sdm.bingogame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGameButton = findViewById(R.id.startButton);
    }

    public void startGame(View view) {
        if (view.getId() == R.id.startButton) {
            startGameButton.setText(R.string.restart_game);
        }
    }

    public void getBall(View view) {
        if (view.getId() == R.id.getBallButton) {

        }
    }
}
