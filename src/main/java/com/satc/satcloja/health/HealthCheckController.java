package com.satc.satcloja.health;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @Scheduled(fixedRate = 5000)
    public void doSomething() {
        System.out.println("TESTE");
    }
}
