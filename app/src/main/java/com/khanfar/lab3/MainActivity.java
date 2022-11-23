package com.khanfar.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView text ;
private ImageView imageView ;
private Animation top , buttom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);

        text = findViewById(R.id.label);
        imageView = findViewById(R.id.img) ;

        top = AnimationUtils.loadAnimation(this , R.anim.top_anim) ;
        buttom = AnimationUtils.loadAnimation(this , R.anim.buttom_amin) ;

        imageView.setAnimation(top);
        text.setAnimation(buttom);

        Handler handler = new Handler() ;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this , Menu.class) ;
                startActivity(intent);
                finish();
            }
        } , 5000);
    }
}