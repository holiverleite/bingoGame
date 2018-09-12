package br.edu.ifsp.scl.sdm.bingogame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random geradorRandomico;
    private Button startGameButton;
    private Integer totalBalls;
    private ImageView imageViewBall;
    private ImageView imageViewLetter;
    private ArrayList<Integer> arrayOfBalls = new ArrayList<Integer>();
    private GridLayout gridView;
    private LayoutInflater layoutInflater;

    private String TAG_BINGO = "TAG_BINGO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_activity_main);

        geradorRandomico = new Random(System.currentTimeMillis());
        totalBalls = 75;

        startGameButton = findViewById(R.id.startButton);
        imageViewBall = findViewById(R.id.imageViewBall);
        imageViewLetter = findViewById(R.id.imageLetter);
        gridView = findViewById(R.id.mainGrid);
        layoutInflater = getLayoutInflater();

        reloadBalls();
    }

    public void startGame(View view) {
        if (view.getId() == R.id.startButton) {
            startGameButton.setText(R.string.restart_game);

            totalBalls = 75;
            arrayOfBalls.clear();
            reloadBalls();

            gridView.removeAllViews();
            imageViewLetter.setImageDrawable(null);
            imageViewBall.setImageDrawable(null);
        }
    }


    public void getBall(View view) {
        if (view.getId() == R.id.getBallButton) {
            if (totalBalls != 0) {
                int index = geradorRandomico.nextInt(totalBalls);

                imageViewBall.setImageResource(arrayOfBalls.get(index));
                int image = arrayOfBalls.get(index);

                View novoEmailLayout = layoutInflater.inflate(R.layout.ball_image_view,null);

                switch (image) {
                    //B
                    case R.drawable.b1:
                        novoEmailLayout.setBackgroundResource(R.drawable.b1);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b2:
                        novoEmailLayout.setBackgroundResource(R.drawable.b2);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b3:
                        novoEmailLayout.setBackgroundResource(R.drawable.b3);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b4:
                        novoEmailLayout.setBackgroundResource(R.drawable.b4);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b5:
                        novoEmailLayout.setBackgroundResource(R.drawable.b5);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b6:
                        novoEmailLayout.setBackgroundResource(R.drawable.b6);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b7:
                        novoEmailLayout.setBackgroundResource(R.drawable.b7);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b8:
                        novoEmailLayout.setBackgroundResource(R.drawable.b8);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b9:
                        novoEmailLayout.setBackgroundResource(R.drawable.b9);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b10:
                        novoEmailLayout.setBackgroundResource(R.drawable.b10);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b11:
                        novoEmailLayout.setBackgroundResource(R.drawable.b11);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b12:
                        novoEmailLayout.setBackgroundResource(R.drawable.b12);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b13:
                        novoEmailLayout.setBackgroundResource(R.drawable.b13);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b14:
                        novoEmailLayout.setBackgroundResource(R.drawable.b14);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    case R.drawable.b15:
                        novoEmailLayout.setBackgroundResource(R.drawable.b15);
                        imageViewLetter.setImageResource(R.drawable.b);
                        break;
                    //I
                    case R.drawable.i16:
                        novoEmailLayout.setBackgroundResource(R.drawable.i16);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i17:
                        novoEmailLayout.setBackgroundResource(R.drawable.i17);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i18:
                        novoEmailLayout.setBackgroundResource(R.drawable.i18);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i19:
                        novoEmailLayout.setBackgroundResource(R.drawable.i19);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i20:
                        novoEmailLayout.setBackgroundResource(R.drawable.i20);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i21:
                        novoEmailLayout.setBackgroundResource(R.drawable.i21);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i22:
                        novoEmailLayout.setBackgroundResource(R.drawable.i22);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i23:
                        novoEmailLayout.setBackgroundResource(R.drawable.i23);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i24:
                        novoEmailLayout.setBackgroundResource(R.drawable.i24);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i25:
                        novoEmailLayout.setBackgroundResource(R.drawable.i25);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i26:
                        novoEmailLayout.setBackgroundResource(R.drawable.i26);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i27:
                        novoEmailLayout.setBackgroundResource(R.drawable.i27);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i28:
                        novoEmailLayout.setBackgroundResource(R.drawable.i28);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i29:
                        novoEmailLayout.setBackgroundResource(R.drawable.i29);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;
                    case R.drawable.i30:
                        novoEmailLayout.setBackgroundResource(R.drawable.i30);
                        imageViewLetter.setImageResource(R.drawable.i);
                        break;

                    //N
                    case R.drawable.n31:
                        novoEmailLayout.setBackgroundResource(R.drawable.n31);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n32:
                        novoEmailLayout.setBackgroundResource(R.drawable.n32);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n33:
                        novoEmailLayout.setBackgroundResource(R.drawable.n33);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n34:
                        novoEmailLayout.setBackgroundResource(R.drawable.n34);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n35:
                        novoEmailLayout.setBackgroundResource(R.drawable.n35);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n36:
                        novoEmailLayout.setBackgroundResource(R.drawable.n36);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n37:
                        novoEmailLayout.setBackgroundResource(R.drawable.n37);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n38:
                        novoEmailLayout.setBackgroundResource(R.drawable.n38);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n39:
                        novoEmailLayout.setBackgroundResource(R.drawable.n39);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n40:
                        novoEmailLayout.setBackgroundResource(R.drawable.n40);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n41:
                        novoEmailLayout.setBackgroundResource(R.drawable.n41);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n42:
                        novoEmailLayout.setBackgroundResource(R.drawable.n42);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n43:
                        novoEmailLayout.setBackgroundResource(R.drawable.n43);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n44:
                        novoEmailLayout.setBackgroundResource(R.drawable.n44);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;
                    case R.drawable.n45:
                        novoEmailLayout.setBackgroundResource(R.drawable.n45);
                        imageViewLetter.setImageResource(R.drawable.n);
                        break;

                    //G
                    case R.drawable.g46:
                        novoEmailLayout.setBackgroundResource(R.drawable.g46);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g47:
                        novoEmailLayout.setBackgroundResource(R.drawable.g47);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g48:
                        novoEmailLayout.setBackgroundResource(R.drawable.g48);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g49:
                        novoEmailLayout.setBackgroundResource(R.drawable.g49);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g50:
                        novoEmailLayout.setBackgroundResource(R.drawable.g50);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g51:
                        novoEmailLayout.setBackgroundResource(R.drawable.g51);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g52:
                        novoEmailLayout.setBackgroundResource(R.drawable.g52);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g53:
                        novoEmailLayout.setBackgroundResource(R.drawable.g53);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g54:
                        novoEmailLayout.setBackgroundResource(R.drawable.g54);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g55:
                        novoEmailLayout.setBackgroundResource(R.drawable.g55);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g56:
                        novoEmailLayout.setBackgroundResource(R.drawable.g56);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g57:
                        novoEmailLayout.setBackgroundResource(R.drawable.g57);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g58:
                        novoEmailLayout.setBackgroundResource(R.drawable.g58);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g59:
                        novoEmailLayout.setBackgroundResource(R.drawable.g59);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;
                    case R.drawable.g60:
                        novoEmailLayout.setBackgroundResource(R.drawable.g60);
                        imageViewLetter.setImageResource(R.drawable.g);
                        break;

                    //G
                    case R.drawable.o61:
                        novoEmailLayout.setBackgroundResource(R.drawable.o61);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o62:
                        novoEmailLayout.setBackgroundResource(R.drawable.o62);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o63:
                        novoEmailLayout.setBackgroundResource(R.drawable.o63);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o64:
                        novoEmailLayout.setBackgroundResource(R.drawable.o64);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o65:
                        novoEmailLayout.setBackgroundResource(R.drawable.o65);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o66:
                        novoEmailLayout.setBackgroundResource(R.drawable.o66);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o67:
                        novoEmailLayout.setBackgroundResource(R.drawable.o67);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o68:
                        novoEmailLayout.setBackgroundResource(R.drawable.o68);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o69:
                        novoEmailLayout.setBackgroundResource(R.drawable.o69);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o70:
                        novoEmailLayout.setBackgroundResource(R.drawable.o70);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o71:
                        novoEmailLayout.setBackgroundResource(R.drawable.o71);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o72:
                        novoEmailLayout.setBackgroundResource(R.drawable.o72);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o73:
                        novoEmailLayout.setBackgroundResource(R.drawable.o73);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o74:
                        novoEmailLayout.setBackgroundResource(R.drawable.o74);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                    case R.drawable.o75:
                        novoEmailLayout.setBackgroundResource(R.drawable.o75);
                        imageViewLetter.setImageResource(R.drawable.o);
                        break;
                }

                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = 55;
                layoutParams.height = 55;
                novoEmailLayout.setLayoutParams(layoutParams);

                gridView.addView(novoEmailLayout);

                arrayOfBalls.remove(index);
                --totalBalls;
            } else {
                Toast.makeText(getApplicationContext(),"Fim do jogo!",Toast.LENGTH_LONG).show();
            }
        }
    }

    public void reloadBalls() {
        //B
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
        //I
        arrayOfBalls.add(R.drawable.i16);
        arrayOfBalls.add(R.drawable.i17);
        arrayOfBalls.add(R.drawable.i18);
        arrayOfBalls.add(R.drawable.i19);
        arrayOfBalls.add(R.drawable.i20);
        arrayOfBalls.add(R.drawable.i21);
        arrayOfBalls.add(R.drawable.i22);
        arrayOfBalls.add(R.drawable.i23);
        arrayOfBalls.add(R.drawable.i24);
        arrayOfBalls.add(R.drawable.i25);
        arrayOfBalls.add(R.drawable.i26);
        arrayOfBalls.add(R.drawable.i27);
        arrayOfBalls.add(R.drawable.i28);
        arrayOfBalls.add(R.drawable.i29);
        arrayOfBalls.add(R.drawable.i30);
        //N
        arrayOfBalls.add(R.drawable.n31);
        arrayOfBalls.add(R.drawable.n32);
        arrayOfBalls.add(R.drawable.n33);
        arrayOfBalls.add(R.drawable.n34);
        arrayOfBalls.add(R.drawable.n35);
        arrayOfBalls.add(R.drawable.n36);
        arrayOfBalls.add(R.drawable.n37);
        arrayOfBalls.add(R.drawable.n38);
        arrayOfBalls.add(R.drawable.n39);
        arrayOfBalls.add(R.drawable.n40);
        arrayOfBalls.add(R.drawable.n41);
        arrayOfBalls.add(R.drawable.n42);
        arrayOfBalls.add(R.drawable.n43);
        arrayOfBalls.add(R.drawable.n44);
        arrayOfBalls.add(R.drawable.n45);
        //G
        arrayOfBalls.add(R.drawable.g46);
        arrayOfBalls.add(R.drawable.g47);
        arrayOfBalls.add(R.drawable.g48);
        arrayOfBalls.add(R.drawable.g49);
        arrayOfBalls.add(R.drawable.g50);
        arrayOfBalls.add(R.drawable.g51);
        arrayOfBalls.add(R.drawable.g52);
        arrayOfBalls.add(R.drawable.g53);
        arrayOfBalls.add(R.drawable.g54);
        arrayOfBalls.add(R.drawable.g55);
        arrayOfBalls.add(R.drawable.g56);
        arrayOfBalls.add(R.drawable.g57);
        arrayOfBalls.add(R.drawable.g58);
        arrayOfBalls.add(R.drawable.g59);
        arrayOfBalls.add(R.drawable.g60);
        //O
        arrayOfBalls.add(R.drawable.o61);
        arrayOfBalls.add(R.drawable.o62);
        arrayOfBalls.add(R.drawable.o63);
        arrayOfBalls.add(R.drawable.o64);
        arrayOfBalls.add(R.drawable.o65);
        arrayOfBalls.add(R.drawable.o66);
        arrayOfBalls.add(R.drawable.o67);
        arrayOfBalls.add(R.drawable.o68);
        arrayOfBalls.add(R.drawable.o69);
        arrayOfBalls.add(R.drawable.o70);
        arrayOfBalls.add(R.drawable.o71);
        arrayOfBalls.add(R.drawable.o72);
        arrayOfBalls.add(R.drawable.o73);
        arrayOfBalls.add(R.drawable.o74);
        arrayOfBalls.add(R.drawable.o75);
    }
}
