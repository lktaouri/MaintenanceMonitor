package com.example.maintenancemonitor;

public class Website {


    public String index(){
        return "Hallo! Willkommen zum MaintenanceMonitor!";
    }

    public String getMessage(String a) {
        return a;
    }

    public String resetMessage(){
        return " ";
    }

    public String status(String message) {;
        if ( message.equalsIgnoreCase("fine")) {
            return "GREEN MONITOR";
        } else if (message.equalsIgnoreCase("bad")) {
            return "RED MONITOR";
        }
        else{
            return "WHITE MONITOR";
        }
    }
}
