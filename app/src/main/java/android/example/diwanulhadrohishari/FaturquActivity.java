package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class FaturquActivity extends AppCompatActivity {

    RelativeLayout faturqupdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faturqu);

        getSupportActionBar().setTitle("Faturqu wasli");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        faturqupdf = (PDFView) findViewById(R.id.fatuqupdf);
        ((PDFView)faturqupdf ).fromAsset("fatur.pdf").load();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
