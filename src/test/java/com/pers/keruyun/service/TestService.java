package com.pers.keruyun.service;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.config.KeruyunConfig;
import com.pers.keruyun.service.impl.KeruyunServiceImpl;
import com.pers.keruyun.util.DateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试客如云接口
 */
public class TestService {
    private static final Log logger = LogFactory.getLog(TestService.class);

    private KeruyunConfig keruyunConfig = new KeruyunConfig();

    {
        keruyunConfig.setAppKey("46f26651f8cb159e7c25179a97a3d2e0");
        keruyunConfig.setSecretKey("5d787e0ce593c4bf9ed5daa4691eab4f");
        keruyunConfig.setShopIdenty("810539515");
        keruyunConfig.setTimestamp(String.valueOf(DateUtil.getSecondTimestampTwo(new Date())));
        keruyunConfig.setVersion("1.0");
    }


    @Test
    public void testQueryOrder() throws Exception {
        KeruyunServiceImpl keruyunService = new KeruyunServiceImpl();
        keruyunService.setKeruyunConfig(keruyunConfig);
        Map category = keruyunService.getCategory();
        //Map categoryAll = keruyunService.getCategoryAll();
        Map map = new HashMap();
        map.put("dishTypeId", "302072985848684544");
        //Map dishNew = keruyunService.getDishNew(map);
        map.clear();
        map.put("shopIdenty", "810539515");
        Long[] ids = new Long[]{Long.parseLong("302165255428030464")};
        map.put("ids", ids);
        //Map dishMenuByIds = keruyunService.getDishMenuByIds(map);
        map.clear();
    }

    @Test
    public void create() throws Exception {
        //String path = getClass().getClassLoader().getResource("create.json").toString();
        String path = "C:\\Users\\Administrator\\Desktop\\keruyun\\src\\main\\resourcescreate.json";
        String jsonStr = "";
        try {
            File jsonFile = new File(path);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            Map map = (Map) JSONObject.parse(jsonStr);
            KeruyunServiceImpl keruyunService = new KeruyunServiceImpl();
            keruyunService.setKeruyunConfig(keruyunConfig);
            Map result = keruyunService.create(map);
            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
