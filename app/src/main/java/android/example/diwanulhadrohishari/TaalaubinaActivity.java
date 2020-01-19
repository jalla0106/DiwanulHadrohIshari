package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;
public class TaalaubinaActivity extends AppCompatActivity {

    RelativeLayout taalaubinapdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taalaubina);

        getSupportActionBar().setTitle("Taalau bina");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        taalaubinapdf = (PDFView) findViewById(R.id.taalaubinapdf);
        ((PDFView) taalaubinapdf).fromAsset("taalaubina.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
