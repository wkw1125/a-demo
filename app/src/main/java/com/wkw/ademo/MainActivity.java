package com.wkw.ademo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.wkw.ademo.test.TestActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // View
    ListView lvCatalogs;
    List<Catalog> mCatalogs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mCatalogs);

        lvCatalogs = findViewById(R.id.lv_catalogs);
        lvCatalogs.setAdapter(adapter);

        lvCatalogs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,
                        ((Catalog) lvCatalogs.getItemAtPosition(position)).getCatalogClass());
                startActivity(intent);
            }
        });
    }

    private void initData() {
        mCatalogs.clear();
        mCatalogs.add(new Catalog(TestActivity.class, "Test"));
    }
}
