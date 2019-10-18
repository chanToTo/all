/*
 * 文件名：UMCommonUtil
 * 版权：Copyright by www.baiqishi.com
 * 创建人：zhongqihui
 * 创建时间：2018/11/20
 */

package com.csf.common.testDemo;

import org.apache.commons.lang3.StringUtils;

/**
 * UM 公共工具类
 *
 * @author zhongqihui
 * @version 2018/11/20
 * @since
 */
public class UMCommonUtil {

    /**
     * 转化成搜索引擎识别的词
     * 1. A >> "A"
     * 2. A + B >> "A" "B"
     * 3. A - B + C >> "A" "C"
     * 4. A + B + site:ifeng.com >> "A" "B" site:ifeng.com
     *
     * @param origKey 原始词
     * @return
     */
    public static String convertSearchWord(String origKey) {
        StringBuilder searchKey = new StringBuilder();

        String[] split = origKey.replace("-", "+-").split("\\+");
        for (String key : split) {
            key = StringUtils.strip(key);
            // 去除带有-号的词
            if (key.contains("-") || StringUtils.isBlank(key)) {
                continue;
            }
            if (key.contains("site:")) {
                searchKey.append(key);
                continue;
            }
            searchKey.append("\"").append(key).append("\"").append(" ");
        }
        return searchKey.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(UMCommonUtil.convertSearchWord("A +c+site:ifeng.com"));
    }
}
