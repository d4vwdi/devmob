package com.example.listacontatos;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.internal.EdgeToEdgeUtils;

public class listacontatos extends AppCompatActivity {
    private View button;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.layoutlistacontatos);

        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtFone = findViewById(R.id.edtFone);



        Button Gravar = findViewById(R.id.btnGravar);

        Gravar.setOnClickListener( e-> {
            Log.i("AGENDA_CONTATO", "Nome: " + edtNome.getText());
            Log.i("AGENDA_CONTATO", "Email: " + edtEmail.getText());
            Log.i("AGENDA_CONTATO", "Telefone: " + edtFone.getText());
                }
        );



    }


}
