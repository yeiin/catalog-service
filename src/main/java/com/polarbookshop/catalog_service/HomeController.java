package com.polarbookshop.catalog_service;

import com.polarbookshop.catalog_service.config.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final PolarProperties properties;

    public HomeController(PolarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public String getGreeting(){
        return properties.getGreeting();
    }
}
