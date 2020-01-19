package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class HabibunActivity extends AppCompatActivity {

    RelativeLayout habibunpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habibun);

        getSupportActionBar().setTitle("Habibun");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        habibunpdf = (PDFView) findViewById(R.id.habibunpdf);
        ((PDFView) habibunpdf).fromAsset("habibun.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
