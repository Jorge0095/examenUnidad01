package com.example.examenunidad01

import java.io.Serializable

class CuentaBanco : Serializable {
    // Atributos de la clase
    var numCuenta: String = ""
    var nombre: String = ""
    var banco: String = ""
    var saldo: Float = 0.0f

    // Métodos de la clase
    fun obtenerSaldo(): Float {
        return saldo
    }

    fun depositar(cantidad: Float) {
        saldo += cantidad
    }

    fun retirar(cantidad: Float) {
        saldo -= cantidad
    }
}
