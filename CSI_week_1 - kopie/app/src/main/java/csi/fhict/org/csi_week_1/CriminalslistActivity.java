package csi.fhict.org.csi_week_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CriminalslistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminalslist);

        //Get a reference to the listview
        ListView listview = (ListView) findViewById(R.id.listView);
        //Get a reference to the list with names
        final String[] criminals = getResources().getStringArray(R.array.names);
        //Create an adapter that feeds the data to the listview
        listview.setAdapter(
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        criminals
                )
        );

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the name from the array that is in the same position as the chosen listitem.
                String name = criminals[position];

                Intent intent = new Intent(CriminalslistActivity.this, MainActivity.class);
                intent.putExtra("name", name);

                startActivity(intent);

            }
        });
}}

