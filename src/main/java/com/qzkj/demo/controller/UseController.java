package com.qzkj.demo.controller;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qzkj.demo.pojo.*;
import com.qzkj.demo.service.*;
import com.qzkj.demo.unity.ResponseCode;
import com.qzkj.demo.unity.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/api"})
public class UseController {
    @Autowired
    LocationService locationService;

    @Autowired
    NeighboringBaseStationService neighboringBaseStationService;

    @Autowired
    NetworkInfoService networkInfoService;

    @Autowired
    PhoneInfoService phoneInfoService;

    @Autowired
    RecentLteService recentLteService;

    @Autowired
    FtpDownLoadService ftpDownLoadService;

    @Autowired
    FtpUpLoadService ftpUpLoadService;

    @RequestMapping(value = {"/PhoneInformation/PhoneDataInDb"},method = RequestMethod.POST)
    public ResponseCode add(HttpServletRequest request) {

        //初始化对象
        PhoneInfo phoneInfo = new PhoneInfo();
        Location location = new Location();
        NetworkInfo networkInfo = new NetworkInfo();
        List<NeighboringBaseStation> neiList = new ArrayList<>();
        //获取随机值code
        String code = UUIDUtil.getCode();
        //从request获取参数信息
        String param = getParm(request);
        //将参数转化为JSONObject对象
        JSONObject jObject = JSON.parseObject(param);
        //获取recentLte信息并转化为list集合
        List<RecentLte> recentLtesList = JSONArray.parseArray(jObject.getString("recentLte"), RecentLte.class);
        //遍历集合，set code值
        recentLtesList.forEach(recentLte -> {
            recentLte.setCode(code);
        });

        //获取data信息并转化为Map
        Map<String, Object> dataMap = JSON.parseObject(jObject.getString("data"),Map.class);
        //遍历Map获取location、phoneInfo、networkInfo、nei信息并转化为对象或对象集合
        for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
            //因为key是毫秒数，所以判断key是否全是数字
            if(UUIDUtil.isNumeric(entry.getKey())){
                JSONArray jsonArray = JSONArray.parseArray(entry.getValue().toString());
                if(!StringUtils.isEmpty(jsonArray.getString(0))) {
                    JSONObject object = JSONObject.parseObject(jsonArray.getString(0));
                    phoneInfo = JSON.parseObject(object.getString("phoneInfo"), PhoneInfo.class);
                    location = JSON.parseObject(object.getString("location"), Location.class);
                    networkInfo = JSON.parseObject(object.getString("networkInfo"), NetworkInfo.class);
                    neiList = JSONArray.parseArray(object.getString("neighboringBaseStation"), NeighboringBaseStation.class);
                }
            }
        }
        //set code值
        phoneInfo.setCode(code);
        location.setCode(code);
        networkInfo.setCode(code);
        //遍历集合 set code值
        neiList.forEach(nei -> {
            nei.setCode(code);
        });


        //插入数据库
        int add1 = locationService.addLocation(location);
        int add2 = neighboringBaseStationService.addNeighboringBaseStation(neiList);
        int add3 = networkInfoService.addNetworkInfo(networkInfo);
        int add4 = phoneInfoService.addPhoneInfo(phoneInfo);
        int add5 = recentLteService.addRecentLte(recentLtesList);
        if(add1 == 1 && add2 != 0 && add3 == 1 && add4 == 1 && add5 != 0){
            return ResponseCode.OK();
    }
        return ResponseCode.UNKNOWNERROR();
    }

    @RequestMapping(value = {"/PhoneInformation/ftpUploadTest"},method = RequestMethod.POST)
    public ResponseCode upLoad(HttpServletRequest request,FtpUpLoad ftpUpLoad){
//        FtpUpLoad ftpUpLoad = new FtpUpLoad();
//        String param = getParm(request);
//        JSONObject jObject = JSON.parseObject(param);
//        ftpUpLoad  = JSON.parseObject(jObject.getString("FtpUploadBean"), FtpUpLoad.class);
        int add = ftpUpLoadService.addUpLoad(ftpUpLoad);
        if (add == 1){
            return ResponseCode.OK();
        }
        return ResponseCode.UNKNOWNERROR();
    }

    @RequestMapping(value = {"/PhoneInformation/ftpDownloadTest"},method = RequestMethod.POST)
    public ResponseCode downLoad(HttpServletRequest request,FtpDownLoad ftpDownLoad){
//        FtpDownLoad ftpDownLoad = new FtpDownLoad();
//        String param = getParm(request);
//        JSONObject jObject = JSON.parseObject(param);
//        ftpDownLoad = JSON.parseObject(jObject.getString("FtpDownloadBean"),FtpDownLoad.class);
        int add = ftpDownLoadService.addDownLoad(ftpDownLoad);
        if (add == 1){
            return ResponseCode.OK();
        }
        return ResponseCode.UNKNOWNERROR();
    }

    /**
     * 获取POST请求中Body参数
     * @param request
     * @return 字符串
     */
    public String getParm(HttpServletRequest request) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();

    }
}
