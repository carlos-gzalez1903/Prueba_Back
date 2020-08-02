package com.banco.bogota.banckend.controller;

import com.banco.bogota.banckend.domain.Location;
import com.banco.bogota.banckend.dto.LocationDto;
import com.banco.bogota.banckend.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LocationController {

    @Autowired
    private ILocationService locationService;

    @PostMapping(value = "")
    public Location createLocation(@RequestBody LocationDto locationDto){
        return locationService.createLocation(locationDto);
    }

    @GetMapping(value = "")
    public List<Location> getLocations(){
        return locationService.getLoactions();
    }
}
