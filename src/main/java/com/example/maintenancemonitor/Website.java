package com.example.maintenancemonitor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Website {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String time = String.format("%s CET",dtf.format(now));

    public String index(){
        return String.format("Hallo! Willkommen zum Maintenance Monitor!, %s",time);
    }

    public String getMessage(String m) {
        if(m.equals("")){
            return String.format("No message was set, %s", time);
        }
        return String.format("%s, %s",m, time);
    }

    public String resetMessage(){
        return "";
    }

    public String status(String message) {
        if ( message.equals(String.format("fine, %s",time))) {
            return String.format("GREEN MONITOR, %s", time);
        } else if (message.equals(String.format("bad, %s",time))) {
            return String.format("RED MONITOR, %s", time);
        }
        else{
            return String.format("WHITE MONITOR, %s", time);
        }
    }
}
