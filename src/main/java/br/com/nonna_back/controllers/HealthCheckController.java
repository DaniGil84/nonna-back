package br.com.nonna_back.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health-check/liveness")
    String liveness() {
        return "OK";
    }
}
