package com.example.aver.auto;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ModelsActivity extends Activity {

    public static final String EXTRA_BRANDNO = "brandNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int brandNo = (Integer)getIntent().getExtras().get(EXTRA_BRANDNO);
        Brand brand = Brand.brands[brandNo];
        if (brand.getNameBrand().equals("AUDI")){
           setContentView(R.layout.activiry_models_audi);

            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                    if (position == 0) {
                        Intent intent = new Intent(ModelsActivity.this, ListAudiA4.class);
                        startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(ModelsActivity.this, ListAudiA6.class);
                        startActivity(intent);
                    }
                    if (position == 2){
                        Intent intent = new Intent(ModelsActivity.this, ListAudiA8.class);
                        startActivity(intent);
                    }
                }
            };
            ListView listView = findViewById(R.id.list_brand_audi);
            listView.setOnItemClickListener(itemClickListener);
        }
        if (brand.getNameBrand().equals("BMW")){
            setContentView(R.layout.activity_models_bmw);

            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                    if (position == 0) {
                        Intent intent = new Intent(ModelsActivity.this, ListBmw3.class);
                        startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(ModelsActivity.this, ListBmw5.class);
                        startActivity(intent);
                    }
                    if (position == 2){
                        Intent intent = new Intent(ModelsActivity.this, ListBmw7.class);
                        startActivity(intent);
                    }
                }
            };
            ListView listView = findViewById(R.id.list_brand_bmw);
            listView.setOnItemClickListener(itemClickListener);
        }
        if (brand.getNameBrand().equals("VOLKSWAGEN")){
            setContentView(R.layout.activity_models_vw);

            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                    if (position == 0) {
                        Intent intent = new Intent(ModelsActivity.this, ListVwGolf.class);
                        startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(ModelsActivity.this, ListVwPassat.class);
                        startActivity(intent);
                    }
                }
            };
            ListView listView = findViewById(R.id.list_brand_vw);
            listView.setOnItemClickListener(itemClickListener);
        }
    }
}