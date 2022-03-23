package com.app.marketssecret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {
    private ImageView image_BookingActivity,image_CitiesActivity,image_CityTwoActivity,image_Flights_search,image_FlightsActivity,image_HotelActivity,image_ListOfHotelsActivity
            ,image_NearBYActivity,image_PlaceActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        image_BookingActivity = findViewById(R.id.image_BookingActivity);
        image_CitiesActivity = findViewById(R.id.image_CitiesActivity);
        image_CityTwoActivity = findViewById(R.id.image_CityTwoActivity);
        image_Flights_search = findViewById(R.id.image_Flights_search);
        image_FlightsActivity = findViewById(R.id.image_FlightsActivity);
        image_HotelActivity = findViewById(R.id.image_HotelActivity);
        image_ListOfHotelsActivity = findViewById(R.id.image_ListOfHotelsActivity);
        image_NearBYActivity = findViewById(R.id.image_NearBYActivity);
        image_PlaceActivity = findViewById(R.id.image_PlaceActivity);


        image_BookingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
    });
        image_CitiesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_Flights_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_FlightsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_HotelActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_ListOfHotelsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_NearBYActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        image_PlaceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MapsActivity.class);
                startActivity(intent);
            }
        });




    }
    }
