package com.example.storybook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private Button story1, story2, story3, story4, story5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Banner Ad
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Story buttons
        story1 = findViewById(R.id.story1);
        story2 = findViewById(R.id.story2);
        story3 = findViewById(R.id.story3);
        story4 = findViewById(R.id.story4);
        story5 = findViewById(R.id.story5);

        story1.setOnClickListener(v -> openStory(1));
        story2.setOnClickListener(v -> openStory(2));
        story3.setOnClickListener(v -> openStory(3));
        story4.setOnClickListener(v -> openStory(4));
        story5.setOnClickListener(v -> openStory(5));
    }

    private void openStory(int storyId) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("storyId", storyId);
        startActivity(intent);
    }
          }
