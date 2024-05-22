package com.example.agendacontato

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import java.awt.font.TextAttribute
import java.io.IOException

class FormularioVendedor : AppCompatActivity() {

    val nome = findViewById<EditText>(R.id.edtNome)
    val telefone = findViewById<EditText>(R.id.edtTelefone)
    val email = findViewById<EditText>(R.id.edtEmail)
    val cpf = findViewById<EditText>(R.id.edtCpf)
    val endereco = findViewById<EditText>(R.id.edtEndereco)


    var clientHttp = OkHttpClient()


    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.form_vendedor)
    }





}