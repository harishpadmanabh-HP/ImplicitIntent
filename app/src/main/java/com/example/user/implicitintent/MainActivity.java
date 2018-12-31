package com.example.user.implicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        page=(RelativeLayout)findViewById(R.id.page);
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob =new Intent(MainActivity.this,IntentPage.class);
                startActivity(ob);
            }
        });

    }
}
