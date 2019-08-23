package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.FtpUpLoad;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FtpUpLoadMapper {
    int addUpLoad(FtpUpLoad ftpUpLoad);
}
