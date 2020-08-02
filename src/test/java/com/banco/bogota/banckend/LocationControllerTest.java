package com.banco.bogota.banckend;

import com.banco.bogota.banckend.controller.LocationController;
import com.banco.bogota.banckend.domain.Location;
import com.banco.bogota.banckend.service.ILocationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LocationControllerTest {

    @InjectMocks
    private LocationController locationController;

    @Mock
    private ILocationService locationService;

    @Test
    public void getLocations(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(1,"Location One",45));
        locations.add(new Location(2,"Location Two",100));
        Mockito.when(locationService.getLoactions()).thenReturn(locations);
        List<Location> locationList = locationController.getLocations();
        Assert.assertEquals(locationList.size(),locations.size());
    }
}
