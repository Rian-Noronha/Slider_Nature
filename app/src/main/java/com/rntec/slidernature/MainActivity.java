package com.rntec.slidernature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonNextVisible(false);
        setButtonBackVisible(false);

        addSlide(new FragmentSlide.Builder()

                .background(R.color.white)
                .fragment(R.layout.intro_1)
                .build()

        );

        addSlide(new FragmentSlide.Builder()

                .background(R.color.white)
                .fragment(R.layout.intro_2)
                .build()

        );

        addSlide(new FragmentSlide.Builder()

                .background(R.color.white)
                .fragment(R.layout.intro_3)
                .build()

        );

    }
}