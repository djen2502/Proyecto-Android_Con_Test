package com.example.iesmurgi.u3_r2_holamundopersonalizado

import org.junit.Assert
import org.junit.Test

class MainActivityTestUnitario{

    @Test
    fun pruebaunitaria(){
        Assert.assertEquals(4, MainActivity.multiplicacion(2,2))

    }



}