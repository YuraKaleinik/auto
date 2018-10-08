package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListVwGolf extends ListActivity {

    public String autoModel = "vwGolf";

    final String[] vwGolf = new String[]{"VW Golf 3", "VW Golf 4", "VW Golf 5",
            "VW Golf 6", "VW Golf 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> vwGolfAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, vwGolf);
        setListAdapter(vwGolfAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListVwGolf.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
