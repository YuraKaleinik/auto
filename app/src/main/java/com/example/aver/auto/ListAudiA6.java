package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListAudiA6 extends ListActivity {

    public String autoModel = "audiA6";

    final String[] audiA6 = new String[]{"Audi A4 C4", "Audi A4 C5", "Audi A4 C6",
            "Audi A4 C7", "Audi A4 C8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> audiA6Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, audiA6);
        setListAdapter(audiA6Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListAudiA6.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}