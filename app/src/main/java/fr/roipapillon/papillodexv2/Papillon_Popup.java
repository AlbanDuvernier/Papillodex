package fr.roipapillon.papillodexv2;

import android.app.Activity;
import android.app.Dialog;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class Papillon_Popup extends Dialog {
    private String nom;
    private String description;
    private String location;
    private TextView nomView, descriptionView, locationView;
    private ImageView image;
    private CheckBox checkBox;
    private int photoid;

    public Papillon_Popup(Activity activity){
        super(activity, androidx.appcompat.R.style.Theme_AppCompat);
        setContentView(R.layout.activity_popup);
        this.nom = "papillon";
        this.description = "il est beau ce papillon";
        this.location = "Monde";
        this.nomView = findViewById(R.id.nom);
        this.descriptionView = findViewById(R.id.description);
        this.locationView = findViewById(R.id.localisation);
        this.image = findViewById(R.id.photo);
        this.checkBox = findViewById(R.id.checkBox);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhotoid (int photo){
        this.photoid = photo;
    }

    public boolean find() {
        return checkBox.isChecked();
    }

    public void build(){
        nomView.setText(nom);
        descriptionView.setText(description);
        locationView.setText(location);
        image.setBackgroundResource(photoid);
        find();
        show();
    }
}
