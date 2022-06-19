package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String message = "";

    private Website web = new Website();
    @RequestMapping("/")
    public String index(){
        return web.index();
    }
    @RequestMapping("/set")
    public String set(@RequestParam String a){
        message = web.getMessage(a);
        return String.format("Message set as: %s",message);
    }
    @RequestMapping("/send")
    public String sendMessage(){
        if(web.getMessage(message).equals("")){
            return "No message set";
        }
        return web.getMessage(message);
    }

    @RequestMapping("/reset")
    public String resetMessage(){
        message = web.resetMessage();
        return "Message was reset!";
    }

    @RequestMapping("/status")
    public String status(){
        return web.status(message);
    }

}


