package com.example.dawid.ba_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
    public void ViewShowsActivity(){
        Intent in = new Intent(this,ViewShowsActivity.class);
        this.startActivity(in);
    }
    //comment david david david david David David Final
    // Jozella is not as cool as David
}
