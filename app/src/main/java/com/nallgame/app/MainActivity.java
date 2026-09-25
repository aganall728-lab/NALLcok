package com.nallgame.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {
    int money = 1000, hp = 100, speed = 1;
    boolean itemUnlocked = false;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("NALL GAME");
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.BLACK);

        status = new TextView(this);
        status.setTextSize(20);
        status.setPadding(0, 30, 0, 30);

        layout.addView(title);
        layout.addView(status);

        Button moneyButton = new Button(this);
        moneyButton.setText("+1000 UANG");
        moneyButton.setOnClickListener(v -> { money += 1000; updateStatus(); });

        Button hpButton = new Button(this);
        hpButton.setText("HP PENUH");
        hpButton.setOnClickListener(v -> { hp = 100; updateStatus(); });

        Button speedButton = new Button(this);
        speedButton.setText("SPEED x2");
        speedButton.setOnClickListener(v -> { speed *= 2; updateStatus(); });

        Button itemButton = new Button(this);
        itemButton.setText("UNLOCK ITEM");
        itemButton.setOnClickListener(v -> { itemUnlocked = true; updateStatus(); });

        layout.addView(moneyButton);
        layout.addView(hpButton);
        layout.addView(speedButton);
        layout.addView(itemButton);

        setContentView(layout);
        updateStatus();
    }

    void updateStatus() {
        status.setText(
            "Uang: " + money +
            "\nHP: " + hp +
            "\nSpeed: " + speed + "x" +
            "\nItem: " + (itemUnlocked ? "UNLOCKED" : "LOCKED")
        );
    }
}
