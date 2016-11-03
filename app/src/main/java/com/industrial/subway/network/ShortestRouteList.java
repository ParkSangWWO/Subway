package com.industrial.subway.network;
//
//	ShortestRouteList.java
//
//	Create by 박상우 on 1/11/2016
//	Copyright © 2016 박상우. All rights reserved.
//	Model file Generated using:
//	Vin.Favara's JSONExportV https://github.com/vivi7/JSONExport
//	(forked from Ahmed-Ali's JSONExport)
//

import org.json.*;

import java.io.Serializable;
public class ShortestRouteList implements Serializable
{
    private String statnFid;

    private String selectedCount;

    private String minStatnCnt;

    private String minStatnNm;

    private String minTransferCnt;

    private String statnTid;

    private String totalCount;

    private String curPage;

    private String shtTravelTm;

    private String statnTnm;

    private String shtTravelMsg;

    private String shtStatnCnt;

    private String minTransferMsg;

    private String statnFnm;

    private String beginRow;

    private String shtStatnNm;

    private String shtTransferMsg;

    private String minTravelMsg;

    private String endRow;

    private String minStatnXy;

    private String shtTransferCnt;

    private String minTravelTm;

    private String rowNum;

    private String shtStatnXy;

    private String pageRow;

    private String shtStatnId;

    private String minStatnId;

    public String getStatnFid ()
    {
        return statnFid;
    }

    public void setStatnFid (String statnFid)
    {
        this.statnFid = statnFid;
    }

    public String getSelectedCount ()
    {
        return selectedCount;
    }

    public void setSelectedCount (String selectedCount)
    {
        this.selectedCount = selectedCount;
    }

    public String getMinStatnCnt ()
    {
        return minStatnCnt;
    }

    public void setMinStatnCnt (String minStatnCnt)
    {
        this.minStatnCnt = minStatnCnt;
    }

    public String getMinStatnNm ()
    {
        return minStatnNm;
    }

    public void setMinStatnNm (String minStatnNm)
    {
        this.minStatnNm = minStatnNm;
    }

    public String getMinTransferCnt ()
    {
        return minTransferCnt;
    }

    public void setMinTransferCnt (String minTransferCnt)
    {
        this.minTransferCnt = minTransferCnt;
    }

    public String getStatnTid ()
    {
        return statnTid;
    }

    public void setStatnTid (String statnTid)
    {
        this.statnTid = statnTid;
    }

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
    }

    public String getCurPage ()
    {
        return curPage;
    }

    public void setCurPage (String curPage)
    {
        this.curPage = curPage;
    }

    public String getShtTravelTm ()
    {
        return shtTravelTm;
    }

    public void setShtTravelTm (String shtTravelTm)
    {
        this.shtTravelTm = shtTravelTm;
    }

    public String getStatnTnm ()
    {
        return statnTnm;
    }

    public void setStatnTnm (String statnTnm)
    {
        this.statnTnm = statnTnm;
    }

    public String getShtTravelMsg ()
    {
        return shtTravelMsg;
    }

    public void setShtTravelMsg (String shtTravelMsg)
    {
        this.shtTravelMsg = shtTravelMsg;
    }

    public String getShtStatnCnt ()
    {
        return shtStatnCnt;
    }

    public void setShtStatnCnt (String shtStatnCnt)
    {
        this.shtStatnCnt = shtStatnCnt;
    }

    public String getMinTransferMsg ()
    {
        return minTransferMsg;
    }

    public void setMinTransferMsg (String minTransferMsg)
    {
        this.minTransferMsg = minTransferMsg;
    }

    public String getStatnFnm ()
    {
        return statnFnm;
    }

    public void setStatnFnm (String statnFnm)
    {
        this.statnFnm = statnFnm;
    }

    public String getBeginRow ()
    {
        return beginRow;
    }

    public void setBeginRow (String beginRow)
    {
        this.beginRow = beginRow;
    }

    public String getShtStatnNm ()
    {
        return shtStatnNm;
    }

    public void setShtStatnNm (String shtStatnNm)
    {
        this.shtStatnNm = shtStatnNm;
    }

    public String getShtTransferMsg ()
    {
        return shtTransferMsg;
    }

    public void setShtTransferMsg (String shtTransferMsg)
    {
        this.shtTransferMsg = shtTransferMsg;
    }

    public String getMinTravelMsg ()
    {
        return minTravelMsg;
    }

    public void setMinTravelMsg (String minTravelMsg)
    {
        this.minTravelMsg = minTravelMsg;
    }

    public String getEndRow ()
    {
        return endRow;
    }

    public void setEndRow (String endRow)
    {
        this.endRow = endRow;
    }

    public String getMinStatnXy ()
    {
        return minStatnXy;
    }

    public void setMinStatnXy (String minStatnXy)
    {
        this.minStatnXy = minStatnXy;
    }

    public String getShtTransferCnt ()
    {
        return shtTransferCnt;
    }

    public void setShtTransferCnt (String shtTransferCnt)
    {
        this.shtTransferCnt = shtTransferCnt;
    }

    public String getMinTravelTm ()
    {
        return minTravelTm;
    }

    public void setMinTravelTm (String minTravelTm)
    {
        this.minTravelTm = minTravelTm;
    }

    public String getRowNum ()
    {
        return rowNum;
    }

    public void setRowNum (String rowNum)
    {
        this.rowNum = rowNum;
    }

    public String getShtStatnXy ()
    {
        return shtStatnXy;
    }

    public void setShtStatnXy (String shtStatnXy)
    {
        this.shtStatnXy = shtStatnXy;
    }

    public String getPageRow ()
    {
        return pageRow;
    }

    public void setPageRow (String pageRow)
    {
        this.pageRow = pageRow;
    }

    public String getShtStatnId ()
    {
        return shtStatnId;
    }

    public void setShtStatnId (String shtStatnId)
    {
        this.shtStatnId = shtStatnId;
    }

    public String getMinStatnId ()
    {
        return minStatnId;
    }

    public void setMinStatnId (String minStatnId)
    {
        this.minStatnId = minStatnId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [statnFid = "+statnFid+", selectedCount = "+selectedCount+", minStatnCnt = "+minStatnCnt+", minStatnNm = "+minStatnNm+", minTransferCnt = "+minTransferCnt+", statnTid = "+statnTid+", totalCount = "+totalCount+", curPage = "+curPage+", shtTravelTm = "+shtTravelTm+", statnTnm = "+statnTnm+", shtTravelMsg = "+shtTravelMsg+", shtStatnCnt = "+shtStatnCnt+", minTransferMsg = "+minTransferMsg+", statnFnm = "+statnFnm+", beginRow = "+beginRow+", shtStatnNm = "+shtStatnNm+", shtTransferMsg = "+shtTransferMsg+", minTravelMsg = "+minTravelMsg+", endRow = "+endRow+", minStatnXy = "+minStatnXy+", shtTransferCnt = "+shtTransferCnt+", minTravelTm = "+minTravelTm+", rowNum = "+rowNum+", shtStatnXy = "+shtStatnXy+", pageRow = "+pageRow+", shtStatnId = "+shtStatnId+", minStatnId = "+minStatnId+"]";
    }
}