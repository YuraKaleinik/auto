package com.example.aver.auto;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListAudiA8 extends ListActivity {

    public String autoModel = "audiA8";

    final String[] audiA8 = new String[]{"Audi A4 D2", "Audi A4 D3", "Audi A4 D4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> audiA8Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, audiA8);
        setListAdapter(audiA8Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListAudiA8.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
