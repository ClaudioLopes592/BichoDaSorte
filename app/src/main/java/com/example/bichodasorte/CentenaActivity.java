package com.example.bichodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CentenaActivity extends AppCompatActivity {

    private TextView textCentenaSorteada, textNomeBicho;

    private ImageView imageBicho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centena);

        textCentenaSorteada         = findViewById(R.id.textCentenaSorteada);
        textNomeBicho               = findViewById(R.id.textNomeBicho);
        imageBicho                  = findViewById(R.id.imageBicho);
        Button btnSortearCentena    = findViewById(R.id.btnSortearCentena);

        btnSortearCentena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                centenaSorteada();

            }
        });
    }

    public void centenaSorteada() {

        final int[] avestruz      = {1,2,3,4,101,102,103,104,201,202,203,204,301,302,303,304,401,402,
                403,404,501,502,503,504,601,602,603,604,701,702,703,704,801,802,
                803,804,901,902,903,904};
        final int[] aguia         = {5,6,7,8,105,106,107,108,205,206,207,208,305,306,307,308,405,406,
                407,408,505,506,507,508,605,606,607,608,705,706,707,708,805,806,
                807,808,905,906,907,908};
        final int[] burro         = {9,10,11,12,109,110,111,112,209,210,211,212,309,310,311,312,409,
                410,411,412,509,510,511,512,609,610,611,612,709,710,711,712,809,
                810,811,812,909,910,911,912};
        final int[] borboleta     = {13,14,15,16,113,114,115,116,213,214,215,216,313,314,315,316,413,
                414,415,416,513,514,515,516,613,614,615,616,713,714,715,716,813,
                814,815,816,913,914,915,916};
        final int[] cachorro      = {17,18,19,20,117,118,119,120,217,218,219,220,317,318,319,320,417,
                418,419,420,517,518,519,520,617,618,619,620,717,718,719,720,817,
                818,819,820,917,918,919,920};
        final int[] cabra         = {21,22,23,24,121,122,123,124,221,222,223,224,321,322,323,324,421,
                422,423,424,521,522,523,524,621,622,623,624,721,722,723,724,821,
                822,823,824,921,922,923,924};
        final int[] carneiro      = {25,26,27,28,125,126,127,128,225,226,227,228,325,326,327,328,425,
                426,427,428,525,526,527,528,625,626,627,628,725,726,727,728,825,
                826,827,828,925,926,927,928};
        final int[] camelo        = {29,30,31,32,129,130,131,132,229,230,231,232,329,330,331,332,429,
                430,431,432,529,530,531,532,629,630,631,632,729,730,731,732,829,
                830,831,832,929,930,931,932};
        final int[] cobra         = {33,34,35,36,133,134,135,136,233,234,235,236,333,334,335,336,433,
                434,435,436,533,534,535,536,633,634,635,636,733,734,735,736,833,
                834,835,836,933,934,935,936};
        final int[] coelho        = {37,38,39,40,137,138,139,140,237,238,239,240,337,338,339,340,437,
                438,439,440,537,538,539,540,637,638,639,640,737,738,739,740,837,
                838,839,840,937,938,939,940};
        final int[] cavalo        = {41,42,43,44,141,142,143,144,241,242,243,244,341,342,343,344,441,
                442,443,444,541,542,543,544,641,642,643,644,741,742,743,744,841,
                842,843,844,941,942,943,944};
        final int[] elefante      = {45,46,47,48,145,146,147,148,245,246,247,248,345,346,347,348,445,
                446,447,448,545,546,547,548,645,646,647,648,745,746,747,748,845,
                846,847,848,945,946,947,948};
        final int[] galo          = {49,50,51,52,149,150,151,152,249,250,251,252,349,350,351,352,449,
                450,451,452,549,550,551,552,649,650,651,652,749,750,751,752,849,
                850,851,852,949,950,951,952};
        final int[] gato          = {53,54,55,56,153,154,155,156,253,254,255,256,353,354,355,356,453,
                454,455,456,553,554,555,556,653,654,655,656,753,754,755,756,853,
                854,855,856,953,954,955,956};
        final int[] jacare        = {57,58,59,60,157,158,159,160,257,258,259,260,357,358,359,360,457,
                458,459,460,557,558,559,560,657,658,659,660,757,758,759,760,857,
                858,859,860,957,958,959,960};
        final int[] leao          = {61,62,63,64,161,162,163,164,261,262,263,264,361,362,363,364,461,
                462,463,464,561,562,563,564,661,662,663,664,761,762,763,764,861,
                862,863,864,961,962,963,964};
        final int[] macaco        = {65,66,67,68,165,166,167,168,265,266,267,268,365,366,367,368,465,
                466,467,468,565,566,567,568,665,666,667,668,765,766,767,768,865,
                866,867,868,965,966,967,968};
        final int[] porco         = {69,70,71,72,169,170,171,172,269,270,271,272,369,370,371,372,469,
                470,471,472,569,570,571,572,669,670,671,672,769,770,771,772,869,
                870,871,872,969,970,971,972};
        final int[] pavao         = {73,74,75,76,173,174,175,176,273,274,275,276,373,374,375,376,473,
                474,475,476,573,574,575,576,673,674,675,676,773,774,775,776,873,
                874,875,876,973,974,975,976};
        final int[] peru          = {77,78,79,80,177,178,179,180,277,278,279,280,377,378,379,380,477,
                478,479,480,577,578,579,580,677,678,679,680,777,778,779,780,877,
                878,879,880,977,978,979,980};
        final int[] touro         = {81,82,83,84,181,182,183,184,281,282,283,284,381,382,383,384,481,
                482,483,484,581,582,583,584,681,682,683,684,781,782,783,784,881,
                882,883,884,981,982,983,984};
        final int[] tigre         = {85,86,87,88,185,186,187,188,285,286,287,288,385,386,387,388,485,
                486,487,488,585,586,587,588,685,686,687,688,785,786,787,788,885,
                886,887,888,985,986,987,988};
        final int[] urso          = {89,90,91,92,189,190,191,192,289,290,291,292,389,390,391,392,489,
                490,491,492,589,590,591,592,689,690,691,692,789,790,791,792,889,
                890,891,892,989,990,991,992};
        final int[] veado         = {93,94,95,96,193,194,195,196,293,294,295,296,393,394,395,396,493,
                494,495,496,593,594,595,596,693,694,695,696,793,794,795,796,893,
                894,895,896,993,994,995,996};
        final int[] vaca          = {97,98,99,0,197,198,199,100,297,298,299,200,397,398,399,300,497,
                498,499,400,597,598,599,500,697,698,699,600,797,798,799,700,897,
                898,899,800,997,998,999};

        int centena = new Random().nextInt(1000);

        if (centena == 0) {
            textCentenaSorteada.setText(R.string.cent_0);
        } else if (centena == 1) {
            textCentenaSorteada.setText(R.string.cent_1);
        } else if (centena == 2) {
            textCentenaSorteada.setText(R.string.cent_2);
        } else if (centena == 3) {
            textCentenaSorteada.setText(R.string.cent_3);
        } else if (centena == 4) {
            textCentenaSorteada.setText(R.string.cent_4);
        } else if (centena == 5) {
            textCentenaSorteada.setText(R.string.cent_5);
        } else if (centena == 6) {
            textCentenaSorteada.setText(R.string.cent_6);
        } else if (centena == 7) {
            textCentenaSorteada.setText(R.string.cent_7);
        } else if (centena == 8) {
            textCentenaSorteada.setText(R.string.cent_8);
        } else if (centena == 9) {
            textCentenaSorteada.setText(R.string.cent_9);
        } else if (centena == 10) {
            textCentenaSorteada.setText(R.string.cent_10);
        } else if (centena == 11) {
            textCentenaSorteada.setText(R.string.cent_11);
        } else if (centena == 12) {
            textCentenaSorteada.setText(R.string.cent_12);
        } else if (centena == 13) {
            textCentenaSorteada.setText(R.string.cent_13);
        } else if (centena == 14) {
            textCentenaSorteada.setText(R.string.cent_14);
        } else if (centena == 15) {
            textCentenaSorteada.setText(R.string.cent_15);
        } else if (centena == 16) {
            textCentenaSorteada.setText(R.string.cent_16);
        } else if (centena == 17) {
            textCentenaSorteada.setText(R.string.cent_17);
        } else if (centena == 18) {
            textCentenaSorteada.setText(R.string.cent_18);
        } else if (centena == 19) {
            textCentenaSorteada.setText(R.string.cent_19);
        } else if (centena == 20) {
            textCentenaSorteada.setText(R.string.cent_20);
        } else if (centena == 21) {
            textCentenaSorteada.setText(R.string.cent_21);
        } else if (centena == 22) {
            textCentenaSorteada.setText(R.string.cent_22);
        } else if (centena == 23) {
            textCentenaSorteada.setText(R.string.cent_23);
        } else if (centena == 24) {
            textCentenaSorteada.setText(R.string.cent_24);
        } else if (centena == 25) {
            textCentenaSorteada.setText(R.string.cent_25);
        } else if (centena == 26) {
            textCentenaSorteada.setText(R.string.cent_26);
        } else if (centena == 27) {
            textCentenaSorteada.setText(R.string.cent_27);
        } else if (centena == 28) {
            textCentenaSorteada.setText(R.string.cent_28);
        } else if (centena == 29) {
            textCentenaSorteada.setText(R.string.cent_29);
        } else if (centena == 30) {
            textCentenaSorteada.setText(R.string.cent_30);
        } else if (centena == 31) {
            textCentenaSorteada.setText(R.string.cent_31);
        } else if (centena == 32) {
            textCentenaSorteada.setText(R.string.cent_32);
        } else if (centena == 33) {
            textCentenaSorteada.setText(R.string.cent_33);
        } else if (centena == 34) {
            textCentenaSorteada.setText(R.string.cent_34);
        } else if (centena == 35) {
            textCentenaSorteada.setText(R.string.cent_35);
        } else if (centena == 36) {
            textCentenaSorteada.setText(R.string.cent_36);
        } else if (centena == 37) {
            textCentenaSorteada.setText(R.string.cent_37);
        } else if (centena == 38) {
            textCentenaSorteada.setText(R.string.cent_38);
        } else if (centena == 39) {
            textCentenaSorteada.setText(R.string.cent_39);
        } else if (centena == 40) {
            textCentenaSorteada.setText(R.string.cent_40);
        } else if (centena == 41) {
            textCentenaSorteada.setText(R.string.cent_41);
        } else if (centena == 42) {
            textCentenaSorteada.setText(R.string.cent_42);
        } else if (centena == 43) {
            textCentenaSorteada.setText(R.string.cent_43);
        } else if (centena == 44) {
            textCentenaSorteada.setText(R.string.cent_44);
        } else if (centena == 45) {
            textCentenaSorteada.setText(R.string.cent_45);
        } else if (centena == 46) {
            textCentenaSorteada.setText(R.string.cent_46);
        } else if (centena == 47) {
            textCentenaSorteada.setText(R.string.cent_47);
        } else if (centena == 48) {
            textCentenaSorteada.setText(R.string.cent_48);
        } else if (centena == 49) {
            textCentenaSorteada.setText(R.string.cent_49);
        } else if (centena == 50) {
            textCentenaSorteada.setText(R.string.cent_50);
        } else if (centena == 51) {
            textCentenaSorteada.setText(R.string.cent_51);
        } else if (centena == 52) {
            textCentenaSorteada.setText(R.string.cent_52);
        } else if (centena == 53) {
            textCentenaSorteada.setText(R.string.cent_53);
        } else if (centena == 54) {
            textCentenaSorteada.setText(R.string.cent_54);
        } else if (centena == 55) {
            textCentenaSorteada.setText(R.string.cent_55);
        } else if (centena == 56) {
            textCentenaSorteada.setText(R.string.cent_56);
        } else if (centena == 57){
            textCentenaSorteada.setText(R.string.cent_57);
        } else if (centena == 58) {
            textCentenaSorteada.setText(R.string.cent_58);
        } else if (centena == 59) {
            textCentenaSorteada.setText(R.string.cent_59);
        } else if (centena == 60) {
            textCentenaSorteada.setText(R.string.cent_60);
        } else if (centena == 61) {
            textCentenaSorteada.setText(R.string.cent_61);
        } else if (centena == 62) {
            textCentenaSorteada.setText(R.string.cent_62);
        } else if (centena == 63) {
            textCentenaSorteada.setText(R.string.cent_63);
        } else if (centena == 64) {
            textCentenaSorteada.setText(R.string.cent_64);
        } else if (centena == 65) {
            textCentenaSorteada.setText(R.string.cent_65);
        } else if (centena == 66) {
            textCentenaSorteada.setText(R.string.cent_66);
        } else if (centena == 67) {
            textCentenaSorteada.setText(R.string.cent_67);
        } else if (centena == 68) {
            textCentenaSorteada.setText(R.string.cent_68);
        } else if (centena == 69) {
            textCentenaSorteada.setText(R.string.cent_69);
        } else if (centena == 70) {
            textCentenaSorteada.setText(R.string.cent_70);
        } else if (centena == 71) {
            textCentenaSorteada.setText(R.string.cent_71);
        } else if (centena == 72) {
            textCentenaSorteada.setText(R.string.cent_72);
        } else if (centena == 73) {
            textCentenaSorteada.setText(R.string.cent_73);
        } else if (centena == 74) {
            textCentenaSorteada.setText(R.string.cent_74);
        } else if (centena == 75) {
            textCentenaSorteada.setText(R.string.cent_75);
        } else if (centena == 76) {
            textCentenaSorteada.setText(R.string.cent_76);
        } else if (centena == 77) {
            textCentenaSorteada.setText(R.string.cent_77);
        } else if (centena == 78) {
            textCentenaSorteada.setText(R.string.cent_78);
        } else if (centena == 79) {
            textCentenaSorteada.setText(R.string.cent_79);
        } else if (centena == 80) {
            textCentenaSorteada.setText(R.string.cent_80);
        } else if (centena == 81) {
            textCentenaSorteada.setText(R.string.cent_81);
        } else if (centena == 82) {
            textCentenaSorteada.setText(R.string.cent_82);
        } else if (centena == 83) {
            textCentenaSorteada.setText(R.string.cent_83);
        } else if (centena == 84) {
            textCentenaSorteada.setText(R.string.cent_84);
        } else if (centena == 85) {
            textCentenaSorteada.setText(R.string.cent_85);
        } else if (centena == 86) {
            textCentenaSorteada.setText(R.string.cent_86);
        } else if (centena == 87) {
            textCentenaSorteada.setText(R.string.cent_87);
        } else if (centena == 88) {
            textCentenaSorteada.setText(R.string.cent_88);
        } else if (centena ==89) {
            textCentenaSorteada.setText(R.string.cent_89);
        } else if (centena == 90) {
            textCentenaSorteada.setText(R.string.cent_90);
        } else if (centena == 91) {
            textCentenaSorteada.setText(R.string.cent_91);
        } else if (centena == 92) {
            textCentenaSorteada.setText(R.string.cent_92);
        } else if (centena == 93) {
            textCentenaSorteada.setText(R.string.cent_93);
        } else if (centena == 94) {
            textCentenaSorteada.setText(R.string.cent_94);
        } else if (centena == 95) {
            textCentenaSorteada.setText(R.string.cent_95);
        } else if (centena == 96) {
            textCentenaSorteada.setText(R.string.cent_96);
        } else if (centena == 97) {
            textCentenaSorteada.setText(R.string.cent_97);
        } else if (centena == 98) {
            textCentenaSorteada.setText(R.string.cent_98);
        } else if (centena == 99) {
            textCentenaSorteada.setText(R.string.cent_99);
        } else {
            textCentenaSorteada.setText(String.valueOf(centena));
        }

        for (int value : avestruz) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.avestruz_peq);
                textNomeBicho.setText(R.string.nome_avestruz);
            }
        }

        for (int value : aguia) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.aguia_peq);
                textNomeBicho.setText(R.string.nome_aguia);
            }
        }

        for (int value : burro) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.burro_peq);
                textNomeBicho.setText(R.string.nome_burro);
            }
        }

        for (int value : borboleta) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.borboleta_peq);
                textNomeBicho.setText(R.string.nome_borboleta);
            }
        }

        for (int value : cachorro) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.cachorro_peq);
                textNomeBicho.setText(R.string.nome_cachorro);
            }
        }

        for (int value : cabra) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.cabra_peq);
                textNomeBicho.setText(R.string.nome_cabra);
            }
        }

        for (int value : carneiro) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.carneiro_peq);
                textNomeBicho.setText(R.string.nome_carneiro);
            }
        }

        for (int value : camelo) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.camelo_peq);
                textNomeBicho.setText(R.string.nome_camelo);
            }
        }

        for (int value : cobra) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.cobra_peq);
                textNomeBicho.setText(R.string.nome_cobra);
            }
        }

        for (int value : coelho) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.coelho_peq);
                textNomeBicho.setText(R.string.nome_coelho);
            }
        }

        for (int value : cavalo) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.cavalo_peq);
                textNomeBicho.setText(R.string.nome_cavalo);
            }
        }

        for (int value : elefante) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.elefante_peq);
                textNomeBicho.setText(R.string.nome_elefante);
            }
        }

        for (int value : galo) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.galo_peq);
                textNomeBicho.setText(R.string.nome_galo);
            }
        }

        for (int value : gato) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.gato_peq);
                textNomeBicho.setText(R.string.nome_gato);
            }
        }

        for (int value : jacare) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.jacare_peq);
                textNomeBicho.setText(R.string.nome_jacare);
            }
        }

        for (int value : leao) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.leao_peq);
                textNomeBicho.setText(R.string.nome_leao);
            }
        }

        for (int value : macaco) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.macaco_peq);
                textNomeBicho.setText(R.string.nome_macaco);
            }
        }

        for (int value : porco) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.porco_peq);
                textNomeBicho.setText(R.string.nome_porco);
            }
        }

        for (int value : pavao) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.pavao_peq);
                textNomeBicho.setText(R.string.nome_pavao);
            }
        }

        for (int value : peru) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.peru_peq);
                textNomeBicho.setText(R.string.nome_peru);
            }
        }

        for (int value : touro) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.touro_peq);
                textNomeBicho.setText(R.string.nome_touro);
            }
        }

        for (int value : tigre) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.tigre_peq);
                textNomeBicho.setText(R.string.nome_tigre);
            }
        }

        for (int value : urso) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.urso_peq);
                textNomeBicho.setText(R.string.nome_urso);
            }
        }

        for (int value : veado) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.veado_peq);
                textNomeBicho.setText(R.string.nome_veado);
            }
        }

        for (int value : vaca) {
            if (value == centena) {
                imageBicho.setImageResource(R.drawable.vaca_peq);
                textNomeBicho.setText(R.string.nome_vaca);
            }
        }
    }
}
