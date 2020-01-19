package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class MahalulActivity extends AppCompatActivity {

    RelativeLayout mahalulpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahalul);

        getSupportActionBar().setTitle("Mahallul qiyam");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mahalulpdf = (PDFView) findViewById(R.id.mahallulqiyampdf);
        ((PDFView) mahalulpdf).fromAsset("maqom.pdf").load();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }

}
