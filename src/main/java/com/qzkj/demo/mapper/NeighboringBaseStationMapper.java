package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.NeighboringBaseStation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NeighboringBaseStationMapper {
    int addNeighboringBaseStation(List<NeighboringBaseStation> list );
}
