package com.rewe.scales.site.location;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("locations")
class LocationController {

    private final LocationService service;

    public LocationController(LocationService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Location> getAllArticles(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public Location create(Location article) {
        return service.save(article);
    }

    @DeleteMapping
    public void delete(long id) {
        service.delete(id);
    }

    @PostMapping("{locationId}/device/{scaleId}")
    public void assign(@RequestParam(name="locationId") Long locationId, @RequestParam(name="scaleId") Long scaleId) {

    }
}
