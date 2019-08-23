package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.NeighboringBaseStationMapper;
import com.qzkj.demo.pojo.NeighboringBaseStation;
import com.qzkj.demo.service.NeighboringBaseStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighboringBaseStationServiceImpl implements NeighboringBaseStationService {
    @Autowired
    NeighboringBaseStationMapper neighboringBaseStationMapper;

    @Override
    public int addNeighboringBaseStation(List<NeighboringBaseStation> list) {
       return neighboringBaseStationMapper.addNeighboringBaseStation(list);
    }
}
