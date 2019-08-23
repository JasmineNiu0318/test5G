package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.LocationMapper;
import com.qzkj.demo.pojo.Location;
import com.qzkj.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationMapper locationMapper;


    @Override
    public int addLocation(Location location) {
        return locationMapper.addLocation(location);
    }
}
