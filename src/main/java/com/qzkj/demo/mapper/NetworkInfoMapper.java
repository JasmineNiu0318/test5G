package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.NetworkInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NetworkInfoMapper {
    int addNetworkInfo(NetworkInfo networkInfo);
}
