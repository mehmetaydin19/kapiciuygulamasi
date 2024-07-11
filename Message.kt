package com.samioglu.newc

data class Message(
    var id: String? = null,
    var message: String? = null,
    var senderId: String? = null,
    var counter: Int = 0,
    var isRead: Boolean = false // Yeni eklenen alan
) {
    fun incrementCounter() {
        counter++
    }

    fun resetCounter() {
        counter = 0
    }
}