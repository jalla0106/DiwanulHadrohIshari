package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class TanaqqoltaActivity extends AppCompatActivity {

    RelativeLayout tanaqoltapdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaqqolta);

        getSupportActionBar().setTitle("Tanaqqolta");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tanaqoltapdf = (PDFView) findViewById(R.id.tanaqoltapdf);
        ((PDFView) tanaqoltapdf).fromAsset("tanaqolta.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
