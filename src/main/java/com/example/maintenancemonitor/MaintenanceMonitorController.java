package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private String message;
    private Website web = new Website();
    @RequestMapping("/")
    public String index(){
        return web.index();
    }
    @RequestMapping("/set")
    public String setMessage(@RequestParam String a){
        return message = a;
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

    @RequestMapping("/fine")
    public void fine(){
        message = setMessage("fine");
    }

    @RequestMapping("/bad")
    public void bad(){
        message = setMessage("bad");
    }

    @RequestMapping("/status")
    public String status(){
        if(message == "bad") return "red";
        return "green";
    }
}


