package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.RecentLteMapper;
import com.qzkj.demo.pojo.RecentLte;
import com.qzkj.demo.service.RecentLteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecentLteServiceImpl implements RecentLteService {
    @Autowired
    RecentLteMapper recentLteMapper;

    @Override
    public int addRecentLte(List<RecentLte> recentLte) {
       return recentLteMapper.addRecentLte(recentLte);
    }
}
