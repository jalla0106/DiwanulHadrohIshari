package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class SollaActivity extends AppCompatActivity {

    RelativeLayout sollapdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solla);

        getSupportActionBar().setTitle("Solla ilahu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sollapdf = (PDFView) findViewById(R.id.sollapdf);
        ((PDFView) sollapdf).fromAsset("sollailahu .pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
