package com.example.unittest

object LoginUtils {

    fun validate(username : String , email : String , password : String , age : Int): String? {
        if (username.isEmpty()) return "please enter your name"
        if (username.length<4) return "UserName is very short"
        if (username.length>20) return "very long username"

        if (email.isEmpty()) return "please enter email"
        if (!email.contains("@")) return "please enter valid Email"
        if (email.filter { it.isDigit() }.isEmpty()) return "Email must contain at least one digit"

        if (password.isEmpty()) return "please enter password"
        if (password.length<6) return "please enter strong password"

        if (age==0) return "please enter valid age"
        if (age<18) return "not eligible"

        return null

    }
}