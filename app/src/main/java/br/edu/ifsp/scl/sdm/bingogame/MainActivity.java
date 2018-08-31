package br.edu.ifsp.scl.sdm.bingogame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
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

    private ImageView imageViewB;
    private ImageView imageViewI;
    private ImageView imageViewN;
    private ImageView imageViewG;
    private ImageView imageViewO;

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

    private ImageView imageViewBall1I;
    private ImageView imageViewBall2I;
    private ImageView imageViewBall3I;
    private ImageView imageViewBall4I;
    private ImageView imageViewBall5I;
    private ImageView imageViewBall6I;
    private ImageView imageViewBall7I;
    private ImageView imageViewBall8I;
    private ImageView imageViewBall9I;
    private ImageView imageViewBall10I;
    private ImageView imageViewBall11I;
    private ImageView imageViewBall12I;
    private ImageView imageViewBall13I;
    private ImageView imageViewBall14I;
    private ImageView imageViewBall15I;

    private ImageView imageViewBall1N;
    private ImageView imageViewBall2N;
    private ImageView imageViewBall3N;
    private ImageView imageViewBall4N;
    private ImageView imageViewBall5N;
    private ImageView imageViewBall6N;
    private ImageView imageViewBall7N;
    private ImageView imageViewBall8N;
    private ImageView imageViewBall9N;
    private ImageView imageViewBall10N;
    private ImageView imageViewBall11N;
    private ImageView imageViewBall12N;
    private ImageView imageViewBall13N;
    private ImageView imageViewBall14N;
    private ImageView imageViewBall15N;

    private ImageView imageViewBall1G;
    private ImageView imageViewBall2G;
    private ImageView imageViewBall3G;
    private ImageView imageViewBall4G;
    private ImageView imageViewBall5G;
    private ImageView imageViewBall6G;
    private ImageView imageViewBall7G;
    private ImageView imageViewBall8G;
    private ImageView imageViewBall9G;
    private ImageView imageViewBall10G;
    private ImageView imageViewBall11G;
    private ImageView imageViewBall12G;
    private ImageView imageViewBall13G;
    private ImageView imageViewBall14G;
    private ImageView imageViewBall15G;

    private ImageView imageViewBall1O;
    private ImageView imageViewBall2O;
    private ImageView imageViewBall3O;
    private ImageView imageViewBall4O;
    private ImageView imageViewBall5O;
    private ImageView imageViewBall6O;
    private ImageView imageViewBall7O;
    private ImageView imageViewBall8O;
    private ImageView imageViewBall9O;
    private ImageView imageViewBall10O;
    private ImageView imageViewBall11O;
    private ImageView imageViewBall12O;
    private ImageView imageViewBall13O;
    private ImageView imageViewBall14O;
    private ImageView imageViewBall15O;

    private String TAG_BINGO = "TAG_BINGO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geradorRandomico = new Random(System.currentTimeMillis());
        totalBalls = 75;

        linkingComponentReferences();

        reloadBalls();
    }

    public void startGame(View view) {
        if (view.getId() == R.id.startButton) {
            startGameButton.setText(R.string.restart_game);

            Intent intent = getIntent();
            finish();
            startActivity(intent);
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

    public void linkingComponentReferences() {
        startGameButton = findViewById(R.id.startButton);
        imageViewBall = findViewById(R.id.imageViewBall);

        imageViewB = findViewById(R.id.imageViewB);
        imageViewI = findViewById(R.id.imageViewI);
        imageViewN = findViewById(R.id.imageViewN);
        imageViewG = findViewById(R.id.imageViewG);
        imageViewO = findViewById(R.id.imageViewO);
        imageViewB.setImageResource(R.drawable.b);
        imageViewI.setImageResource(R.drawable.i);
        imageViewN.setImageResource(R.drawable.n);
        imageViewG.setImageResource(R.drawable.g);
        imageViewO.setImageResource(R.drawable.o);

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

        imageViewBall1I = findViewById(R.id.imageViewBall1I);
        imageViewBall2I = findViewById(R.id.imageViewBall2I);
        imageViewBall3I = findViewById(R.id.imageViewBall3I);
        imageViewBall4I = findViewById(R.id.imageViewBall4I);
        imageViewBall5I = findViewById(R.id.imageViewBall5I);
        imageViewBall6I = findViewById(R.id.imageViewBall6I);
        imageViewBall7I = findViewById(R.id.imageViewBall7I);
        imageViewBall8I = findViewById(R.id.imageViewBall8I);
        imageViewBall9I = findViewById(R.id.imageViewBall9I);
        imageViewBall10I = findViewById(R.id.imageViewBall10I);
        imageViewBall11I = findViewById(R.id.imageViewBall11I);
        imageViewBall12I = findViewById(R.id.imageViewBall12I);
        imageViewBall13I = findViewById(R.id.imageViewBall13I);
        imageViewBall14I = findViewById(R.id.imageViewBall14I);
        imageViewBall15I = findViewById(R.id.imageViewBall15I);

        imageViewBall1N = findViewById(R.id.imageViewBall1N);
        imageViewBall2N = findViewById(R.id.imageViewBall2N);
        imageViewBall3N = findViewById(R.id.imageViewBall3N);
        imageViewBall4N = findViewById(R.id.imageViewBall4N);
        imageViewBall5N = findViewById(R.id.imageViewBall5N);
        imageViewBall6N = findViewById(R.id.imageViewBall6N);
        imageViewBall7N = findViewById(R.id.imageViewBall7N);
        imageViewBall8N = findViewById(R.id.imageViewBall8N);
        imageViewBall9N = findViewById(R.id.imageViewBall9N);
        imageViewBall10N = findViewById(R.id.imageViewBall10N);
        imageViewBall11N = findViewById(R.id.imageViewBall11N);
        imageViewBall12N = findViewById(R.id.imageViewBall12N);
        imageViewBall13N = findViewById(R.id.imageViewBall13N);
        imageViewBall14N = findViewById(R.id.imageViewBall14N);
        imageViewBall15N = findViewById(R.id.imageViewBall15N);

        imageViewBall1G = findViewById(R.id.imageViewBall1G);
        imageViewBall2G = findViewById(R.id.imageViewBall2G);
        imageViewBall3G = findViewById(R.id.imageViewBall3G);
        imageViewBall4G = findViewById(R.id.imageViewBall4G);
        imageViewBall5G = findViewById(R.id.imageViewBall5G);
        imageViewBall6G = findViewById(R.id.imageViewBall6G);
        imageViewBall7G = findViewById(R.id.imageViewBall7G);
        imageViewBall8G = findViewById(R.id.imageViewBall8G);
        imageViewBall9G = findViewById(R.id.imageViewBall9G);
        imageViewBall10G = findViewById(R.id.imageViewBall10G);
        imageViewBall11G = findViewById(R.id.imageViewBall11G);
        imageViewBall12G = findViewById(R.id.imageViewBall12G);
        imageViewBall13G = findViewById(R.id.imageViewBall13G);
        imageViewBall14G = findViewById(R.id.imageViewBall14G);
        imageViewBall15G = findViewById(R.id.imageViewBall15G);

        imageViewBall1O = findViewById(R.id.imageViewBall1O);
        imageViewBall2O = findViewById(R.id.imageViewBall2O);
        imageViewBall3O = findViewById(R.id.imageViewBall3O);
        imageViewBall4O = findViewById(R.id.imageViewBall4O);
        imageViewBall5O = findViewById(R.id.imageViewBall5O);
        imageViewBall6O = findViewById(R.id.imageViewBall6O);
        imageViewBall7O = findViewById(R.id.imageViewBall7O);
        imageViewBall8O = findViewById(R.id.imageViewBall8O);
        imageViewBall9O = findViewById(R.id.imageViewBall9O);
        imageViewBall10O = findViewById(R.id.imageViewBall10O);
        imageViewBall11O = findViewById(R.id.imageViewBall11O);
        imageViewBall12O = findViewById(R.id.imageViewBall12O);
        imageViewBall13O = findViewById(R.id.imageViewBall13O);
        imageViewBall14O = findViewById(R.id.imageViewBall14O);
        imageViewBall15O = findViewById(R.id.imageViewBall15O);
    }

    public void getBall(View view) {
        if (view.getId() == R.id.getBallButton) {
            if (totalBalls != 0) {
                int index = geradorRandomico.nextInt(totalBalls);

                imageViewBall.setImageResource(arrayOfBalls.get(index));
                int image = arrayOfBalls.get(index);

                switch (image) {
                    //B
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
                        //I
                    case R.drawable.i16:
                        imageViewBall1I.setImageResource(R.drawable.i16);
                        break;
                    case R.drawable.i17:
                        imageViewBall2I.setImageResource(R.drawable.i17);
                        break;
                    case R.drawable.i18:
                        imageViewBall3I.setImageResource(R.drawable.i18);
                        break;
                    case R.drawable.i19:
                        imageViewBall4I.setImageResource(R.drawable.i19);
                        break;
                    case R.drawable.i20:
                        imageViewBall5I.setImageResource(R.drawable.i20);
                        break;
                    case R.drawable.i21:
                        imageViewBall6I.setImageResource(R.drawable.i21);
                        break;
                    case R.drawable.i22:
                        imageViewBall7I.setImageResource(R.drawable.i22);
                        break;
                    case R.drawable.i23:
                        imageViewBall8I.setImageResource(R.drawable.i23);
                        break;
                    case R.drawable.i24:
                        imageViewBall9I.setImageResource(R.drawable.i24);
                        break;
                    case R.drawable.i25:
                        imageViewBall10I.setImageResource(R.drawable.i25);
                        break;
                    case R.drawable.i26:
                        imageViewBall11I.setImageResource(R.drawable.i26);
                        break;
                    case R.drawable.i27:
                        imageViewBall12I.setImageResource(R.drawable.i27);
                        break;
                    case R.drawable.i28:
                        imageViewBall13I.setImageResource(R.drawable.i28);
                        break;
                    case R.drawable.i29:
                        imageViewBall14I.setImageResource(R.drawable.i29);
                        break;
                    case R.drawable.i30:
                        imageViewBall15I.setImageResource(R.drawable.i30);
                        break;

                        //N
                    case R.drawable.n31:
                        imageViewBall1N.setImageResource(R.drawable.n31);
                        break;
                    case R.drawable.n32:
                        imageViewBall2N.setImageResource(R.drawable.n32);
                        break;
                    case R.drawable.n33:
                        imageViewBall3N.setImageResource(R.drawable.n33);
                        break;
                    case R.drawable.n34:
                        imageViewBall4N.setImageResource(R.drawable.n34);
                        break;
                    case R.drawable.n35:
                        imageViewBall5N.setImageResource(R.drawable.n35);
                        break;
                    case R.drawable.n36:
                        imageViewBall6N.setImageResource(R.drawable.n36);
                        break;
                    case R.drawable.n37:
                        imageViewBall7N.setImageResource(R.drawable.n37);
                        break;
                    case R.drawable.n38:
                        imageViewBall8N.setImageResource(R.drawable.n38);
                        break;
                    case R.drawable.n39:
                        imageViewBall9N.setImageResource(R.drawable.n39);
                        break;
                    case R.drawable.n40:
                        imageViewBall10N.setImageResource(R.drawable.n40);
                        break;
                    case R.drawable.n41:
                        imageViewBall11N.setImageResource(R.drawable.n41);
                        break;
                    case R.drawable.n42:
                        imageViewBall12N.setImageResource(R.drawable.n42);
                        break;
                    case R.drawable.n43:
                        imageViewBall13N.setImageResource(R.drawable.n43);
                        break;
                    case R.drawable.n44:
                        imageViewBall14N.setImageResource(R.drawable.n44);
                        break;
                    case R.drawable.n45:
                        imageViewBall15N.setImageResource(R.drawable.n45);
                        break;

                    //G
                    case R.drawable.g46:
                        imageViewBall1G.setImageResource(R.drawable.g46);
                        break;
                    case R.drawable.g47:
                        imageViewBall2G.setImageResource(R.drawable.g47);
                        break;
                    case R.drawable.g48:
                        imageViewBall3G.setImageResource(R.drawable.g48);
                        break;
                    case R.drawable.g49:
                        imageViewBall4G.setImageResource(R.drawable.g49);
                        break;
                    case R.drawable.g50:
                        imageViewBall5G.setImageResource(R.drawable.g50);
                        break;
                    case R.drawable.g51:
                        imageViewBall6G.setImageResource(R.drawable.g51);
                        break;
                    case R.drawable.g52:
                        imageViewBall7G.setImageResource(R.drawable.g52);
                        break;
                    case R.drawable.g53:
                        imageViewBall8G.setImageResource(R.drawable.g53);
                        break;
                    case R.drawable.g54:
                        imageViewBall9G.setImageResource(R.drawable.g54);
                        break;
                    case R.drawable.g55:
                        imageViewBall10G.setImageResource(R.drawable.g55);
                        break;
                    case R.drawable.g56:
                        imageViewBall11G.setImageResource(R.drawable.g56);
                        break;
                    case R.drawable.g57:
                        imageViewBall12G.setImageResource(R.drawable.g57);
                        break;
                    case R.drawable.g58:
                        imageViewBall13G.setImageResource(R.drawable.g58);
                        break;
                    case R.drawable.g59:
                        imageViewBall14G.setImageResource(R.drawable.g59);
                        break;
                    case R.drawable.g60:
                        imageViewBall15G.setImageResource(R.drawable.g60);
                        break;

                    //G
                    case R.drawable.o61:
                        imageViewBall1O.setImageResource(R.drawable.o61);
                        break;
                    case R.drawable.o62:
                        imageViewBall2O.setImageResource(R.drawable.o62);
                        break;
                    case R.drawable.o63:
                        imageViewBall3O.setImageResource(R.drawable.o63);
                        break;
                    case R.drawable.o64:
                        imageViewBall4O.setImageResource(R.drawable.o64);
                        break;
                    case R.drawable.o65:
                        imageViewBall5O.setImageResource(R.drawable.o65);
                        break;
                    case R.drawable.o66:
                        imageViewBall6O.setImageResource(R.drawable.o66);
                        break;
                    case R.drawable.o67:
                        imageViewBall7O.setImageResource(R.drawable.o67);
                        break;
                    case R.drawable.o68:
                        imageViewBall8O.setImageResource(R.drawable.o68);
                        break;
                    case R.drawable.o69:
                        imageViewBall9O.setImageResource(R.drawable.o69);
                        break;
                    case R.drawable.o70:
                        imageViewBall10O.setImageResource(R.drawable.o70);
                        break;
                    case R.drawable.o71:
                        imageViewBall11O.setImageResource(R.drawable.o71);
                        break;
                    case R.drawable.o72:
                        imageViewBall12O.setImageResource(R.drawable.o72);
                        break;
                    case R.drawable.o73:
                        imageViewBall13O.setImageResource(R.drawable.o73);
                        break;
                    case R.drawable.o74:
                        imageViewBall14O.setImageResource(R.drawable.o74);
                        break;
                    case R.drawable.o75:
                        imageViewBall15O.setImageResource(R.drawable.o75);
                        break;
                }


                arrayOfBalls.remove(index);
                --totalBalls;
            }
        }


    }
}
