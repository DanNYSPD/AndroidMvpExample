package lixdan.dnyspd.com.mvppatternandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lixdan.dnyspd.com.mvppatternandroid.View.AcvityContactos;

public class MainActivity extends AppCompatActivity {

    

    Button btnShowContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowContacts = (Button) findViewById(R.id.btnShowContacts);
        btnShowContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AcvityContactos.class);
                startActivity(i);
            }
        });
    }
}
