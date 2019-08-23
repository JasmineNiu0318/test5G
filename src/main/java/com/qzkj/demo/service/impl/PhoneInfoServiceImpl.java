package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.PhoneInfoMapper;
import com.qzkj.demo.pojo.PhoneInfo;
import com.qzkj.demo.service.PhoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneInfoServiceImpl implements PhoneInfoService {
    @Autowired
    PhoneInfoMapper phoneInfoMapper;

    @Override
    public int addPhoneInfo(PhoneInfo phoneInfo) {
       return phoneInfoMapper.addPhoneInfo(phoneInfo);
    }
}
