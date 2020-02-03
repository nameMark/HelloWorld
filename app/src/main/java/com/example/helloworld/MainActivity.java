package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.linear);
        final Button b = (Button) findViewById(R.id.vertical);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v(b);

                switch (v.getId()){
                    case R.id.horizontal:
                        ll.setGravity(Gravity.TOP);
                        break;
                    case R.id.vertical:
                        ll.setGravity(Gravity.RIGHT);
                        break;
                    case R.id.back:
                        break;
                    }
            }
        });

    }

    public void h(View v){
        ll.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void v(View v){
        ll.setOrientation(LinearLayout.VERTICAL);
    }

    public void ba(View v){ ll.setOrientation(LinearLayout.VERTICAL);
                            ll.setGravity(Gravity.CENTER);
    }




}
