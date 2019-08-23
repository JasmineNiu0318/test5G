package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.FtpUpLoadMapper;
import com.qzkj.demo.pojo.FtpUpLoad;
import com.qzkj.demo.service.FtpUpLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FtpUpLoadServiceImpl implements FtpUpLoadService {
    @Autowired
    FtpUpLoadMapper ftpUpLoadMapper;

    @Override
    public int addUpLoad(FtpUpLoad ftpUpLoad) {
        return ftpUpLoadMapper.addUpLoad(ftpUpLoad);
    }
}
