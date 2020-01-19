package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    LinearLayout ibtida, bisyahri, tanaqqolta, wulidalhabib,shollaalaika, badatlana, mahallulqiyam,faturqu, fazat, mistluhu,taalam, yamaulidan, solla, taalaubina, habibun, tahtim;


    ViewFlipper viewFlipper;
    Animation fadein,fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);
        ibtida     = (LinearLayout) findViewById(R.id.ibtida);
        bisyahri   = (LinearLayout) findViewById(R.id.bisyahri);
        tanaqqolta  = (LinearLayout) findViewById(R.id.tanaqolta);
        wulidalhabib       = (LinearLayout) findViewById(R.id.wulidalhabib);
        shollaalaika    = (LinearLayout) findViewById(R.id.shollaalaika);
        badatlana     = (LinearLayout) findViewById(R.id.badatlana);
        mahallulqiyam     = (LinearLayout) findViewById(R.id.mahallulqiyam);
        faturqu    = (LinearLayout) findViewById(R.id.fatuqu);
        fazat   = (LinearLayout) findViewById(R.id.fazat);
        mistluhu     = (LinearLayout) findViewById(R.id.mistluhu);
        taalam     = (LinearLayout) findViewById(R.id.taalam);
        yamaulidan     = (LinearLayout) findViewById(R.id.yamaulidan);
        solla     = (LinearLayout) findViewById(R.id.solla);
        taalaubina     = (LinearLayout) findViewById(R.id.taalaubina);
        habibun     = (LinearLayout) findViewById(R.id.habibun);
        tahtim     = (LinearLayout) findViewById(R.id.tahtim);


        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();


        ibtida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,IbtidaActivity.class);
                startActivity(beranda);

            }
        });

        bisyahri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,BisyahriActivity.class);
                startActivity(beranda);

            }
        });

        tanaqqolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,TanaqqoltaActivity.class);
                startActivity(beranda);

            }
        });

        wulidalhabib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,WulidalActivity.class);
                startActivity(beranda);

            }
        });

        shollaalaika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,ShollaalaikaActivity.class);
                startActivity(beranda);

            }
        });

        badatlana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,BadatlanaActivity.class);
                startActivity(beranda);

            }
        });

        mahallulqiyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,MahalulActivity.class);
                startActivity(beranda);

            }
        });

        faturqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,FaturquActivity.class);
                startActivity(beranda);

            }
        });

        fazat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,FazatActivity.class);
                startActivity(beranda);

            }
        });

        mistluhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,MistluhuActivity.class);
                startActivity(beranda);

            }
        });

        taalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,TaalamActivity.class);
                startActivity(beranda);

            }
        });

        yamaulidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,YamaulidanActivity.class);
                startActivity(beranda);

            }
        });

        solla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,SollaActivity.class);
                startActivity(beranda);

            }
        });

        taalaubina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,TaalaubinaActivity.class);
                startActivity(beranda);

            }
        });

        habibun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,HabibunActivity.class);
                startActivity(beranda);

            }
        });

        tahtim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beranda = new Intent( MainActivity.this,TahtimActivity.class);
                startActivity(beranda);

            }
        });

    }
}
