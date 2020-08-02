package com.banco.bogota.banckend.service;

import com.banco.bogota.banckend.domain.Location;
import com.banco.bogota.banckend.dto.LocationDto;

import java.util.List;

public interface ILocationService {

    Location createLocation(LocationDto locationDto);
    List<Location> getLoactions();
}
