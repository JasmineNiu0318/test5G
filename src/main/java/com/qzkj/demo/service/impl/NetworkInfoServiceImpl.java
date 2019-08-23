package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.NetworkInfoMapper;
import com.qzkj.demo.pojo.NetworkInfo;
import com.qzkj.demo.service.NetworkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkInfoServiceImpl implements NetworkInfoService {
    @Autowired
    NetworkInfoMapper networkInfoMapper;

    @Override
    public int addNetworkInfo(NetworkInfo networkInfo) {
        return networkInfoMapper.addNetworkInfo(networkInfo);
    }
}
