package com.sunrise.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv_ListView;
    private String number[] = {"0132244324", "0133244325","0132444326","0123244367","0132484328","0132044329" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_ListView = (ListView) findViewById(R.id.lv_list_view);
        ArrayAdapter arrayadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, number);

        lv_ListView.setAdapter(arrayadapter);
        lv_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, number[position]+"", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
