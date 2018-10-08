package com.example.aver.auto;

public class Brand {

    private String nameBrand;
    private int imageBrand;

    public static final Brand[] brands = {
            new Brand("AUDI", R.drawable.audi),
            new Brand("BMW", R.drawable.bmw),
            new Brand("VOLKSWAGEN", R.drawable.vw)
    };

    public Brand(String nameBrand, int imageBrand) {
        this.nameBrand = nameBrand;
        this.imageBrand = imageBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public int getImageBrand() {
        return imageBrand;
    }

    public String toStrind(){
        return this.nameBrand;
    }

}