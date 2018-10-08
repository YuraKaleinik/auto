package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListAudiA4 extends ListActivity {

    public String autoModel = "audiA4";

    final String[] audiA4 = new String[]{"Audi A4 B5", "Audi A4 B6", "Audi A4 B7",
            "Audi A4 B8", "Audi A4 B9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> audiA4Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, audiA4);
        setListAdapter(audiA4Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListAudiA4.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
