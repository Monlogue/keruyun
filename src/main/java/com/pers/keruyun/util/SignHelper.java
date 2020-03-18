package com.pers.keruyun.util;

import com.pers.keruyun.config.KeruyunConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

/**
 * 签名计算工具类
 */
public class SignHelper {
    private static final Log logger = LogFactory.getLog(SignHelper.class);

    /**
     * @param
     * @throws
     * @Description: 获取token时签名验证（只在获取token时调用一次）
     */
    public static void signForToken(KeruyunConfig keruyunConfig) {
        Map<String, Object> params = new TreeMap<String, Object>();
        params.put("appKey", keruyunConfig.getAppKey());
        params.put("shopIdenty", keruyunConfig.getShopIdenty());
        params.put("version", keruyunConfig.getVersion());
        params.put("timestamp", keruyunConfig.getTimestamp());
        StringBuilder sortedParams = new StringBuilder();
        params.entrySet().stream().forEachOrdered(paramEntry -> sortedParams.append(paramEntry.getKey()).append(paramEntry.getValue()));
        sortedParams.append(keruyunConfig.getSecretKey());//请替换成真实的secretKey
        String SHA256Sign = null;
        try {
            //组装的参数请求token
            SHA256Sign = getSign(sortedParams.toString());
        } catch (NoSuchAlgorithmException e) {
            logger.info("获取签名出错" + e.getMessage(), e);
        }
        keruyunConfig.setSign(SHA256Sign);
    }

    /**
     * 普通接口加密，获取到token之后
     **/
    public static void setSign(KeruyunConfig keruyunConfig) {
        Map<String, Object> params = new TreeMap<String, Object>();
        params.put("appKey", keruyunConfig.getAppKey());
        params.put("shopIdenty", keruyunConfig.getShopIdenty());
        params.put("version", keruyunConfig.getVersion());
        params.put("timestamp", keruyunConfig.getTimestamp());
        StringBuilder sortedParams = new StringBuilder();
        params.entrySet().stream().forEachOrdered(paramEntry -> sortedParams.append(paramEntry.getKey()).append(paramEntry.getValue()));
        sortedParams.append(keruyunConfig.getToken());//请替换成真实的token
        String SHA256Sign = null;
        try {
            SHA256Sign = getSign(sortedParams.toString());
            keruyunConfig.setSign(SHA256Sign);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param
     * @return String
     * @throws NoSuchAlgorithmException
     * @Description: SHA256加密字符串
     */
    private static String getSign(String sortedParams) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(sortedParams.getBytes());
        byte byteBuffer[] = messageDigest.digest();
        StringBuffer strHexString = new StringBuffer();
        for (int i = 0; i < byteBuffer.length; i++) {
            String hex = Integer.toHexString(0xff & byteBuffer[i]);
            if (hex.length() == 1) {
                strHexString.append('0');
            }
            strHexString.append(hex);
        }
        // 得到返回結果
        String SHA256Sign = strHexString.toString();
        return SHA256Sign;
    }

}
