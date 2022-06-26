package br.com.aprendendo.usein

class UseIn {

    fun exists(c: Char): Boolean {
        return c in 'a'..'z'
    }

    fun existsKeySensitive(c: Char): Boolean {
        return c in 'A'..'Z'
    }

    fun notExists(c: Char): Boolean {
        return c !in 'a'..'b'
    }
}