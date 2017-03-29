package com.example.handblaster;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout buckysLayout = new RelativeLayout(this);
        buckysLayout.setBackgroundColor(Color.GREEN);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams inputDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Button
        Button redButton = new Button(this);
        redButton.setText("Click me Hoss");
        redButton.setBackgroundColor(Color.RED);



        //input
        EditText input = new EditText(this);

        redButton.setId(1);
        input.setId(2);

        inputDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        inputDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        inputDetails.setMargins(0, 0, 0, 50);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());

        input.setWidth(px);

        //Add widget to layout(button is now a child of layout)
        buckysLayout.addView(redButton, buttonDetails);
        buckysLayout.addView(input, inputDetails);


        //Set this activities content/display to this view
        setContentView(buckysLayout);

    }
}