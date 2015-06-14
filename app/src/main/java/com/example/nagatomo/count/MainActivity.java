package com.example.nagatomo.count;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends ActionBarActivity {
       int number;
    TextView text;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
        text.setText("0");
        image = (ImageView)findViewById(R.id.masuo);

    }

    public void up(View v){
        number = number +1;
        text.setText(String.valueOf(number));
        if(number ==10){
            image.setVisibility(View.VISIBLE);
        }
        else if(number !=10){
            image.setVisibility(View.INVISIBLE);
        }
    }
    public void minus(View v){
        number = number -1;
        text.setText(String.valueOf(number));
        if(number ==10){
            image.setVisibility(View.VISIBLE);
        }
        else if(number !=10){
            image.setVisibility(View.INVISIBLE);
        }
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
}
