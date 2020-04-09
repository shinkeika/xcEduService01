package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 10:04.
 * @Modified By:
 */
@Data
@ToString
public class CmsPageParam {
   //参数名称
    private String pageParamName;
    //参数值
    private String pageParamValue;

    public void setPageParamValue(String pageParamValue) {
        this.pageParamValue = pageParamValue;
    }

    public void setPageParamName(String pageParamName) {
        this.pageParamName = pageParamName;
    }

    public String getPageParamName() {
        return pageParamName;
    }

    public String getPageParamValue() {
        return pageParamValue;
    }
}
