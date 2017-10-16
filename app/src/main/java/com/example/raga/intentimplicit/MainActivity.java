package com.example.raga.intentimplicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button browser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     browser =(Button)findViewById(R.id.button1);

        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriurl = Uri.parse("https://github.com/codewireframming");
                Intent Browse_intent = new Intent(Intent.ACTION_VIEW,uriurl);
                startActivity(Browse_intent);
            }
        });

    }
}
