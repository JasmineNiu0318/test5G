package com.qzkj.demo.service.impl;

import com.qzkj.demo.mapper.FtpDownLoadMapper;
import com.qzkj.demo.pojo.FtpDownLoad;
import com.qzkj.demo.service.FtpDownLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FtpDownLoadServiceImpl implements FtpDownLoadService {
    @Autowired
    FtpDownLoadMapper ftpDownLoadMapper;

    @Override
    public int addDownLoad(FtpDownLoad ftpDownLoad) {
        return ftpDownLoadMapper.addDownLoad(ftpDownLoad);
    }
}
