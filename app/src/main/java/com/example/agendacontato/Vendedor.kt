package com.example.agendacontato

data class Vendedor(val id : Int = 0,
                    val nome : String = "",
                    val telefone : String = "",
                    val email : String = "",
                    val CPF : String = "",
                    val CPNJ : String = "",
                    val endereco : String = "") {

    override fun toString(): String {
        return this.nome + "-" + this.telefone
    }
}