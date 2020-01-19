package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class YamaulidanActivity extends AppCompatActivity {

    RelativeLayout yamaulidanpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamaulidan);

        getSupportActionBar().setTitle("Yamaulidan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        yamaulidanpdf = (PDFView) findViewById(R.id.yamaulidanpdf);
        ((PDFView) yamaulidanpdf).fromAsset("yamaulidan.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
