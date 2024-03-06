package com.example.aula02;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity01 extends AppCompatActivity {
@Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);

        TextView txt = new TextView(this);
        txt.setText(R.string.hello);
        setContentView(txt);

        setContentView(R.layout.layout_activity01);
    }
}
