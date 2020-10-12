package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DuqueDezenaActivity extends AppCompatActivity {

    private TextView primeiraDezena, segundaDezena;
    private TextView nomePrimeiroBicho, nomeSegundoBicho;
    private TextView textMensagem;

    private Button btnPrimeiraDezena, btnSegundaDezena;

    private ImageView primeiroBicho, segundoBicho;

    private int pDezena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duque_dezena);

        primeiraDezena      = findViewById(R.id.primeiraDezena);
        segundaDezena       = findViewById(R.id.segundaDezena);
        nomePrimeiroBicho   = findViewById(R.id.nomePrimeiroBicho);
        nomeSegundoBicho    = findViewById(R.id.nomeSegundoBicho);
        textMensagem        = findViewById(R.id.textMensagem);
        primeiroBicho       = findViewById(R.id.primeiroBicho);
        segundoBicho        = findViewById(R.id.segundoBicho);
        btnPrimeiraDezena   = findViewById(R.id.btnPrimeiraDezena);
        btnSegundaDezena    = findViewById(R.id.btnSegundaDezena);

        btnSegundaDezena.setVisibility(View.INVISIBLE);

        btnPrimeiraDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                primeiraDezenaSorteada();
                btnSegundaDezena.setVisibility(View.VISIBLE);
                btnPrimeiraDezena.setVisibility(View.INVISIBLE);
            }
        });

        btnSegundaDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                segundaDezenaSorteada();
                btnSegundaDezena.setVisibility(View.INVISIBLE);
                btnPrimeiraDezena.setVisibility(View.VISIBLE);
            }
        });
    }

    public void primeiraDezenaSorteada() {

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

        pDezena = new Random().nextInt(99);

        if (pDezena == 0) {
            primeiraDezena.setText(R.string.zero);
        } else if (pDezena == 1) {
            primeiraDezena.setText(R.string.um);
        } else if (pDezena == 2) {
            primeiraDezena.setText(R.string.dois);
        } else if (pDezena == 3) {
            primeiraDezena.setText(R.string.trez);
        } else if (pDezena == 4) {
            primeiraDezena.setText(R.string.quatro);
        } else if (pDezena == 5) {
            primeiraDezena.setText(R.string.cinco);
        } else if (pDezena == 6) {
            primeiraDezena.setText(R.string.seis);
        } else if (pDezena == 7) {
            primeiraDezena.setText(R.string.sete);
        } else if (pDezena == 8) {
            primeiraDezena.setText(R.string.oito);
        } else if (pDezena == 9) {
            primeiraDezena.setText(R.string.nove);
        } else {
            primeiraDezena.setText(String.valueOf(pDezena));
        }

        for (int value : avestruz) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.avestruz_peq);
                nomePrimeiroBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.aguia_peq);
                nomePrimeiroBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.burro_peq);
                nomePrimeiroBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.borboleta_peq);
                nomePrimeiroBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.cachorro_peq);
                nomePrimeiroBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.cabra_peq);
                nomePrimeiroBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.carneiro_peq);
                nomePrimeiroBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.camelo_peq);
                nomePrimeiroBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.cobra_peq);
                nomePrimeiroBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.coelho_peq);
                nomePrimeiroBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.cavalo_peq);
                nomePrimeiroBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.elefante_peq);
                nomePrimeiroBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.galo_peq);
                nomePrimeiroBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.gato_peq);
                nomePrimeiroBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.jacare_peq);
                nomePrimeiroBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.leao_peq);
                nomePrimeiroBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.macaco_peq);
                nomePrimeiroBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.porco_peq);
                nomePrimeiroBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.pavao_peq);
                nomePrimeiroBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.peru_peq);
                nomePrimeiroBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.touro_peq);
                nomePrimeiroBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.tigre_peq);
                nomePrimeiroBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.urso_peq);
                nomePrimeiroBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.veado_peq);
                nomePrimeiroBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == pDezena) {
                primeiroBicho.setImageResource(R.drawable.vaca_peq);
                nomePrimeiroBicho.setText(R.string.nome_vaca);
            }
        }
    }

    public void segundaDezenaSorteada() {

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

        int sDezena = new Random().nextInt(99);

        if (sDezena == 0) {
            segundaDezena.setText(R.string.zero);
        } else if (sDezena == 1) {
            segundaDezena.setText(R.string.um);
        } else if (sDezena == 2) {
            segundaDezena.setText(R.string.dois);
        } else if (sDezena == 3) {
            segundaDezena.setText(R.string.trez);
        } else if (sDezena == 4) {
            segundaDezena.setText(R.string.quatro);
        } else if (sDezena == 5) {
            segundaDezena.setText(R.string.cinco);
        } else if (sDezena == 6) {
            segundaDezena.setText(R.string.seis);
        } else if (sDezena == 7) {
            segundaDezena.setText(R.string.sete);
        } else if (sDezena == 8) {
            segundaDezena.setText(R.string.oito);
        } else if (sDezena == 9) {
            segundaDezena.setText(R.string.nove);
        } else {
            segundaDezena.setText(String.valueOf(sDezena));
        }

        for (int value : avestruz) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.avestruz_peq);
                nomeSegundoBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.aguia_peq);
                nomeSegundoBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.burro_peq);
                nomeSegundoBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.borboleta_peq);
                nomeSegundoBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.cachorro_peq);
                nomeSegundoBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.cabra_peq);
                nomeSegundoBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.carneiro_peq);
                nomeSegundoBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.camelo_peq);
                nomeSegundoBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.cobra_peq);
                nomeSegundoBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.coelho_peq);
                nomeSegundoBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.cavalo_peq);
                nomeSegundoBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.elefante_peq);
                nomeSegundoBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.galo_peq);
                nomeSegundoBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.gato_peq);
                nomeSegundoBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.jacare_peq);
                nomeSegundoBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.leao_peq);
                nomeSegundoBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.macaco_peq);
                nomeSegundoBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.porco_peq);
                nomeSegundoBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.pavao_peq);
                nomeSegundoBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.peru_peq);
                nomeSegundoBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.touro_peq);
                nomeSegundoBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.tigre_peq);
                nomeSegundoBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.urso_peq);
                nomeSegundoBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.veado_peq);
                nomeSegundoBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == sDezena) {
                segundoBicho.setImageResource(R.drawable.vaca_peq);
                nomeSegundoBicho.setText(R.string.nome_vaca);
            }
        }
        textMensagem.setText("Seu palpite para hoje é:\n          " + pDezena +
                "     -     " + sDezena + "\n         BOA SORTE");
    }
}
