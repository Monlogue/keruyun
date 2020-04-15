package com.pers.keruyun.service;

import java.util.Map;

public interface MemberService  {
    /**
     * 创建顾客
     * @param map
     * @return
     */
    Map createCustomer(Map map);

    /**
     * 创建/升级会员
     * @param map
     * @return
     */
    Map createOrUpgradeMember(Map map);

    /**
     * 会员详情查询
     * @param map
     * @return
     */
    Map getCustomerDetailById(Map map);

    /**
     * 修改会员详情
     * @param map
     * @return
     */
    Map updateCustomerInfo(Map map);

    /**
     * 查询会员实体卡列表
     * @param map
     * @return
     */
    Map getCustomerCards(Map map);

    /**
     * 查询品牌下会员等级
     * @param map
     * @return
     */
    Map getMemberLevelList(Map map);

    /**
     * 修改会员等级信息
     * @param map
     * @return
     */
    Map updateLevel(Map map);

    /**
     * 顾客/会员登录
     * @param map
     * @return
     */
    Map login(Map map);

    /**
     * 获取免登录token
     * @param map
     * @return
     */
    Map autoLogin(Map map);

    /**
     * 会员登录二维码
     * @param map
     * @return
     */
    Map generateToken(Map map);

    /**
     * 会员充值/消费记录查询
     * @param map
     * @return
     */
    Map fetchStoreDetail(Map map);

    /**
     * 会员充值接口
     * @param map
     * @return
     */
    Map recharge(Map map);

    /**
     * 查询门店储值消费金额
     * @param map
     * @return
     */
    Map commercialTotalStore(Map map);

    /**
     * 会员积分增加
     * @param map
     * @return
     */
    Map addPoint(Map map);

    /**
     * 会员积分扣减
     * @param map
     * @return
     */
    Map cutPoint(Map map);

    /**
     * 查询优惠券列表
     * @param map
     * @return
     */
    Map fetchCoupInstanceList(Map map);

    /**
     * 查询优惠券详情
     * @param map
     * @return
     */
    Map fetchCoupInstanceDetail(Map map);

    /**
     * 查询券模板列表
     * @param map
     * @return
     */
    Map couponPage(Map map);

    /**
     * 券模板发券接口
     * @param map
     * @return
     */
    Map couponManualSend(Map map);

    /**
     * 合作方对客如云券核销
     * @param map
     * @return
     */
    Map couponValidate(Map map);

    /**
     * 查询门店营销规则
     * @param map
     * @return
     */
    Map fetchRules(Map map);
}
