package fr.roipapillon.papillodexv2;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout myLayout;
    private MainActivity activity;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activity = this;
        this.myLayout = findViewById(R.id.myactivity);

        ImageView top = new ImageView(this);
        ViewGroup.LayoutParams params1 = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        top.setAdjustViewBounds(true);
        top.setLayoutParams(params1);
        top.setImageResource(R.drawable.top);
        myLayout.addView(top);

        ImageView logo = new ImageView(this);
        ViewGroup.LayoutParams params2 = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1000);
        logo.setLayoutParams(params2);
        logo.setImageResource(R.drawable.logo);
        myLayout.addView(logo);

        Button button1 = new Button(this);
        button1.setText("superpapillon");
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                Papillon_Popup pop_up_papillon = new Papillon_Popup(activity);
                pop_up_papillon.setNom(getResources().getString(R.string.nom_machaon));
                pop_up_papillon.setDescription(getResources().getString(R.string.des_machaon));
                pop_up_papillon.setLocation(getResources().getString(R.string.loc_machaon));
                pop_up_papillon.setPhotoid(R.drawable.machaon);
                pop_up_papillon.build();
                if (pop_up_papillon.find() == true){
                    button1.setBackgroundColor(R.color.blue);
                }
            }
        });
        myLayout.addView(button1);

        ImageView bot = new ImageView(this);
        ViewGroup.LayoutParams params3 = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        top.setAdjustViewBounds(true);
        top.setBottom(0);
        bot.setLayoutParams(params3);
        bot.setImageResource(R.drawable.bottom);
        myLayout.addView(bot);

    }}