package com.example.aver.auto;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.ViewHolder>{

    private String[] captions;
    private int[] imageId;
    private Listener listenerBrand;

    public static interface Listener{
        public void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }

    public BrandAdapter(String[] captions, int[] imageId) {
        this.captions = captions;
        this.imageId = imageId;
    }

    public void setListener(Listener listenerBrand){
        this.listenerBrand = listenerBrand;
    }

    @Override
    public BrandAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_brand, parent, false);
        return new ViewHolder(cv);
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        CardView cardView = holder.cardView;
        TextView textView = cardView.findViewById(R.id.brand_name);
        textView.setText(captions[position]);
        ImageView imageView = cardView.findViewById(R.id.brand_image);
        Drawable drawable = cardView.getResources().getDrawable(imageId[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listenerBrand != null){
                    listenerBrand.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }
}
