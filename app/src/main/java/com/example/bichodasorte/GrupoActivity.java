package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GrupoActivity extends AppCompatActivity {

    private TextView textGrupoSorteado, textMsgGrupo;
    private ImageView imageBichoGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo);

        textGrupoSorteado   = findViewById(R.id.textGrupoSorteado);
        textMsgGrupo        = findViewById(R.id.textMsgGrupo);
        Button btnSortearGrupo = findViewById(R.id.btnSortearGrupo);
        imageBichoGrupo     = findViewById(R.id.imageBichoGrupo);

        btnSortearGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grupoSorteado();

            }
        });
    }

    public void grupoSorteado() {

        int num = new Random().nextInt(25 + 1);

        if (num == 0) {
            textGrupoSorteado.setText(" 1");
            imageBichoGrupo.setImageResource(R.drawable.avestruz);
            textMsgGrupo.setText(R.string.msg_1);
        } else if (num == 1) {
            textGrupoSorteado.setText(" 2");
            imageBichoGrupo.setImageResource(R.drawable.aguia);
            textMsgGrupo.setText(R.string.msg_2);
        } else if (num == 2) {
            textGrupoSorteado.setText(" 3");
            imageBichoGrupo.setImageResource(R.drawable.burro);
            textMsgGrupo.setText(R.string.msg_3);
        } else if (num == 3) {
            textGrupoSorteado.setText(" 4");
            imageBichoGrupo.setImageResource(R.drawable.borboleta);
            textMsgGrupo.setText(R.string.msg_4);
        } else if (num == 4) {
            textGrupoSorteado.setText(" 5");
            imageBichoGrupo.setImageResource(R.drawable.cachorro);
            textMsgGrupo.setText(R.string.msg_5);
        } else if (num == 5) {
            textGrupoSorteado.setText(" 6");
            imageBichoGrupo.setImageResource(R.drawable.cabra);
            textMsgGrupo.setText(R.string.msg_6);
        } else if (num == 6) {
            textGrupoSorteado.setText(" 7");
            imageBichoGrupo.setImageResource(R.drawable.carneiro);
            textMsgGrupo.setText(R.string.msg_7);
        } else if (num == 7) {
            textGrupoSorteado.setText(" 8");
            imageBichoGrupo.setImageResource(R.drawable.camelo);
            textMsgGrupo.setText(R.string.msg_8);
        } else if (num == 8) {
            textGrupoSorteado.setText(" 9");
            imageBichoGrupo.setImageResource(R.drawable.cobra);
            textMsgGrupo.setText(R.string.msg_9);
        } else if (num == 9) {
            textGrupoSorteado.setText(R.string.dez);
            imageBichoGrupo.setImageResource(R.drawable.coelho);
            textMsgGrupo.setText(R.string.msg_10);
        } else if (num == 10) {
            textGrupoSorteado.setText(R.string.onze);
            imageBichoGrupo.setImageResource(R.drawable.cavalo);
            textMsgGrupo.setText(R.string.msg_11);
        } else if (num == 11) {
            textGrupoSorteado.setText(R.string.doze);
            imageBichoGrupo.setImageResource(R.drawable.elefante);
            textMsgGrupo.setText(R.string.msg_12);
        } else if (num == 12) {
            textGrupoSorteado.setText(R.string.treze);
            imageBichoGrupo.setImageResource(R.drawable.galo);
            textMsgGrupo.setText(R.string.msg_13);
        } else if (num == 13) {
            textGrupoSorteado.setText(R.string.quatorze);
            imageBichoGrupo.setImageResource(R.drawable.gato);
            textMsgGrupo.setText(R.string.msg_14);
        } else if (num == 14) {
            textGrupoSorteado.setText(R.string.quinze);
            imageBichoGrupo.setImageResource(R.drawable.jacare);
            textMsgGrupo.setText(R.string.msg_15);
        } else if (num == 15) {
            textGrupoSorteado.setText(R.string.dezesseis);
            imageBichoGrupo.setImageResource(R.drawable.leao);
            textMsgGrupo.setText(R.string.msg_16);
        } else if (num == 16) {
            textGrupoSorteado.setText(R.string.dezessete);
            imageBichoGrupo.setImageResource(R.drawable.macaco);
            textMsgGrupo.setText(R.string.msg_17);
        } else if (num == 17) {
            textGrupoSorteado.setText(R.string.dezoito);
            imageBichoGrupo.setImageResource(R.drawable.porco);
            textMsgGrupo.setText(R.string.msg_18);
        } else if (num == 18) {
            textGrupoSorteado.setText(R.string.dezenove);
            imageBichoGrupo.setImageResource(R.drawable.pavao);
            textMsgGrupo.setText(R.string.msg_19);
        } else if (num == 19) {
            textGrupoSorteado.setText(R.string.vinte);
            imageBichoGrupo.setImageResource(R.drawable.peru);
            textMsgGrupo.setText(R.string.msg_20);
        } else if (num == 20) {
            textGrupoSorteado.setText(R.string.vinte_um);
            imageBichoGrupo.setImageResource(R.drawable.touro);
            textMsgGrupo.setText(R.string.msg_21);
        } else if (num == 21) {
            textGrupoSorteado.setText(R.string.vinte_dois);
            imageBichoGrupo.setImageResource(R.drawable.tigre);
            textMsgGrupo.setText(R.string.msg_22);
        } else if (num == 22) {
            textGrupoSorteado.setText(R.string.vinte_trez);
            imageBichoGrupo.setImageResource(R.drawable.urso);
            textMsgGrupo.setText(R.string.msg_23);
        } else if (num == 23) {
            textGrupoSorteado.setText(R.string.vinte_quatro);
            imageBichoGrupo.setImageResource(R.drawable.veado);
            textMsgGrupo.setText(R.string.msg_24);
        } else if (num == 24) {
            textGrupoSorteado.setText(R.string.vinte_cinco);
            imageBichoGrupo.setImageResource(R.drawable.vaca);
            textMsgGrupo.setText(R.string.msg_25);
        }
    }
}
