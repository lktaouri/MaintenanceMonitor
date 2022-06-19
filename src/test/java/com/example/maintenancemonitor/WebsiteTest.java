package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    Website ws = new Website();
    @Test
    void indexTest(){
        String a = ws.index();
        String exp = String.format("Hallo! Willkommen zum Maintenance Monitor!, %s",ws.time);
        assertEquals(exp,a);
    }


    @Test
    void getTest(){
        String a = ws.getMessage("Hallo!");
        String exp = String.format("Hallo!, %s",ws.time);
        assertEquals(exp,a);
    }

    @Test
    void resetTest(){
        String a = ws.resetMessage();
        String exp = "";
        assertEquals(exp,a);
    }

    @Test
    void statusTest1(){
        String a = ws.status(String.format("fine, %s",ws.time));
        String exp = String.format("GREEN MONITOR, %s", ws.time);
        assertEquals(exp,a);
    }

    @Test
    void statusTest2(){
        String a = ws.status(String.format("bad, %s",ws.time));
        String exp = String.format("RED MONITOR, %s", ws.time);
        assertEquals(exp,a);
    }

    @Test
    void statusTest3(){
        String a = ws.status("test");
        String exp = String.format("WHITE MONITOR, %s", ws.time);
        assertEquals(exp,a);
    }

}