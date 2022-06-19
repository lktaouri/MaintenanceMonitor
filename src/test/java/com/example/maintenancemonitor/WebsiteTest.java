package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    Website ws = new Website();
    @Test
    void indexTest(){
        String a = ws.index();
        String exp = "Hallo! Willkommen zum MaintenanceMonitor!";
        assertEquals(exp,a);
    }


    @Test
    void setTest(){
        String a = ws.getMessage("Hallo!");
        String exp = "Hallo!";
        assertEquals(exp,a);
    }

    @Test
    void sendTest(){
        String a = ws.getMessage("Bye!");
        String exp = "Bye!";
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
        String a = ws.status("finE");
        String exp = "GREEN MONITOR";
        assertEquals(exp,a);
    }

    @Test
    void statusTest2(){
        String a = ws.status("bAd");
        String exp = "RED MONITOR";
        assertEquals(exp,a);
    }

    @Test
    void statusTest3(){
        String a = ws.status("test");
        String exp = "WHITE MONITOR";
        assertEquals(exp,a);
    }

}