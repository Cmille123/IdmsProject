package com.tianying.idms.utils;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 *
 * @author: poker face
 * @date: 2018/6/14 0014 9:44
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class PageUtil {
    /**
     * 每页数据行数
     */
    private static final int PAGESIZE=2;

    /**
     * 获取总页数
     * @param list 数据集合
     * @return 总页数
     */
    public static int getPageCount(List list){
        int pageSize = PAGESIZE;
        int dataCount = list.size();
        return dataCount % pageSize == 0 ? dataCount / pageSize : dataCount / pageSize + 1;
    }

    /**
     * 获取某页的所有数据
     * @param page 页面
     * @param list 数据集合
     * @return page页所有数据
     */
    public static List getPageContext(int page,List<Object> list){
        List<Object> pageContext = new ArrayList<Object>();
        int pageSize = PAGESIZE;
        int dataCount = list.size();
        int pageCount = dataCount % pageSize == 0 ? dataCount / pageSize : dataCount / pageSize + 1;
        int startCount = (page-1)*pageSize+1;
        if(0<page && page<=pageCount) {
            if (dataCount <= pageSize) {
                pageContext = list;
            } else {
                for(int i=0;i<pageSize;i++,startCount++){
                    if(startCount<=dataCount){
                        pageContext.add(list.get(startCount-1));
                    }else {
                        break;
                    }
                }
            }
        }
        return pageContext;
    }
}
