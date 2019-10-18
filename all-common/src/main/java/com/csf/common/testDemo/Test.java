package com.csf.common.testDemo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author orangeC
 * @date 2019/10/14 20:09
 * @desc
 */
public class Test {

    private static final String SEARCHURL = "http://weixin.sogou.com/weixin?";
    private static final String USIP = "usip=";
    private static final String QUERY = "&query=";
    private static final String TSN = "&tsn=";
    private static final String FT = "&ft=";
    private static final String ET = "&et=";
    private static final String INTERATION = "&interation=";
    private static final String TYPE = "&type=";
    private static final String WXID = "&wxid=";

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.getSearchUrl("来","fci0630","hdsjhdfh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> getSearchUrl(String keyword, String usip, String wxid) throws Exception {
        List<String> list = new ArrayList<>();
        packSearchUrl(usip, keyword, list, wxid, 0, -7);
        packSearchUrl(usip, keyword, list, wxid, -8, -15);
        packSearchUrl(usip, keyword, list, wxid, -16, -23);
        packSearchUrl(usip, keyword, list, wxid, -24, -31);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        return list;
    }

    public void packSearchUrl(String usip, String keyword, List<String> list, String wxid, int startDateNum, int endDateNum) throws UnsupportedEncodingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        StringBuilder sb = new StringBuilder(SEARCHURL);
        sb.append(USIP).append(usip == null ? "" : usip);
        // 查询关键词
        sb.append(QUERY).append(URLEncoder.encode(UMCommonUtil.convertSearchWord(keyword), "utf8"));
        // ""为全部时间，1为一天内；2为一周内；3为一月内；4为一年内；5为自定义（需要参数ft和et）
        sb.append(TSN).append("5");
        // 获取一个月内分四个周期的数据
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, startDateNum);
        String periodStart = simpleDateFormat.format(calendar.getTime());
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, endDateNum);
        String periodEnd = simpleDateFormat.format(calendar.getTime());
        sb.append(FT).append(periodEnd);
        sb.append(ET).append(periodStart);
        //搜索图集，视频选项
        sb.append(INTERATION);
        // 搜索类型 2为搜文章；1为搜公众号
        sb.append(TYPE).append("2");
        //指定公众号内搜索
        sb.append(WXID).append(wxid);
        list.add(sb.toString());
    }
}
