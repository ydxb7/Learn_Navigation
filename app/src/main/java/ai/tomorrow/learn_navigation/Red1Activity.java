package ai.tomorrow.learn_navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Red1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red1);

        Button red2_button = (Button) findViewById(R.id.red2_button);
        red2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Red1Activity.this, LightRed2Activity.class);
                startActivity(i);
            }
        });
    }
}
