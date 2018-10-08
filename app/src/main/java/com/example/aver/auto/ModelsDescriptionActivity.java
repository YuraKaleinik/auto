package com.example.aver.auto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ModelsDescriptionActivity extends Activity {

    public static final String EXTRA_INFONO = "infoNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__models_description);

        int infoNo = (Integer) getIntent().getExtras().get(EXTRA_INFONO);
        String autoModel = getIntent().getExtras().getString("autoModel");

        if (autoModel.equals("audiA4")) {

            Models audiA4 = Models.audiA4Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(audiA4.getImageModel());
            photo.setContentDescription(audiA4.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(audiA4.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(audiA4.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(audiA4.getYearModel());
        }
        if (autoModel.equals("audiA6")) {

            Models audiA6 = Models.audiA6Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(audiA6.getImageModel());
            photo.setContentDescription(audiA6.getNameModel());

            TextView name =findViewById(R.id.model_name);
            name.setText(audiA6.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(audiA6.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(audiA6.getYearModel());
        }

        if (autoModel.equals("audiA8")) {

            Models audiA8 = Models.audiA8Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(audiA8.getImageModel());
            photo.setContentDescription(audiA8.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(audiA8.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(audiA8.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(audiA8.getYearModel());
        }

        if (autoModel.equals("bmw3")) {

            Models bmw3 = Models.bmw3Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(bmw3.getImageModel());
            photo.setContentDescription(bmw3.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(bmw3.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(bmw3.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(bmw3.getYearModel());
        }

        if (autoModel.equals("bmw5")) {

            Models bmw5 = Models.bmw5Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(bmw5.getImageModel());
            photo.setContentDescription(bmw5.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(bmw5.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(bmw5.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(bmw5.getYearModel());
        }

        if (autoModel.equals("bmw7")) {

            Models bmw7 = Models.bmw7Models[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(bmw7.getImageModel());
            photo.setContentDescription(bmw7.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(bmw7.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(bmw7.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(bmw7.getYearModel());
        }

        if (autoModel.equals("vwGolf")) {

            Models vwGolf = Models.vwGolfModels[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(vwGolf.getImageModel());
            photo.setContentDescription(vwGolf.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(vwGolf.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(vwGolf.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(vwGolf.getYearModel());
        }

        if (autoModel.equals("vwPassat")) {

            Models vwPassat = Models.vwPassatModels[infoNo];

            ImageView photo = findViewById(R.id.model_image);
            photo.setImageResource(vwPassat.getImageModel());
            photo.setContentDescription(vwPassat.getNameModel());

            TextView name = findViewById(R.id.model_name);
            name.setText(vwPassat.getNameModel());

            TextView description = findViewById(R.id.model_description);
            description.setText(vwPassat.getDescriptionModel());

            TextView year = findViewById(R.id.model_year);
            year.setText(vwPassat.getYearModel());
        }
    }
}
