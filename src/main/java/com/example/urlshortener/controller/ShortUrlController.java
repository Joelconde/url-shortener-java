package com.example.urlshortener.controller;

import com.example.urlshortener.model.ShortUrl;
import com.example.urlshortener.service.ShortUrlService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.Map;

@RestController
public class ShortUrlController {

    private final ShortUrlService service;

    public ShortUrlController(ShortUrlService service) {
        this.service = service;
    }

    // Endpoint raíz (evita Whitelabel)
    @GetMapping("/")
    public String home() {
        return "URL Shortener API is running 🚀";
    }

    // Crear URL corta
    @PostMapping("/shorten")
    public ShortUrl shorten(@RequestBody Map<String, String> body) {
        return service.create(body.get("url"));
    }

    // Redirección
    @GetMapping("/{code}")
    public ResponseEntity<Void> redirect(@PathVariable String code) {
        ShortUrl s = service.get(code);

        return ResponseEntity.status(302)
                .location(URI.create(s.getOriginalUrl()))
                .build();
    }
}


