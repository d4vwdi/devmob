package com.example.agendacontato

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomViewholder(view : View) : RecyclerView.ViewHolder(view) {
    lateinit var txtNome : TextView
    lateinit var txtTelefone : TextView
    lateinit var txtEmail : TextView


init {
    txtNome = view.findViewById(R.id.txtRowName)
    txtTelefone = view.findViewById(R.id.txtRowTelefone)
    txtEmail = view.findViewById(R.id.txtRowEmail)

}

}