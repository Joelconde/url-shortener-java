package com.example.urlshortener.service;

import com.example.urlshortener.model.ShortUrl;
import com.example.urlshortener.repository.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShortUrlService {

    private final ShortUrlRepository repo;

    public ShortUrlService(ShortUrlRepository repo) {
        this.repo = repo;
    }

    public ShortUrl create(String url) {
        ShortUrl s = new ShortUrl();
        s.setOriginalUrl(url);
        s.setShortCode(UUID.randomUUID().toString().substring(0, 6));
        return repo.save(s);
    }

    public ShortUrl get(String code) {
        return repo.findByShortCode(code)
                .orElseThrow(() -> new RuntimeException("URL not found"));
    }
}

