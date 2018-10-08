package com.example.aver.auto;

        import android.app.ListActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class ListBmw5 extends ListActivity {

    public String autoModel = "bmw5";

    final String[] bmw5 = new String[]{"BMW 5 E34", "BMW 5 E39", "BMW 5 E60",
            "BMW 5 F10", "BMW 5 G30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> bmw5Adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, bmw5);
        setListAdapter(bmw5Adapter);
    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(ListBmw5.this, ModelsDescriptionActivity.class);
        intent.putExtra(ModelsDescriptionActivity.EXTRA_INFONO, position);
        intent.putExtra("autoModel", autoModel);
        startActivity(intent);
    }
}
