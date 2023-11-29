package com.example.unittest

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }
    @Test
    fun username(){
        val username =""
       val verify=  LoginUtils.validate(username,"ahajh@1","34333332sjs",19)
        assert(verify=="please enter your name")
    }
}