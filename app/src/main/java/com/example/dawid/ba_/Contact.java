package com.example.dawid.ba_;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jozel_000 on 20/04/2016.
 */
public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnViewShows);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewShowsActivity();
            }

        });
    }

    public void ViewShowsActivity() {
        Intent in = new Intent(this, Home.class);
        this.startActivity(in);
    }
}


