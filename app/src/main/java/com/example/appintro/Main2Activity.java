package com.example.appintro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Main2Activity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main2);


        addSlide(AppIntroFragment.newInstance("First","Awesome",R.drawable.ic_launcher_background, Color.YELLOW));
        addSlide(AppIntroFragment.newInstance("Second","Cool",R.drawable.ic_launcher_background, Color.YELLOW));
        addSlide(AppIntroFragment.newInstance("First","Awesome",R.drawable.ic_launcher_background, Color.YELLOW));

        showSkipButton(true);
        setVibrate(true);
        setVibrateIntensity(40);

    }

        @Override
        public void onSkipPressed(Fragment currentFragment) {
            super.onSkipPressed(currentFragment);
            // Do something when users tap on Skip button.
            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);
        }

        @Override
        public void onDonePressed(Fragment currentFragment) {
            super.onDonePressed(currentFragment);
            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);
            // Do something when users tap on Done button.
        }

        @Override
        public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
            super.onSlideChanged(oldFragment, newFragment);
            // Do something when the slide changes.
        }



}
