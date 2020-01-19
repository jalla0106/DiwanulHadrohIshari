package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class FazatActivity extends AppCompatActivity {

    RelativeLayout fazatpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazat);

        getSupportActionBar().setTitle("Fazat halimatu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fazatpdf = (PDFView) findViewById(R.id.fazatpdf);
        ((PDFView) fazatpdf).fromAsset("fazat.pdf").load();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
