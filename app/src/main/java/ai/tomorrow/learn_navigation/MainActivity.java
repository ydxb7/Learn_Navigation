package ai.tomorrow.learn_navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button red1_button = (Button) findViewById(R.id.red1_button);
        red1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Red1Activity.class);
                startActivity(i);
            }
        });

        Button green1_button = (Button) findViewById(R.id.green1_button);
        green1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Green1Activity.class);
                startActivity(i);
            }
        });

        Button blue1_button = (Button) findViewById(R.id.blue1_button);
        blue1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Blue1Activity.class);
                startActivity(i);
            }
        });
    }
}
