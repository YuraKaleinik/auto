package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListVwPassat extends ListActivity {

    public String autoModel = "vwPassat";

    final String[] vwPassat = new String[]{"VW Passat B3", "VW Passat B4", "VW Passat B5",
            "VW Passat B6", "VW Passat B7", "VW Passat B8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> vwPassatAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, vwPassat);
        setListAdapter(vwPassatAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListVwPassat.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
