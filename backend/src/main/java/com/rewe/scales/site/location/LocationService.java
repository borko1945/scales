package com.rewe.scales.site.location;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class LocationService {
    private final LocationRepository repo;

    LocationService(LocationRepository repo) {
        this.repo = repo;
    }

    Page<Location> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    Location save(Location article) {
        return repo.save(article);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
