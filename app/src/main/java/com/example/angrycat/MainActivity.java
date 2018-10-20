package com.example.angrycat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    static ImageButton cat;
    static int numPets = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat = (ImageButton) findViewById(R.id.cat);

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPets++;
                checkNumTimes();
            }
        });
    }

    public static void checkNumTimes() {
        if (numPets > 5) {
            cat.setImageResource(R.drawable.grumpy);
        }
    }
}
