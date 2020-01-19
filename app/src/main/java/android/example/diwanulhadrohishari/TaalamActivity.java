package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;
public class TaalamActivity extends AppCompatActivity {

    RelativeLayout taalampdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taalam);

        getSupportActionBar().setTitle("Taalam linuhu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        taalampdf = (PDFView) findViewById(R.id.taalampdf);
        ((PDFView) taalampdf).fromAsset("taalamlinuhu.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
