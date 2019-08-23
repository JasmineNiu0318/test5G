package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.FtpDownLoad;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FtpDownLoadMapper {
    int addDownLoad(FtpDownLoad ftpDownLoad);
}
