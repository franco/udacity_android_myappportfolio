package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_media_streamer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_media_streamer_app);
            }
        });

        findViewById(R.id.button_scores).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_scores_app);
            }
        });

        findViewById(R.id.button_library).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_library_app);
            }
        });

        findViewById(R.id.button_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_bigger_app);
            }
        });

        findViewById(R.id.button_beacon_reader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_beacon_app);
            }
        });

        findViewById(R.id.button_capstone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToastWithText(R.string.toast_capstone_app);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void displayToastWithText(int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    }
}
