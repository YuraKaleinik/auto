package com.example.aver.auto;

public class Models {
    private String nameModel;
    private String descriptionModel;
    private String yearModel;
    private int imageModel;

    public static final Models[] audiA4Models = {
        new Models("Audi A4 B5", "Годы выпуска", "1994 - 2001", R.drawable.audi_a4_b5),
        new Models("Audi A4 B6", "Годы выпуска", "2000 - 2004", R.drawable.audi_a4_b6),
        new Models("Audi A4 B7", "Годы выпуска", "2004 - 2008", R.drawable.audi_a4_b7),
        new Models("Audi A4 B8", "Годы выпуска", "2008 - 2015", R.drawable.audi_a4_b8),
        new Models("Audi A4 B9", "Годы выпуска", "c 2015", R.drawable.audi_a4_b9),
    };

    public static final Models[] audiA6Models = {
        new Models("Audi A6 C4", "Годы выпуска", "1994 - 1997", R.drawable.audi_a6_c4),
        new Models("Audi A6 C5", "Годы выпуска", "1997 - 2004", R.drawable.audi_a6_c5),
        new Models("Audi A6 C6", "Годы выпуска", "2004 - 2011", R.drawable.audi_a6_c6),
        new Models("Audi A6 C7", "Годы выпуска", "2011 - 2017", R.drawable.audi_a6_c7),
        new Models("Audi A6 C8", "Годы выпуска", "c 2018", R.drawable.audi_a6_c8),
    };

    public static final Models[] audiA8Models = {
        new Models("Audi A8 D2", "Годы выпуска", "1994 - 2002", R.drawable.audi_a8_d2),
        new Models("Audi A8 D3", "Годы выпуска", "2002 - 2010", R.drawable.audi_a8_d3),
        new Models("Audi A8 D4", "Годы выпуска", "2010 - 2017", R.drawable.audi_a8_d4),
    };

    public static final Models[] bmw3Models = {
        new Models("BMW 3 E30", "Годы выпуска", "1982 - 1994", R.drawable.bmw_3_e30),
        new Models("BMW 3 E36", "Годы выпуска", "1990 - 2000", R.drawable.bmw_3_e36),
        new Models("BMW 3 E46", "Годы выпуска", "1998 - 2006", R.drawable.bmw_3_e46),
        new Models("BMW 3 E90", "Годы выпуска", "2004 - 2011", R.drawable.bmw_3_e90),
        new Models("BMW 3 F30", "Годы выпуска", "c 2012", R.drawable.bmw_3_f30),
    };

    public static final Models[] bmw5Models = {
        new Models("BMW 5 E34", "Годы выпуска", "1988 - 1996", R.drawable.bmw_5_e34),
        new Models("BMW 5 E39", "Годы выпуска", "1995 - 2003", R.drawable.bmw_5_e39),
        new Models("BMW 5 E60", "Годы выпуска", "2003 - 2010", R.drawable.bmw_5_e60),
        new Models("BMW 5 F10", "Годы выпуска", "2010 - 2017", R.drawable.bmw_5_f10),
        new Models("BMW 5 G30", "Годы выпуска", "c 2017", R.drawable.bmw_5_g30),
    };

    public static final Models[] bmw7Models = {
        new Models("BMW 7 E32", "Годы выпуска", "1986 - 1994", R.drawable.bmw_7_e32),
        new Models("BMW 7 E38", "Годы выпуска", "1994 - 2001", R.drawable.bmw_7_e38),
        new Models("BMW 7 E65", "Годы выпуска", "2001 - 2008", R.drawable.bmw_7_e65),
        new Models("BMW 7 F01", "Годы выпуска", "2008 - 2015", R.drawable.bmw_7_f01),
        new Models("BMW 7 G11", "Годы выпуска", "c 2015", R.drawable.bmw_7_g11),
    };

    public static final Models[] vwPassatModels = {
        new Models("VW Passat B3", "Годы выпуска", "1988 - 1993", R.drawable.vw_passat_b3),
        new Models("VW Passat B4", "Годы выпуска", "1993 - 1996", R.drawable.vw_passat_b4),
        new Models("VW Passat B5", "Годы выпуска", "1996 - 2005", R.drawable.vw_passat_b5),
        new Models("VW Passat B6", "Годы выпуска", "2005 - 2010", R.drawable.vw_passat_b6),
        new Models("VW Passat B7", "Годы выпуска", "2010 - 2015", R.drawable.vw_passat_b7),
        new Models("VW Passat B8", "Годы выпуска", "c 2015", R.drawable.vw_passat_b8),
    };

    public static final Models[] vwGolfModels = {
        new Models("VW Golf 3", "Годы выпуска", "1991 - 1998", R.drawable.vw_golf_3),
        new Models("VW Golf 4", "Годы выпуска", "1997 - 2006", R.drawable.vw_golf_3),
        new Models("VW Golf 5", "Годы выпуска", "2003 - 2009", R.drawable.vw_golf_3),
        new Models("VW Golf 6", "Годы выпуска", "2008 - 2013", R.drawable.vw_golf_3),
        new Models("VW Golf 7", "Годы выпуска", "c 2012", R.drawable.vw_golf_3),
    };

    public Models(String nameModel, String descriptionModel,
                  String yearModel, int imageModel) {
        this.nameModel = nameModel;
        this.descriptionModel = descriptionModel;
        this.yearModel = yearModel;
        this.imageModel = imageModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getDescriptionModel() {
        return descriptionModel;
    }

    public String getYearModel() {
        return yearModel;
    }

    public int getImageModel() {
        return imageModel;
    }

    public String toString(){
        return this.nameModel;
    }

}
