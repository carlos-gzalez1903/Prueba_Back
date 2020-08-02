package com.banco.bogota.banckend.service.impl;

import com.banco.bogota.banckend.domain.Location;
import com.banco.bogota.banckend.dto.LocationDto;
import com.banco.bogota.banckend.repository.ILocationRepository;
import com.banco.bogota.banckend.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {

    @Autowired
    private ILocationRepository locationRepository;

    @Override
    public Location createLocation(LocationDto locationDto) {
        Location location = new Location();
        location.setName(locationDto.getName());
        location.setAreaM2(locationDto.getAreaM2());
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getLoactions() {
        return locationRepository.findAll();
    }
}
