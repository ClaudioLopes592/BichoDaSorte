package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TernoDezenaActivity extends AppCompatActivity {

    private TextView textPDezena, textSDezena, textTDezena;
    private TextView nomePBicho, nomeSBicho, nomeTBicho;
    private TextView textMensagem;

    private Button btnPDezena, btnSDezena, btnTDezena;

    private ImageView imagePBicho, imageSBicho, imageTBicho;

    private int pDezena;
    private int sDezena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terno_dezena);

        textPDezena     = findViewById(R.id.textPDezena);
        textSDezena     = findViewById(R.id.textSDezena);
        textTDezena     = findViewById(R.id.textTDezena);
        nomePBicho      = findViewById(R.id.nomePBicho);
        nomeSBicho = findViewById(R.id.nomeSBicho);
        nomeTBicho = findViewById(R.id.nomeTBicho);
        textMensagem    = findViewById(R.id.textMensagem);
        imagePBicho     = findViewById(R.id.imagePBicho);
        imageSBicho = findViewById(R.id.imageSBicho);
        imageTBicho = findViewById(R.id.imageTBicho);
        btnPDezena      = findViewById(R.id.btnPDezena);
        btnSDezena      = findViewById(R.id.btnSDezena);
        btnTDezena      = findViewById(R.id.btnTDezena);

        btnSDezena.setVisibility(View.INVISIBLE);
        btnTDezena.setVisibility(View.INVISIBLE);
        textMensagem.setText(R.string.msg_boa_sorte);

        btnPDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                primeiraDezenaSorteada();
                btnPDezena.setVisibility(View.INVISIBLE);
                btnSDezena.setVisibility(View.VISIBLE);
            }
        });

        btnSDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                segundaDezenaSorteada();
                btnPDezena.setVisibility(View.INVISIBLE);
                btnSDezena.setVisibility(View.INVISIBLE);
                btnTDezena.setVisibility(View.VISIBLE);
            }
        });

        btnTDezena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                terceiraDezenaSorteada();
                btnPDezena.setVisibility(View.VISIBLE);
                btnSDezena.setVisibility(View.INVISIBLE);
                btnTDezena.setVisibility(View.INVISIBLE);
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
            textPDezena.setText(R.string.zero);
        } else if (pDezena == 1) {
            textPDezena.setText(R.string.um);
        } else if (pDezena == 2) {
            textPDezena.setText(R.string.dois);
        } else if (pDezena == 3) {
            textPDezena.setText(R.string.trez);
        } else if (pDezena == 4) {
            textPDezena.setText(R.string.quatro);
        } else if (pDezena == 5) {
            textPDezena.setText(R.string.cinco);
        } else if (pDezena == 6) {
            textPDezena.setText(R.string.seis);
        } else if (pDezena == 7) {
            textPDezena.setText(R.string.sete);
        } else if (pDezena == 8) {
            textPDezena.setText(R.string.oito);
        } else if (pDezena == 9) {
            textPDezena.setText(R.string.nove);
        } else {
            textPDezena.setText(String.valueOf(pDezena));
        }

        for (int value : avestruz) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.avestruz_peq);
                nomePBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.aguia_peq);
                nomePBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.burro_peq);
                nomePBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.borboleta_peq);
                nomePBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.cachorro_peq);
                nomePBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.cabra_peq);
                nomePBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.carneiro_peq);
                nomePBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.camelo_peq);
                nomePBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.cobra_peq);
                nomePBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.coelho_peq);
                nomePBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.cavalo_peq);
                nomePBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.elefante_peq);
                nomePBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.galo_peq);
                nomePBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.gato);
                nomePBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.jacare_peq);
                nomePBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.leao_peq);
                nomePBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.macaco_peq);
                nomePBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.porco_peq);
                nomePBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.pavao_peq);
                nomePBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.peru_peq);
                nomePBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.touro_peq);
                nomePBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.tigre_peq);
                nomePBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.urso_peq);
                nomePBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.veado_peq);
                nomePBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == pDezena) {
                imagePBicho.setImageResource(R.drawable.vaca_peq);
                nomePBicho.setText(R.string.nome_vaca);
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

        sDezena = new Random().nextInt(99);

        if (sDezena == 0) {
            textSDezena.setText(R.string.zero);
        } else if (sDezena == 1) {
            textSDezena.setText(R.string.um);
        } else if (sDezena == 2) {
            textSDezena.setText(R.string.dois);
        } else if (sDezena == 3) {
            textSDezena.setText(R.string.trez);
        } else if (sDezena == 4) {
            textSDezena.setText(R.string.quatro);
        } else if (sDezena == 5) {
            textSDezena.setText(R.string.cinco);
        } else if (sDezena == 6) {
            textSDezena.setText(R.string.seis);
        } else if (sDezena == 7) {
            textSDezena.setText(R.string.sete);
        } else if (sDezena == 8) {
            textSDezena.setText(R.string.oito);
        } else if (sDezena == 9) {
            textSDezena.setText(R.string.nove);
        } else {
            textSDezena.setText(String.valueOf(sDezena));
        }

        for (int value : avestruz) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.avestruz_peq);
                nomeSBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.aguia_peq);
                nomeSBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.burro_peq);
                nomeSBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.borboleta_peq);
                nomeSBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.cachorro_peq);
                nomeSBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.cabra_peq);
                nomeSBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.carneiro_peq);
                nomeSBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.camelo_peq);
                nomeSBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.cobra_peq);
                nomeSBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.coelho_peq);
                nomeSBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.cavalo_peq);
                nomeSBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.elefante_peq);
                nomeSBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.galo_peq);
                nomeSBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.gato);
                nomeSBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.jacare_peq);
                nomeSBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.leao_peq);
                nomeSBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.macaco_peq);
                nomeSBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.porco_peq);
                nomeSBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.pavao_peq);
                nomeSBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.peru_peq);
                nomeSBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.touro_peq);
                nomeSBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.tigre_peq);
                nomeSBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.urso_peq);
                nomeSBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.veado_peq);
                nomeSBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == sDezena) {
                imageSBicho.setImageResource(R.drawable.vaca_peq);
                nomeSBicho.setText(R.string.nome_vaca);
            }
        }
    }

    public void terceiraDezenaSorteada() {

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

        int tDezena = new Random().nextInt(99);

        if (tDezena == 0) {
            textTDezena.setText(R.string.zero);
        } else if (tDezena == 1) {
            textTDezena.setText(R.string.um);
        } else if (tDezena == 2) {
            textTDezena.setText(R.string.dois);
        } else if (tDezena == 3) {
            textTDezena.setText(R.string.trez);
        } else if (tDezena == 4) {
            textTDezena.setText(R.string.quatro);
        } else if (tDezena == 5) {
            textTDezena.setText(R.string.cinco);
        } else if (tDezena == 6) {
            textTDezena.setText(R.string.seis);
        } else if (tDezena == 7) {
            textTDezena.setText(R.string.sete);
        } else if (tDezena == 8) {
            textTDezena.setText(R.string.oito);
        } else if (tDezena == 9) {
            textTDezena.setText(R.string.nove);
        } else {
            textTDezena.setText(String.valueOf(tDezena));
        }

        for (int value : avestruz) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.avestruz_peq);
                nomeTBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.aguia_peq);
                nomeTBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.burro_peq);
                nomeTBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.borboleta_peq);
                nomeTBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.cachorro_peq);
                nomeTBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.cabra_peq);
                nomeTBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.carneiro_peq);
                nomeTBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.camelo_peq);
                nomeTBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.cobra_peq);
                nomeTBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.coelho_peq);
                nomeTBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.cavalo_peq);
                nomeTBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.elefante_peq);
                nomeTBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.galo_peq);
                nomeTBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.gato);
                nomeTBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.jacare_peq);
                nomeTBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.leao_peq);
                nomeTBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.macaco_peq);
                nomeTBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.porco_peq);
                nomeTBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.pavao_peq);
                nomeTBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.peru_peq);
                nomeTBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.touro_peq);
                nomeTBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.tigre_peq);
                nomeTBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.urso_peq);
                nomeTBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.veado_peq);
                nomeTBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == tDezena) {
                imageTBicho.setImageResource(R.drawable.vaca_peq);
                nomeTBicho.setText(R.string.nome_vaca);
            }
        }
        textMensagem.setText("Seu palpite da sorte é: \n" + pDezena + " - " +
                sDezena + " - " + tDezena + "\n BOA SORTE! ");
    }
}
