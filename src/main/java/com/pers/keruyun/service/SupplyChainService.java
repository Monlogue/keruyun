package com.pers.keruyun.service;

import java.util.Map;

/**
 * 供应链
 */
public interface SupplyChainService {

    /**
     * 获取交易凭证
     * @param map
     * @return
     */
    Map transactionVoucher(Map map);

    /**
     * 查询供应链物品库存
     * @param map
     * @return
     */
    Map findInventory(Map map);

    /**
     * 查询商品库存
     * @param map
     * @return
     */
    Map findInventoryForDish(Map map);

    /**
     * 查询仓库列表
     * @param map
     * @return
     */
    Map fetchWarehouseList(Map map);

    /**
     * 查询供应商类别
     * @param map
     * @return
     */
    Map fetchSupplierCateList(Map map);

    /**
     * 查询供应商列表
     * @param map
     * @return
     */
    Map fetchSupplierList(Map map);

    /**
     * 查询供应链物品接口
     * @param map
     * @return
     */
    Map findSku(Map map);

    /**
     * 查询物品分类
     * @param map
     * @return
     */
    Map skuType(Map map);

    /**
     * 查询交易记录
     * @param map
     * @return
     */
    Map fetchFinanceRecordList(Map map);

    /**
     * 查询非销售单出库明细
     * @param map
     * @return
     */
    Map outboundDetail(Map map);

    /**
     * 查询采购入库单列表
     * @param map
     * @return
     */
    Map purchaseAsn(Map map);

    /**
     * 查询采购入库单明细
     * @param map
     * @return
     */
    Map purchaseAsnDetail(Map map);

    /**
     * 查询采购订单
     * @param map
     * @return
     */
    Map purchaseOrder(Map map);

    /**
     * 采购退货单列表
     * @param map
     * @return
     */
    Map returnQuery(Map map);

    /**
     * 查询采购退货单明细
     * @param map
     * @return
     */
    Map returnQueryDetail(Map map);

    /**
     * 配送签收单分页查询
     * @param map
     * @return
     */
    Map queryDeliveryList(Map map);

    /**
     * 退回入库单详情查询
     * @param map
     * @return
     */
    Map backStorageDetail(Map map);

    /**
     * 入库分页查询
     * @param map
     * @return
     */
    Map inboundPage(Map map);

    /**
     * 入库详情查询
     * @param map
     * @return
     */
    Map inboundDetail(Map map);

    /**
     * 出库分页查询
     * @param map
     * @return
     */
    Map outBoundQuery(Map map);

    /**
     * 出库详情查询
     * @param map
     * @return
     */
    Map outBoundDetailQuery(Map map);

    /**
     * 调拨单分页查询
     * @param map
     * @return
     */
    Map allocationPageQuery(Map map);

    /**
     * 调拨单详情查询
     * @param map
     * @return
     */
    Map allocationDetail(Map map);

    /**
     * 盘点单分页查询
     * @param map
     * @return
     */
    Map inventoryPageQuery(Map map);

    /**
     * 盘点单详情查询/退回单详情查询
     * @param map
     * @return
     */
    Map inventoryDetail(Map map);

    /**
     * 退回单分页查询
     * @param map
     * @return
     */
    Map returnPageQuery(Map map);

    /**
     * 查询配送签收单详情
     * @param map
     * @return
     */
    Map queryDeliveryDetail(Map map);

    /**
     * 出库单保存
     * @param map
     * @return
     */
    Map stockOut(Map map);

    /**
     * 入库单保存
     * @param map
     * @return
     */
    Map stockIn(Map map);

    /**
     * 收货单分页查询
     * @param map
     * @return
     */
    Map receivePageQuery(Map map);

    /**
     * 收货单详情
     * @param map
     * @return
     */
    Map receiveDetail(Map map);

    /**
     * 报废单分页查询
     * @param map
     * @return
     */
    Map scrapPageQuery(Map map);

    /**
     * 报废单详情查询
     * @param map
     * @return
     */
    Map scrapDetail(Map map);

    /**
     * 退回入库单分页查询
     * @param map
     * @return
     */
    Map backStoragePageQuery(Map map);

    /**
     * 配送签收单修改保存
     * @param map
     * @return
     */
    Map receiptSave(Map map);
}
