package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class WulidalActivity extends AppCompatActivity {

    RelativeLayout wulidalpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wulidal);

        getSupportActionBar().setTitle("Wulidal habib");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        wulidalpdf = (PDFView) findViewById(R.id.wulidalhabibpdf);
        ((PDFView) wulidalpdf).fromAsset("wulidal.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
