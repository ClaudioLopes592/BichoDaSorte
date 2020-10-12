package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DuqueGrupoActivity extends AppCompatActivity {

    private TextView textPGSorteado, textSGSorteado;
    private TextView textPGrupoSorteado, textSGrupoSorteado;
    private ImageView imagePGSorteado, imageSGSorteado;

    private Button btnPGSorteado, btnSGSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duque_grupo);

        textPGSorteado      = findViewById(R.id.textPGSorteado);
        textSGSorteado      = findViewById(R.id.textSGSorteado);
        textPGrupoSorteado  = findViewById(R.id.textPGrupoSorteado);
        textSGrupoSorteado  = findViewById(R.id.textSGrupoSorteado);
        btnPGSorteado = findViewById(R.id.btnPGSorteado);
        btnSGSorteado = findViewById(R.id.btnSGSorteado);
        imagePGSorteado     = findViewById(R.id.imagePGSorteado);
        imageSGSorteado     = findViewById(R.id.imageSGSorteado);

        btnSGSorteado.setVisibility(View.INVISIBLE);

        btnPGSorteado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                primeiroGrupoSorteado();
                btnSGSorteado.setVisibility(View.VISIBLE);
                btnPGSorteado.setVisibility(View.INVISIBLE);
            }
        });

        btnSGSorteado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                segundoGrupoSorteado();
                btnSGSorteado.setVisibility(View.INVISIBLE);
                btnPGSorteado.setVisibility(View.VISIBLE);
            }
        });
    }

    public void primeiroGrupoSorteado() {

        int num_1 = new Random().nextInt(25 + 1);

        if (num_1 == 0) {
            textPGSorteado.setText(" 1");
            imagePGSorteado.setImageResource(R.drawable.avestruz_peq);
            textPGrupoSorteado.setText(R.string.nome_avestruz);
        } else if (num_1 == 1) {
            textPGSorteado.setText(" 2");
            imagePGSorteado.setImageResource(R.drawable.aguia_peq);
            textPGrupoSorteado.setText(R.string.nome_aguia);
        } else if (num_1 == 2) {
            textPGSorteado.setText(" 3");
            imagePGSorteado.setImageResource(R.drawable.burro_peq);
            textPGrupoSorteado.setText(R.string.nome_burro);
        } else if (num_1 == 3) {
            textPGSorteado.setText(" 4");
            imagePGSorteado.setImageResource(R.drawable.borboleta_peq);
            textPGrupoSorteado.setText(R.string.nome_borboleta);
        } else if (num_1 == 4) {
            textPGSorteado.setText(" 5");
            imagePGSorteado.setImageResource(R.drawable.cachorro_peq);
            textPGrupoSorteado.setText(R.string.nome_cachorro);
        } else if (num_1 == 5) {
            textPGSorteado.setText(" 6");
            imagePGSorteado.setImageResource(R.drawable.cabra_peq);
            textPGrupoSorteado.setText(R.string.nome_cabra);
        } else if (num_1 == 6) {
            textPGSorteado.setText(" 7");
            imagePGSorteado.setImageResource(R.drawable.carneiro_peq);
            textPGrupoSorteado.setText(R.string.nome_carneiro);
        } else if (num_1 == 7) {
            textPGSorteado.setText(" 8");
            imagePGSorteado.setImageResource(R.drawable.camelo_peq);
            textPGrupoSorteado.setText(R.string.nome_camelo);
        } else if (num_1 == 8) {
            textPGSorteado.setText(" 9");
            imagePGSorteado.setImageResource(R.drawable.cobra_peq);
            textPGrupoSorteado.setText(R.string.nome_cobra);
        } else if (num_1 == 9) {
            textPGSorteado.setText(R.string.duq_10);
            imagePGSorteado.setImageResource(R.drawable.coelho_peq);
            textPGrupoSorteado.setText(R.string.nome_coelho);
        } else if (num_1 == 10) {
            textPGSorteado.setText(R.string.duq_11);
            imagePGSorteado.setImageResource(R.drawable.cavalo_peq);
            textPGrupoSorteado.setText(R.string.nome_cavalo);
        } else if (num_1 == 11) {
            textPGSorteado.setText(R.string.duq_12);
            imagePGSorteado.setImageResource(R.drawable.elefante_peq);
            textPGrupoSorteado.setText(R.string.nome_elefante);
        } else if (num_1 == 12) {
            textPGSorteado.setText(R.string.duq_13);
            imagePGSorteado.setImageResource(R.drawable.galo_peq);
            textPGrupoSorteado.setText(R.string.nome_galo);
        } else if (num_1 == 13) {
            textPGSorteado.setText(R.string.duq_14);
            imagePGSorteado.setImageResource(R.drawable.gato_peq);
            textPGrupoSorteado.setText(R.string.nome_gato);
        } else if (num_1 == 14) {
            textPGSorteado.setText(R.string.duq_15);
            imagePGSorteado.setImageResource(R.drawable.jacare_peq);
            textPGrupoSorteado.setText(R.string.nome_jacare);
        } else if (num_1 == 15) {
            textPGSorteado.setText(R.string.duq_16);
            imagePGSorteado.setImageResource(R.drawable.leao_peq);
            textPGrupoSorteado.setText(R.string.nome_leao);
        } else if (num_1 == 16) {
            textPGSorteado.setText(R.string.duq_17);
            imagePGSorteado.setImageResource(R.drawable.macaco_peq);
            textPGrupoSorteado.setText(R.string.nome_macaco);
        } else if (num_1 == 17) {
            textPGSorteado.setText(R.string.duq_18);
            imagePGSorteado.setImageResource(R.drawable.porco_peq);
            textPGrupoSorteado.setText(R.string.nome_porco);
        } else if (num_1 == 18) {
            textPGSorteado.setText(R.string.duq_19);
            imagePGSorteado.setImageResource(R.drawable.pavao_peq);
            textPGrupoSorteado.setText(R.string.nome_pavao);
        } else if (num_1 == 19) {
            textPGSorteado.setText(R.string.duq_20);
            imagePGSorteado.setImageResource(R.drawable.peru_peq);
            textPGrupoSorteado.setText(R.string.nome_peru);
        } else if (num_1 == 20) {
            textPGSorteado.setText(R.string.duq_21);
            imagePGSorteado.setImageResource(R.drawable.touro_peq);
            textPGrupoSorteado.setText(R.string.nome_touro);
        } else if (num_1 == 21) {
            textPGSorteado.setText(R.string.duq_22);
            imagePGSorteado.setImageResource(R.drawable.tigre_peq);
            textPGrupoSorteado.setText(R.string.nome_tigre);
        } else if (num_1 == 22) {
            textPGSorteado.setText(R.string.duq_23);
            imagePGSorteado.setImageResource(R.drawable.urso_peq);
            textPGrupoSorteado.setText(R.string.nome_urso);
        } else if (num_1 == 23) {
            textPGSorteado.setText(R.string.duq_24);
            imagePGSorteado.setImageResource(R.drawable.veado_peq);
            textPGrupoSorteado.setText(R.string.nome_veado);
        } else if (num_1 == 24) {
            textPGSorteado.setText(R.string.duq_25);
            imagePGSorteado.setImageResource(R.drawable.vaca_peq);
            textPGrupoSorteado.setText(R.string.nome_vaca);
        }
    }

    public void segundoGrupoSorteado() {

        int num_2 = new Random().nextInt(25 + 1);

        if (num_2 == 0) {
            textSGSorteado.setText(" 1");
            imageSGSorteado.setImageResource(R.drawable.avestruz_peq);
            textSGrupoSorteado.setText(R.string.nome_avestruz);
        } else if (num_2 == 1) {
            textSGSorteado.setText(" 2");
            imageSGSorteado.setImageResource(R.drawable.aguia_peq);
            textSGrupoSorteado.setText(R.string.nome_aguia);
        } else if (num_2 == 2) {
            textSGSorteado.setText(" 3");
            imageSGSorteado.setImageResource(R.drawable.burro_peq);
            textSGrupoSorteado.setText(R.string.nome_burro);
        } else if (num_2 == 3) {
            textSGSorteado.setText(" 4");
            imageSGSorteado.setImageResource(R.drawable.borboleta_peq);
            textSGrupoSorteado.setText(R.string.nome_borboleta);
        } else if (num_2 == 4) {
            textSGSorteado.setText(" 5");
            imageSGSorteado.setImageResource(R.drawable.cachorro_peq);
            textSGrupoSorteado.setText(R.string.nome_cachorro);
        } else if (num_2 == 5) {
            textSGSorteado.setText(" 6");
            imageSGSorteado.setImageResource(R.drawable.cabra_peq);
            textSGrupoSorteado.setText(R.string.nome_cabra);
        } else if (num_2 == 6) {
            textSGSorteado.setText(" 7");
            imageSGSorteado.setImageResource(R.drawable.carneiro_peq);
            textSGrupoSorteado.setText(R.string.nome_carneiro);
        } else if (num_2 == 7) {
            textSGSorteado.setText(" 8");
            imageSGSorteado.setImageResource(R.drawable.camelo_peq);
            textSGrupoSorteado.setText(R.string.nome_camelo);
        } else if (num_2 == 8) {
            textSGSorteado.setText(" 9");
            imageSGSorteado.setImageResource(R.drawable.cobra_peq);
            textSGrupoSorteado.setText(R.string.nome_cobra);
        } else if (num_2 == 9) {
            textSGSorteado.setText(R.string.duq_10);
            imageSGSorteado.setImageResource(R.drawable.coelho_peq);
            textSGrupoSorteado.setText(R.string.nome_coelho);
        } else if (num_2 == 10) {
            textSGSorteado.setText(R.string.duq_11);
            imageSGSorteado.setImageResource(R.drawable.cavalo_peq);
            textSGrupoSorteado.setText(R.string.nome_cavalo);
        } else if (num_2 == 11) {
            textSGSorteado.setText(R.string.duq_12);
            imageSGSorteado.setImageResource(R.drawable.elefante_peq);
            textSGrupoSorteado.setText(R.string.nome_elefante);
        } else if (num_2 == 12) {
            textSGSorteado.setText(R.string.duq_13);
            imageSGSorteado.setImageResource(R.drawable.galo_peq);
            textSGrupoSorteado.setText(R.string.nome_galo);
        } else if (num_2 == 13) {
            textSGSorteado.setText(R.string.duq_14);
            imageSGSorteado.setImageResource(R.drawable.gato_peq);
            textSGrupoSorteado.setText(R.string.nome_gato);
        } else if (num_2 == 14) {
            textSGSorteado.setText(R.string.duq_15);
            imageSGSorteado.setImageResource(R.drawable.jacare_peq);
            textSGrupoSorteado.setText(R.string.nome_jacare);
        } else if (num_2 == 15) {
            textSGSorteado.setText(R.string.duq_16);
            imageSGSorteado.setImageResource(R.drawable.leao_peq);
            textSGrupoSorteado.setText(R.string.nome_leao);
        } else if (num_2 == 16) {
            textSGSorteado.setText(R.string.duq_17);
            imageSGSorteado.setImageResource(R.drawable.macaco_peq);
            textSGrupoSorteado.setText(R.string.nome_macaco);
        } else if (num_2 == 17) {
            textSGSorteado.setText(R.string.duq_18);
            imageSGSorteado.setImageResource(R.drawable.porco_peq);
            textSGrupoSorteado.setText(R.string.nome_porco);
        } else if (num_2 == 18) {
            textSGSorteado.setText(R.string.duq_19);
            imageSGSorteado.setImageResource(R.drawable.pavao_peq);
            textSGrupoSorteado.setText(R.string.nome_pavao);
        } else if (num_2 == 19) {
            textSGSorteado.setText(R.string.duq_20);
            imageSGSorteado.setImageResource(R.drawable.peru_peq);
            textSGrupoSorteado.setText(R.string.nome_peru);
        } else if (num_2 == 20) {
            textSGSorteado.setText(R.string.duq_21);
            imageSGSorteado.setImageResource(R.drawable.touro_peq);
            textSGrupoSorteado.setText(R.string.nome_touro);
        } else if (num_2 == 21) {
            textSGSorteado.setText(R.string.duq_22);
            imageSGSorteado.setImageResource(R.drawable.tigre_peq);
            textSGrupoSorteado.setText(R.string.nome_tigre);
        } else if (num_2 == 22) {
            textSGSorteado.setText(R.string.duq_23);
            imageSGSorteado.setImageResource(R.drawable.urso_peq);
            textSGrupoSorteado.setText(R.string.nome_urso);
        } else if (num_2 == 23) {
            textSGSorteado.setText(R.string.duq_24);
            imageSGSorteado.setImageResource(R.drawable.veado_peq);
            textSGrupoSorteado.setText(R.string.nome_veado);
        } else if (num_2 == 24) {
            textSGSorteado.setText(R.string.duq_25);
            imageSGSorteado.setImageResource(R.drawable.vaca_peq);
            textSGrupoSorteado.setText(R.string.nome_vaca);
        }
    }
}
