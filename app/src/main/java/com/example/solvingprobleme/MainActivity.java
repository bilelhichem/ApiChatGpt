package com.example.solvingprobleme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView hellopepole ,solve ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hellopepole = findViewById(R.id.hellopeople) ;
        solve = findViewById(R.id.solv) ;

        Animation move = AnimationUtils.loadAnimation(MainActivity.this,R.anim.textanim);
        Animation solv = AnimationUtils.loadAnimation(MainActivity.this,R.anim.solvanim);
        hellopepole.setAnimation(move);
        solve.setAnimation(solv);
        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {



                startActivity(new Intent(MainActivity.this,act.class));
                finish();

            }
        },2000) ;

    }
}