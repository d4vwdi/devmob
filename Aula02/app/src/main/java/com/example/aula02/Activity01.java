package com.example.aula02;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
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

        // Chamada dos dados inseridos pelo usuário
    EditText edt_nome = findViewById(R.id.edt_nome);
    EditText edt_email = findViewById(R.id.edt_email);
    EditText edt_telefone = findViewById(R.id.edt_telefone);

    Button btn_gravar = findViewById(R.id.btn_gravar);
    btn_gravar.setOnClickListener( e -> {
        Log.i("AGENDA_CONTATO", "Nome: " + edt_nome.getText());
        Log.i("AGENDA_CONTATO", "E-mail: " + edt_email.getText());
        Log.i("AGENDA_CONTATO", "Telefone: " + edt_telefone.getText());
    });
}
}
