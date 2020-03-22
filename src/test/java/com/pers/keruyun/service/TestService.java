package com.pers.keruyun.service;

import com.pers.keruyun.config.KeruyunConfig;
import com.pers.keruyun.model.response.CommonResponse;
import com.pers.keruyun.service.impl.KeruyunServiceImpl;
import com.pers.keruyun.util.DateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

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

}
