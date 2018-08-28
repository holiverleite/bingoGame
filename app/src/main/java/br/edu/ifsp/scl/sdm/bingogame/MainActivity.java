package br.edu.ifsp.scl.sdm.bingogame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random geradorRandomico;
    private Button startGameButton;
    private Integer totalBalls;
    private ImageView imageViewBall;
    private ArrayList<Integer> arrayOfBalls = new ArrayList<Integer>();

    private ImageView imageViewBall1B;
    private ImageView imageViewBall2B;
    private ImageView imageViewBall3B;
    private ImageView imageViewBall4B;
    private ImageView imageViewBall5B;
    private ImageView imageViewBall6B;
    private ImageView imageViewBall7B;
    private ImageView imageViewBall8B;
    private ImageView imageViewBall9B;
    private ImageView imageViewBall10B;
    private ImageView imageViewBall11B;
    private ImageView imageViewBall12B;
    private ImageView imageViewBall13B;
    private ImageView imageViewBall14B;
    private ImageView imageViewBall15B;

    private String TAG_BINGO = "TAG_BINGO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geradorRandomico = new Random(System.currentTimeMillis());
        totalBalls = 15;

        startGameButton = findViewById(R.id.startButton);
        imageViewBall = findViewById(R.id.imageViewBall);

        imageViewBall1B = findViewById(R.id.imageViewBall1B);
        imageViewBall2B = findViewById(R.id.imageViewBall2B);
        imageViewBall3B = findViewById(R.id.imageViewBall3B);
        imageViewBall4B = findViewById(R.id.imageViewBall4B);
        imageViewBall5B = findViewById(R.id.imageViewBall5B);
        imageViewBall6B = findViewById(R.id.imageViewBall6B);
        imageViewBall7B = findViewById(R.id.imageViewBall7B);
        imageViewBall8B = findViewById(R.id.imageViewBall8B);
        imageViewBall9B = findViewById(R.id.imageViewBall9B);
        imageViewBall10B = findViewById(R.id.imageViewBall10B);
        imageViewBall11B = findViewById(R.id.imageViewBall11B);
        imageViewBall12B = findViewById(R.id.imageViewBall12B);
        imageViewBall13B = findViewById(R.id.imageViewBall13B);
        imageViewBall14B = findViewById(R.id.imageViewBall14B);
        imageViewBall15B = findViewById(R.id.imageViewBall15B);


        arrayOfBalls.add(R.drawable.b1);
        arrayOfBalls.add(R.drawable.b2);
        arrayOfBalls.add(R.drawable.b3);
        arrayOfBalls.add(R.drawable.b4);
        arrayOfBalls.add(R.drawable.b5);
        arrayOfBalls.add(R.drawable.b6);
        arrayOfBalls.add(R.drawable.b7);
        arrayOfBalls.add(R.drawable.b8);
        arrayOfBalls.add(R.drawable.b9);
        arrayOfBalls.add(R.drawable.b10);
        arrayOfBalls.add(R.drawable.b11);
        arrayOfBalls.add(R.drawable.b12);
        arrayOfBalls.add(R.drawable.b13);
        arrayOfBalls.add(R.drawable.b14);
        arrayOfBalls.add(R.drawable.b15);
    }

    public void startGame(View view) {
        if (view.getId() == R.id.startButton) {
            startGameButton.setText(R.string.restart_game);
        }
    }

    public void getBall(View view) {
        if (view.getId() == R.id.getBallButton) {
            if (totalBalls != 0) {
                int index = geradorRandomico.nextInt(totalBalls);
                Toast.makeText(this, String.valueOf(index), Toast.LENGTH_SHORT).show();

                Log.d(TAG_BINGO,String.valueOf(totalBalls));

                imageViewBall.setImageResource(arrayOfBalls.get(index));
                int image = arrayOfBalls.get(index);

                switch (image) {
                    case R.drawable.b1:
                        imageViewBall1B.setImageResource(R.drawable.b1);
                        break;
                    case R.drawable.b2:
                        imageViewBall2B.setImageResource(R.drawable.b2);
                        break;
                    case R.drawable.b3:
                        imageViewBall3B.setImageResource(R.drawable.b3);
                        break;
                    case R.drawable.b4:
                        imageViewBall4B.setImageResource(R.drawable.b4);
                        break;
                    case R.drawable.b5:
                        imageViewBall5B.setImageResource(R.drawable.b5);
                        break;
                    case R.drawable.b6:
                        imageViewBall6B.setImageResource(R.drawable.b6);
                        break;
                    case R.drawable.b7:
                        imageViewBall7B.setImageResource(R.drawable.b7);
                        break;
                    case R.drawable.b8:
                        imageViewBall8B.setImageResource(R.drawable.b8);
                        break;
                    case R.drawable.b9:
                        imageViewBall9B.setImageResource(R.drawable.b9);
                        break;
                    case R.drawable.b10:
                        imageViewBall10B.setImageResource(R.drawable.b10);
                        break;
                    case R.drawable.b11:
                        imageViewBall11B.setImageResource(R.drawable.b11);
                        break;
                    case R.drawable.b12:
                        imageViewBall12B.setImageResource(R.drawable.b12);
                        break;
                    case R.drawable.b13:
                        imageViewBall13B.setImageResource(R.drawable.b13);
                        break;
                    case R.drawable.b14:
                        imageViewBall14B.setImageResource(R.drawable.b14);
                        break;
                    case R.drawable.b15:
                        imageViewBall15B.setImageResource(R.drawable.b15);
                        break;
                }


                arrayOfBalls.remove(index);
                --totalBalls;
            }
        }


    }
}
