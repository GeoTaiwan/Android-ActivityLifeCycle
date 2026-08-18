package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Three extends AppCompatActivity {
    Button btn_start_activity_main,btn_start_activity_two,btn_close_activity_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_three);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        btn_start_activity_main = findViewById(R.id.btn_start_activity_main);
        btn_start_activity_two = findViewById(R.id.btn_start_activity_two);
        btn_close_activity_three = findViewById(R.id.btn_close_activity_three);

        btn_start_activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_Three.this,MainActivity.class);
                startActivity(i);
            }
        });

        btn_start_activity_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_Three.this, Activity_Two.class);
                startActivity(i);
            }
        });

        btn_close_activity_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Log.d("ActivityLifeCycle","Activity_Three - onCreate() 方法被執行");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle","Activity_Three - onStart() 方法被執行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","Activity_Three - onPause() 方法被執行");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("ActivityLifeCycle","Activity_Three - onResume() 方法被執行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","Activity_Three - onStop() 方法被執行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","Activity_Three - onRestart() 方法被執行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","Activity_Three - onDestroy() 方法被執行");
    }
}