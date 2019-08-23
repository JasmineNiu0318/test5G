package com.qzkj.demo.mapper;

import com.qzkj.demo.pojo.PhoneInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PhoneInfoMapper {
    int addPhoneInfo(PhoneInfo phoneInfo);
}
