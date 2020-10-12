package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DezenaActivity extends AppCompatActivity {

    private TextView textDezenaSorteada, textNomeBicho;
    private ImageView imageBicho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dezena);

        textDezenaSorteada  = findViewById(R.id.textDezenaSorteada);
        textNomeBicho       = findViewById(R.id.textNomeBicho);
        imageBicho          = findViewById(R.id.imageBicho);
        Button btnSortearDezena = findViewById(R.id.btnSortearDezena);

        btnSortearDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dezenaSorteada();

            }
        });
    }

    public void dezenaSorteada() {

        final int[] avestruz      = {1,2,3,4};
        final int[] aguia         = {5,6,7,8};
        final int[] burro         = {9,10,11,12};
        final int[] borboleta     = {13,14,15,16};
        final int[] cachorro      = {17,18,19,20};
        final int[] cabra         = {21,22,23,24};
        final int[] carneiro      = {25,26,27,28};
        final int[] camelo        = {29,30,31,32};
        final int[] cobra         = {33,34,35,36};
        final int[] coelho        = {37,38,39,40};
        final int[] cavalo        = {41,42,43,44};
        final int[] elefante      = {45,46,47,48};
        final int[] galo          = {49,50,51,52};
        final int[] gato          = {53,54,55,56};
        final int[] jacare        = {57,58,59,60};
        final int[] leao          = {61,62,63,64};
        final int[] macaco        = {65,66,67,68};
        final int[] porco         = {69,70,71,72};
        final int[] pavao         = {73,74,75,76};
        final int[] peru          = {77,78,79,80};
        final int[] touro         = {81,82,83,84};
        final int[] tigre         = {85,86,87,88};
        final int[] urso          = {89,90,91,92};
        final int[] veado         = {93,94,95,96};
        final int[] vaca          = {97,98,99,0};

        int dezena = new Random().nextInt(99);

        if (dezena == 0) {
            textDezenaSorteada.setText(R.string.zero);
        } else if (dezena == 1) {
            textDezenaSorteada.setText(R.string.um);
        } else if (dezena == 2) {
            textDezenaSorteada.setText(R.string.dois);
        } else if (dezena == 3) {
            textDezenaSorteada.setText(R.string.trez);
        } else if (dezena == 4) {
            textDezenaSorteada.setText(R.string.quatro);
        } else if (dezena == 5) {
            textDezenaSorteada.setText(R.string.cinco);
        } else if (dezena == 6) {
            textDezenaSorteada.setText(R.string.seis);
        } else if (dezena == 7) {
            textDezenaSorteada.setText(R.string.sete);
        } else if (dezena == 8) {
            textDezenaSorteada.setText(R.string.oito);
        } else if (dezena == 9) {
            textDezenaSorteada.setText(R.string.nove);
        } else {
            textDezenaSorteada.setText(String.valueOf(dezena));
        }

        for (int value : avestruz) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.avestruz_peq);
                textNomeBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.aguia_peq);
                textNomeBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.burro_peq);
                textNomeBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.borboleta_peq);
                textNomeBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.cachorro_peq);
                textNomeBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.cabra_peq);
                textNomeBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.carneiro_peq);
                textNomeBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.camelo_peq);
                textNomeBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.cobra_peq);
                textNomeBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.coelho_peq);
                textNomeBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.cavalo_peq);
                textNomeBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.elefante_peq);
                textNomeBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.galo_peq);
                textNomeBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.gato_peq);
                textNomeBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.jacare_peq);
                textNomeBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.leao_peq);
                textNomeBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.macaco_peq);
                textNomeBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.porco_peq);
                textNomeBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.pavao_peq);
                textNomeBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.peru_peq);
                textNomeBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.touro_peq);
                textNomeBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.tigre_peq);
                textNomeBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.urso_peq);
                textNomeBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.veado_peq);
                textNomeBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == dezena) {
                imageBicho.setImageResource(R.drawable.vaca_peq);
                textNomeBicho.setText(R.string.nome_vaca);
            }
        }
    }
}
