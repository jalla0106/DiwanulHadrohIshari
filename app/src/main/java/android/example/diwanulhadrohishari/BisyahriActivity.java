package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class BisyahriActivity extends AppCompatActivity {

    RelativeLayout bisyahripdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisyahri);
        getSupportActionBar().setTitle("Bisyahri");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bisyahripdf = (PDFView) findViewById(R.id.bisyahriapdf);
        ((PDFView) bisyahripdf).fromAsset("bisyahri.pdf").load();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
