package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class BadatlanaActivity extends AppCompatActivity {

    RelativeLayout badatlanapdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badatlana);

        getSupportActionBar().setTitle("Badat lana");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        badatlanapdf = (PDFView) findViewById(R.id.badatlanapdf);
        ((PDFView) badatlanapdf).fromAsset("badat.pdf").load();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }
}
