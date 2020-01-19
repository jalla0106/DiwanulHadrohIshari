package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class TahtimActivity extends AppCompatActivity {

    RelativeLayout tahtimpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahtim);

        getSupportActionBar().setTitle("Tahtim");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tahtimpdf = (PDFView) findViewById(R.id.tahtimpdf);
        ((PDFView) tahtimpdf).fromAsset("tahtim.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
