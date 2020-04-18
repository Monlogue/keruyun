package com.pers.keruyun.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pers.keruyun.constant.RequestConstant;
import com.pers.keruyun.service.CommonService;
import com.pers.keruyun.service.SupplyChainService;
import com.pers.keruyun.util.HttpRequestUtil;
import com.pers.keruyun.util.JsonUtil;

import java.util.Map;

public class SupplyChainServiceImpl extends CommonService implements SupplyChainService {
    @Override
    public Map transactionVoucher(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.TRANSACTIONVOUCHER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map findInventory(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FINDINVENTORY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map findInventoryForDish(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FINDINVENTORYFORDISH, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchWarehouseList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHWAREHOUSELIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchSupplierCateList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHSUPPLIERCATELIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchSupplierList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHSUPPLIERLIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map findSku(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FINDSKU, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map skuType(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SKUTYPE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map fetchFinanceRecordList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.FETCHFINANCERECORDLIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map outboundDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.OUTBOUNDDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map purchaseAsn(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.PURCHASEASN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map purchaseAsnDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.PURCHASEASNDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map purchaseOrder(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.PURCHASEORDER, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map returnQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RETURNQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map returnQueryDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RETURNQUERYDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map queryDeliveryList(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.QUERYDELIVERYLIST, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map backStorageDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.BACKSTORAGEDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map inboundPage(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.INBOUNDPAGE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map inboundDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.INBOUNDDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map outBoundQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.OUTBOUNDQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map outBoundDetailQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.OUTBOUNDDETAILQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map allocationPageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.PAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map allocationDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.ALLOCATION_DETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map inventoryPageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.INVENTORY_PAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map inventoryDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.INVENTORY_DETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map returnPageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RETURN_PAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map queryDeliveryDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.QUERYDELIVERYDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map stockOut(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.STOCK_OUT, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map stockIn(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.STOCK_IN, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map receivePageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RECEIVEPAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map receiveDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RECEIVEDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map scrapPageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SCRAPPAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map scrapDetail(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.SCRAPDETAIL, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map backStoragePageQuery(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.BACKSTORAGEPAGEQUERY, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }

    @Override
    public Map receiptSave(Map map) {
        String url = JsonUtil.splitUrl(RequestConstant.RECEIPT_SAVE, keruyunConfig.getCommonMap());
        String responseString = HttpRequestUtil.post(url, JSONObject.toJSONString(map));
        Map result = JsonUtil.toObject(responseString, Map.class);
        if (Integer.parseInt(result.get("code").toString()) == 0) {
            return result;
        }
        return null;
    }
}
