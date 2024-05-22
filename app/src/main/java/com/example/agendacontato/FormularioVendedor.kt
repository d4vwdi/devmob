package com.example.agendacontato

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.awt.font.TextAttribute

class FormularioVendedor : AppCompatActivity() {

    val nome = findViewById<EditText>(R.id.edtNome)
    val telefone = findViewById<EditText>(R.id.edtTelefone)
    val email = findViewById<EditText>(R.id.edtEmail)
    val cpf = findViewById<EditText>(R.id.edtCpf)
    val endereco = findViewById<EditText>(R.id.edtEndereco)

    val btnGravar = findViewById<Button>(R.id.btnGravar)




    override fun onCreate(bundle : Bundle ?){
        super.onCreate(bundle)
        setContentView(R.layout.form_vendedor)
    }





}