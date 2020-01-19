package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class ShollaalaikaActivity extends AppCompatActivity {

    RelativeLayout alhampdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shollaalaika);

        getSupportActionBar().setTitle("Sholla alaika");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alhampdf = (PDFView) findViewById(R.id.shollaalaikapdf);
        ((PDFView) alhampdf).fromAsset("alham.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
