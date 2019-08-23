package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LocationMapper {
    int addLocation(Location location);
}
