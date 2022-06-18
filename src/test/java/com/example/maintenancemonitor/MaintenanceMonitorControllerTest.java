package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {
    Website web = new Website();
    @Test
    void indexTest(){
        String a = web.index();
        String expected = "Hallo! Willkommen zum MaintenanceMonitor!";
        assertEquals(expected,a);
    }
}