package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class MistluhuActivity extends AppCompatActivity {

    RelativeLayout mistluhupdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mistluhu);

        getSupportActionBar().setTitle("Man mistluhu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mistluhupdf = (PDFView) findViewById(R.id.mistluhupdf);
        ((PDFView) mistluhupdf).fromAsset("manmisluhu.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
