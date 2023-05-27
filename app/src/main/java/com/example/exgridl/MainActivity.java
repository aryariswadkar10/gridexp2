package com.example.exgridl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridLayout gridLayout;
    private int [] imageIds = {R.drawable.images2,R.drawable.images3, R.drawable.images4, R.drawable.images44};

    ImageView home, settings, call, gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.gridLayout);
        home = findViewById(R.id.home);
        settings = findViewById(R.id.settings);
        call = findViewById(R.id.call);
        gallery = findViewById(R.id.gallery);

        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            View view = gridLayout.getChildAt(i);

            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setImageResource(imageIds[i]);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(MainActivity.this, HomeActivity.class));

                            }

                        });

                        settings.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SettingsActivity.class));

                            }
                        });
                        call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, CallActivity.class));

                            }
                        });

                        gallery.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, GalleryActivity.class));

                            }
                        });
                    }
                });
            }

        }
    }
}

