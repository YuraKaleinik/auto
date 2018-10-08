package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListBmw7 extends ListActivity {

    public String autoModel = "bmw7";

    final String[] bmw7 = new String[]{"BMW 7 E32", "BMW 7 E38", "BMW 7 E65",
            "BMW 7 F01", "BMW 7 G11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> bmw7Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, bmw7);
        setListAdapter(bmw7Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListBmw7.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
