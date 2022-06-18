package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    @RequestMapping("/")
    public String index(){
        return "Willkommen zum MaintenanceMonitor!";
    }
}
