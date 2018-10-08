package com.example.aver.auto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class AutoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        RecyclerView brandRecycler = findViewById(R.id.brand_recycler);

        String[] brandNames = new String[Brand.brands.length];
        for (int i = 0; i < brandNames.length; i++){
            brandNames[i] = Brand.brands[i].getNameBrand();
        }

        int[] brandImages = new int[Brand.brands.length];
        for (int i = 0; i < brandImages.length; i++){
            brandImages[i] = Brand.brands[i].getImageBrand();
        }

        BrandAdapter adapter = new BrandAdapter(brandNames, brandImages);
        brandRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        brandRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new BrandAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(AutoActivity.this, ModelsActivity.class);
                intent.putExtra(ModelsActivity.EXTRA_BRANDNO, position);
                startActivity(intent);
            }
        });
    }
}