package com.example.urlhitcounter.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private Map<String, Integer> hitCounter = new HashMap<>();

    public int getCount(String username) {
        if (!hitCounter.containsKey(username)) {
            hitCounter.put(username, 0);
        }
        hitCounter.put(username, hitCounter.get(username) + 1);
        return hitCounter.get(username);
    }

    public Map<String, Integer> findAll() {
        return hitCounter;
    }
}
