package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListBmw3 extends ListActivity {

    public String autoModel = "bmw3";

    final String[] bmw3 = new String[]{"BMW 3 E30", "BMW 3 E36", "BMW 3 E46",
            "BMW 3 E90", "BMW 3 F30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> bmw3Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, bmw3);
        setListAdapter(bmw3Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListBmw3.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
