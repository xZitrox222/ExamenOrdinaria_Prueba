package org.dis.back;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetIpFromTest {

    IP ip_nueva = null;
    int tam_max = 0;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ip_nueva = new IP(); //Creamos nueva IP
        ip_nueva.setIp_from(253257834);
        tam_max = 12;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @Test
    void getIp_from() {
        long resultado = ip_nueva.getIp_from();
        int tamaño = Long.toString(resultado).length();
        int correcto = 0;
        if (tamaño <= tam_max){
            correcto = 0;
        }
        else{
            correcto = 1;
        }
        assertEquals(0, correcto);
    }
}