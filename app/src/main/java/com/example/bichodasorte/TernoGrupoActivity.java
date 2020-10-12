package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TernoGrupoActivity extends AppCompatActivity {

    private TextView textPGrupo, textSGrupo, textTGrupo;
    private TextView textNomePBicho, textNomeSBicho, textNomeTBicho;
    private TextView textMensagem;

    private ImageView imagePBicho, imageSBicho, imageTBicho;

    private Button btnPGrupo, btnSGrupo, btnTGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terno_grupo);

        textPGrupo      = findViewById(R.id.textPGrupo);
        textSGrupo      = findViewById(R.id.textSGrupo);
        textTGrupo      = findViewById(R.id.textTGrupo);
        textNomePBicho  = findViewById(R.id.textNomePBicho);
        textNomeSBicho  = findViewById(R.id.textNomeSBicho);
        textNomeTBicho  = findViewById(R.id.textNomeTBicho);
        textMensagem    = findViewById(R.id.textMensagem);
        imagePBicho     = findViewById(R.id.imagePBicho);
        imageSBicho     = findViewById(R.id.imageSBicho);
        imageTBicho     = findViewById(R.id.imageTBicho);
        btnPGrupo       = findViewById(R.id.btnPGrupo);
        btnSGrupo       = findViewById(R.id.btnSGrupo);
        btnTGrupo       = findViewById(R.id.btnTGrupo);

        btnSGrupo.setVisibility(View.INVISIBLE);
        btnTGrupo.setVisibility(View.INVISIBLE);
        textMensagem.setText(R.string.msg_boa_sorte);

        btnPGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                primeiroGSorteado();
                btnPGrupo.setVisibility(View.INVISIBLE);
                btnSGrupo.setVisibility(View.VISIBLE);
            }
        });

        btnSGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                segundoGSorteado();
                btnPGrupo.setVisibility(View.INVISIBLE);
                btnSGrupo.setVisibility(View.INVISIBLE);
                btnTGrupo.setVisibility(View.VISIBLE);
            }
        });

        btnTGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                terceiroGSorteado();
                btnPGrupo.setVisibility(View.VISIBLE);
                btnSGrupo.setVisibility(View.INVISIBLE);
                btnTGrupo.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void primeiroGSorteado() {

        int num_1 = new Random().nextInt(25 + 1);

        if (num_1 == 0) {
            textPGrupo.setText(" 1");
            imagePBicho.setImageResource(R.drawable.avestruz_peq);
            textNomePBicho.setText(R.string.nome_avestruz);
        } else if (num_1 == 1) {
            textPGrupo.setText(" 2");
            imagePBicho.setImageResource(R.drawable.aguia_peq);
            textNomePBicho.setText(R.string.nome_aguia);
        } else if (num_1 == 2) {
            textPGrupo.setText(" 3");
            imagePBicho.setImageResource(R.drawable.burro_peq);
            textNomePBicho.setText(R.string.nome_burro);
        } else if (num_1 == 3) {
            textPGrupo.setText(" 4");
            imagePBicho.setImageResource(R.drawable.borboleta_peq);
            textNomePBicho.setText(R.string.nome_borboleta);
        } else if (num_1 == 4) {
            textPGrupo.setText(" 5");
            imagePBicho.setImageResource(R.drawable.cachorro_peq);
            textNomePBicho.setText(R.string.nome_cachorro);
        } else if (num_1 == 5) {
            textPGrupo.setText(" 6");
            imagePBicho.setImageResource(R.drawable.cabra_peq);
            textNomePBicho.setText(R.string.nome_cabra);
        } else if (num_1 == 6) {
            textPGrupo.setText(" 7");
            imagePBicho.setImageResource(R.drawable.carneiro_peq);
            textNomePBicho.setText(R.string.nome_carneiro);
        } else if (num_1 == 7) {
            textPGrupo.setText(" 8");
            imagePBicho.setImageResource(R.drawable.camelo_peq);
            textNomePBicho.setText(R.string.nome_camelo);
        } else if (num_1 == 8) {
            textPGrupo.setText(" 9");
            imagePBicho.setImageResource(R.drawable.cobra_peq);
            textNomePBicho.setText(R.string.nome_cobra);
        } else if (num_1 == 9) {
            textPGrupo.setText(R.string.duq_10);
            imagePBicho.setImageResource(R.drawable.coelho_peq);
            textNomePBicho.setText(R.string.nome_coelho);
        } else if (num_1 == 10) {
            textPGrupo.setText(R.string.duq_11);
            imagePBicho.setImageResource(R.drawable.cavalo_peq);
            textNomePBicho.setText(R.string.nome_cavalo);
        } else if (num_1 == 11) {
            textPGrupo.setText(R.string.duq_12);
            imagePBicho.setImageResource(R.drawable.elefante_peq);
            textNomePBicho.setText(R.string.nome_elefante);
        } else if (num_1 == 12) {
            textPGrupo.setText(R.string.duq_13);
            imagePBicho.setImageResource(R.drawable.galo_peq);
            textNomePBicho.setText(R.string.nome_galo);
        } else if (num_1 == 13) {
            textPGrupo.setText(R.string.duq_14);
            imagePBicho.setImageResource(R.drawable.gato_peq);
            textNomePBicho.setText(R.string.nome_gato);
        } else if (num_1 == 14) {
            textPGrupo.setText(R.string.duq_15);
            imagePBicho.setImageResource(R.drawable.jacare_peq);
            textNomePBicho.setText(R.string.nome_jacare);
        } else if (num_1 == 15) {
            textPGrupo.setText(R.string.duq_16);
            imagePBicho.setImageResource(R.drawable.leao_peq);
            textNomePBicho.setText(R.string.nome_leao);
        } else if (num_1 == 16) {
            textPGrupo.setText(R.string.duq_17);
            imagePBicho.setImageResource(R.drawable.macaco_peq);
            textNomePBicho.setText(R.string.nome_macaco);
        } else if (num_1 == 17) {
            textPGrupo.setText(R.string.duq_18);
            imagePBicho.setImageResource(R.drawable.porco_peq);
            textNomePBicho.setText(R.string.nome_porco);
        } else if (num_1 == 18) {
            textPGrupo.setText(R.string.duq_19);
            imagePBicho.setImageResource(R.drawable.pavao_peq);
            textNomePBicho.setText(R.string.nome_pavao);
        } else if (num_1 == 19) {
            textPGrupo.setText(R.string.duq_20);
            imagePBicho.setImageResource(R.drawable.peru_peq);
            textNomePBicho.setText(R.string.nome_peru);
        } else if (num_1 == 20) {
            textPGrupo.setText(R.string.duq_21);
            imagePBicho.setImageResource(R.drawable.touro_peq);
            textNomePBicho.setText(R.string.nome_touro);
        } else if (num_1 == 21) {
            textPGrupo.setText(R.string.duq_22);
            imagePBicho.setImageResource(R.drawable.tigre_peq);
            textNomePBicho.setText(R.string.nome_tigre);
        } else if (num_1 == 22) {
            textPGrupo.setText(R.string.duq_23);
            imagePBicho.setImageResource(R.drawable.urso_peq);
            textNomePBicho.setText(R.string.nome_urso);
        } else if (num_1 == 23) {
            textPGrupo.setText(R.string.duq_24);
            imagePBicho.setImageResource(R.drawable.veado_peq);
            textNomePBicho.setText(R.string.nome_veado);
        } else if (num_1 == 24) {
            textPGrupo.setText(R.string.duq_25);
            imagePBicho.setImageResource(R.drawable.vaca_peq);
            textNomePBicho.setText(R.string.nome_vaca);
        }
    }

    public void segundoGSorteado() {

        int num_2 = new Random().nextInt(25 + 1);

        if (num_2 == 0) {
            textSGrupo.setText(" 1");
            imageSBicho.setImageResource(R.drawable.avestruz_peq);
            textNomeSBicho.setText(R.string.nome_avestruz);
        } else if (num_2 == 1) {
            textSGrupo.setText(" 2");
            imageSBicho.setImageResource(R.drawable.aguia_peq);
            textNomeSBicho.setText(R.string.nome_aguia);
        } else if (num_2 == 2) {
            textSGrupo.setText(" 3");
            imageSBicho.setImageResource(R.drawable.burro_peq);
            textNomeSBicho.setText(R.string.nome_burro);
        } else if (num_2 == 3) {
            textSGrupo.setText(" 4");
            imageSBicho.setImageResource(R.drawable.borboleta_peq);
            textNomeSBicho.setText(R.string.nome_borboleta);
        } else if (num_2 == 4) {
            textSGrupo.setText(" 5");
            imageSBicho.setImageResource(R.drawable.cachorro_peq);
            textNomeSBicho.setText(R.string.nome_cachorro);
        } else if (num_2 == 5) {
            textSGrupo.setText(" 6");
            imageSBicho.setImageResource(R.drawable.cabra_peq);
            textNomeSBicho.setText(R.string.nome_cabra);
        } else if (num_2 == 6) {
            textSGrupo.setText(" 7");
            imageSBicho.setImageResource(R.drawable.carneiro_peq);
            textNomeSBicho.setText(R.string.nome_carneiro);
        } else if (num_2 == 7) {
            textSGrupo.setText(" 8");
            imageSBicho.setImageResource(R.drawable.camelo_peq);
            textNomeSBicho.setText(R.string.nome_camelo);
        } else if (num_2 == 8) {
            textSGrupo.setText(" 9");
            imageSBicho.setImageResource(R.drawable.cobra_peq);
            textNomeSBicho.setText(R.string.nome_cobra);
        } else if (num_2 == 9) {
            textSGrupo.setText(R.string.duq_10);
            imageSBicho.setImageResource(R.drawable.coelho_peq);
            textNomeSBicho.setText(R.string.nome_coelho);
        } else if (num_2 == 10) {
            textSGrupo.setText(R.string.duq_11);
            imageSBicho.setImageResource(R.drawable.cavalo_peq);
            textNomeSBicho.setText(R.string.nome_cavalo);
        } else if (num_2 == 11) {
            textSGrupo.setText(R.string.duq_12);
            imageSBicho.setImageResource(R.drawable.elefante_peq);
            textNomeSBicho.setText(R.string.nome_elefante);
        } else if (num_2 == 12) {
            textSGrupo.setText(R.string.duq_13);
            imageSBicho.setImageResource(R.drawable.galo_peq);
            textNomeSBicho.setText(R.string.nome_galo);
        } else if (num_2 == 13) {
            textSGrupo.setText(R.string.duq_14);
            imageSBicho.setImageResource(R.drawable.gato_peq);
            textNomeSBicho.setText(R.string.nome_gato);
        } else if (num_2 == 14) {
            textSGrupo.setText(R.string.duq_15);
            imageSBicho.setImageResource(R.drawable.jacare_peq);
            textNomeSBicho.setText(R.string.nome_jacare);
        } else if (num_2 == 15) {
            textSGrupo.setText(R.string.duq_16);
            imageSBicho.setImageResource(R.drawable.leao_peq);
            textNomeSBicho.setText(R.string.nome_leao);
        } else if (num_2 == 16) {
            textSGrupo.setText(R.string.duq_17);
            imageSBicho.setImageResource(R.drawable.macaco_peq);
            textNomeSBicho.setText(R.string.nome_macaco);
        } else if (num_2 == 17) {
            textSGrupo.setText(R.string.duq_18);
            imageSBicho.setImageResource(R.drawable.porco_peq);
            textNomeSBicho.setText(R.string.nome_porco);
        } else if (num_2 == 18) {
            textSGrupo.setText(R.string.duq_19);
            imageSBicho.setImageResource(R.drawable.pavao_peq);
            textNomeSBicho.setText(R.string.nome_pavao);
        } else if (num_2 == 19) {
            textSGrupo.setText(R.string.duq_20);
            imageSBicho.setImageResource(R.drawable.peru_peq);
            textNomeSBicho.setText(R.string.nome_peru);
        } else if (num_2 == 20) {
            textSGrupo.setText(R.string.duq_21);
            imageSBicho.setImageResource(R.drawable.touro_peq);
            textNomeSBicho.setText(R.string.nome_touro);
        } else if (num_2 == 21) {
            textSGrupo.setText(R.string.duq_22);
            imageSBicho.setImageResource(R.drawable.tigre_peq);
            textNomeSBicho.setText(R.string.nome_tigre);
        } else if (num_2 == 22) {
            textSGrupo.setText(R.string.duq_23);
            imageSBicho.setImageResource(R.drawable.urso_peq);
            textNomeSBicho.setText(R.string.nome_urso);
        } else if (num_2 == 23) {
            textSGrupo.setText(R.string.duq_24);
            imageSBicho.setImageResource(R.drawable.veado_peq);
            textNomeSBicho.setText(R.string.nome_veado);
        } else if (num_2 == 24) {
            textSGrupo.setText(R.string.duq_25);
            imageSBicho.setImageResource(R.drawable.vaca_peq);
            textNomeSBicho.setText(R.string.nome_vaca);
        }
    }

    public void terceiroGSorteado() {

        int num_3 = new Random().nextInt(25 + 1);

        if (num_3 == 0) {
            textTGrupo.setText(" 1");
            imageTBicho.setImageResource(R.drawable.avestruz_peq);
            textNomeTBicho.setText(R.string.nome_avestruz);
        } else if (num_3 == 1) {
            textTGrupo.setText(" 2");
            imageTBicho.setImageResource(R.drawable.aguia_peq);
            textNomeTBicho.setText(R.string.nome_aguia);
        } else if (num_3 == 2) {
            textTGrupo.setText(" 3");
            imageTBicho.setImageResource(R.drawable.burro_peq);
            textNomeTBicho.setText(R.string.nome_burro);
        } else if (num_3 == 3) {
            textTGrupo.setText(" 4");
            imageTBicho.setImageResource(R.drawable.borboleta_peq);
            textNomeTBicho.setText(R.string.nome_borboleta);
        } else if (num_3 == 4) {
            textTGrupo.setText(" 5");
            imageTBicho.setImageResource(R.drawable.cachorro_peq);
            textNomeTBicho.setText(R.string.nome_cachorro);
        } else if (num_3 == 5) {
            textTGrupo.setText(" 6");
            imageTBicho.setImageResource(R.drawable.cabra_peq);
            textNomeTBicho.setText(R.string.nome_cabra);
        } else if (num_3 == 6) {
            textTGrupo.setText(" 7");
            imageTBicho.setImageResource(R.drawable.carneiro_peq);
            textNomeTBicho.setText(R.string.nome_carneiro);
        } else if (num_3 == 7) {
            textTGrupo.setText(" 8");
            imageTBicho.setImageResource(R.drawable.camelo_peq);
            textNomeTBicho.setText(R.string.nome_camelo);
        } else if (num_3 == 8) {
            textTGrupo.setText(" 9");
            imageTBicho.setImageResource(R.drawable.cobra_peq);
            textNomeTBicho.setText(R.string.nome_cobra);
        } else if (num_3 == 9) {
            textTGrupo.setText(R.string.duq_10);
            imageTBicho.setImageResource(R.drawable.coelho_peq);
            textNomeTBicho.setText(R.string.nome_coelho);
        } else if (num_3 == 10) {
            textTGrupo.setText(R.string.duq_11);
            imageTBicho.setImageResource(R.drawable.cavalo_peq);
            textNomeTBicho.setText(R.string.nome_cavalo);
        } else if (num_3 == 11) {
            textTGrupo.setText(R.string.duq_12);
            imageTBicho.setImageResource(R.drawable.elefante_peq);
            textNomeTBicho.setText(R.string.nome_elefante);
        } else if (num_3 == 12) {
            textTGrupo.setText(R.string.duq_13);
            imageTBicho.setImageResource(R.drawable.galo_peq);
            textNomeTBicho.setText(R.string.nome_galo);
        } else if (num_3 == 13) {
            textTGrupo.setText(R.string.duq_14);
            imageTBicho.setImageResource(R.drawable.gato_peq);
            textNomeTBicho.setText(R.string.nome_gato);
        } else if (num_3 == 14) {
            textTGrupo.setText(R.string.duq_15);
            imageTBicho.setImageResource(R.drawable.jacare_peq);
            textNomeTBicho.setText(R.string.nome_jacare);
        } else if (num_3 == 15) {
            textTGrupo.setText(R.string.duq_16);
            imageTBicho.setImageResource(R.drawable.leao_peq);
            textNomeTBicho.setText(R.string.nome_leao);
        } else if (num_3 == 16) {
            textTGrupo.setText(R.string.duq_17);
            imageTBicho.setImageResource(R.drawable.macaco_peq);
            textNomeTBicho.setText(R.string.nome_macaco);
        } else if (num_3 == 17) {
            textTGrupo.setText(R.string.duq_18);
            imageTBicho.setImageResource(R.drawable.porco_peq);
            textNomeTBicho.setText(R.string.nome_porco);
        } else if (num_3 == 18) {
            textTGrupo.setText(R.string.duq_19);
            imageTBicho.setImageResource(R.drawable.pavao_peq);
            textNomeTBicho.setText(R.string.nome_pavao);
        } else if (num_3 == 19) {
            textTGrupo.setText(R.string.duq_20);
            imageTBicho.setImageResource(R.drawable.peru_peq);
            textNomeTBicho.setText(R.string.nome_peru);
        } else if (num_3 == 20) {
            textTGrupo.setText(R.string.duq_21);
            imageTBicho.setImageResource(R.drawable.touro_peq);
            textNomeTBicho.setText(R.string.nome_touro);
        } else if (num_3 == 21) {
            textTGrupo.setText(R.string.duq_22);
            imageTBicho.setImageResource(R.drawable.tigre_peq);
            textNomeTBicho.setText(R.string.nome_tigre);
        } else if (num_3 == 22) {
            textTGrupo.setText(R.string.duq_23);
            imageTBicho.setImageResource(R.drawable.urso_peq);
            textNomeTBicho.setText(R.string.nome_urso);
        } else if (num_3 == 23) {
            textTGrupo.setText(R.string.duq_24);
            imageTBicho.setImageResource(R.drawable.veado_peq);
            textNomeTBicho.setText(R.string.nome_veado);
        } else if (num_3 == 24) {
            textTGrupo.setText(R.string.duq_25);
            imageTBicho.setImageResource(R.drawable.vaca_peq);
            textNomeTBicho.setText(R.string.nome_vaca);
        }

        textMensagem.setText("Seu palpite para hoje é: \n" + textNomePBicho.getText() + " - "
                + textNomeSBicho.getText() + " - " + textNomeTBicho.getText() +"\n BOA SORTE!");

    }
}
