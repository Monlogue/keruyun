package com.pers.keruyun.service;

import java.util.Map;

/**
 * 门店信息
 */
public interface ShopService {
    /**
     * 获取门店列表
     * @param map
     * @return
     */
    Map shoplist(Map map);

    /**
     * 获取门店信息
     * @param map
     * @return
     */
    Map shopdetails(Map map);

    /**
     * 查询桌台信息
     * @param map
     * @return
     */
    Map fetchTables(Map map);

    /**
     * 获取门店经营时间
     * @param map
     * @return
     */
    Map fetchPeriod(Map map);

    /**
     * 获取门店应用下可用门店
     * @param map
     * @return
     */
    Map fetchAppShops(Map map);

    /**
     * 查询门店堂食和外卖营业状态
     * @param map
     * @return
     */
    Map queryStatus(Map map);

    /**
     * 修改门店堂食和外卖营业状态
     * @param map
     * @return
     */
    Map modifyStatus(Map map);

    /**
     * 支付类型查询
     * @param map
     * @return
     */
    Map payWayQuery(Map map);

    /**
     * 附加费配置查询接口
     * @param map
     * @return
     */
    Map surchargeQuery(Map map);

    /**
     * 获取token
     * @param map
     * @return
     */
    Map accessToken(Map map);

    /**
     * 获取用户信息
     * @param map
     * @return
     */
    Map getUserInfo(Map map);
}
