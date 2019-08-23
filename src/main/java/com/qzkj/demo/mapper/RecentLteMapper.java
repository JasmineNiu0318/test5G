package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.RecentLte;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecentLteMapper {
    int addRecentLte(List<RecentLte> recentLte);
}
