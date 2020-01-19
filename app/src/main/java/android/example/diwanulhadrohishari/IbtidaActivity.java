package android.example.diwanulhadrohishari;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class IbtidaActivity extends AppCompatActivity {

    RelativeLayout ibtidapdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibtida);

        getSupportActionBar().setTitle("Ibtida");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ibtidapdf = (PDFView) findViewById(R.id.ibtidapdf);
        ((PDFView) ibtidapdf).fromAsset("ibtida.pdf").load();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return false;
    }




}
