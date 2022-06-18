package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String message;
    @RequestMapping("/")
    public String index(){
        return "Hallo! Willkommen zum MaintenanceMonitor!";
    }
    @RequestMapping("/set")
    public String setMessage(@RequestParam String a){
        message = a;
        return String.format("Message set as: %s",message);
    }
    @RequestMapping("/send")
    public String sendMessage(){
        return message;
    }

    @RequestMapping("/reset")
    public String resetMessage(){
        message = "";
        return "Message was reset";

    }
}


