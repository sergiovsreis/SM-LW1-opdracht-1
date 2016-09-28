package csi.fhict.org.csi_week_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnReport = (Button) findViewById(R.id.btnReport);
        btnReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ReportActivity.class);
                //  myIntent.putExtra("key", ); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}