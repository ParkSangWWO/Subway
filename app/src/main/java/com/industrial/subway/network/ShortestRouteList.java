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


public class ShortestRouteList implements Serializable{

    private Object beginRow;
    private Object curPage;
    private Object endRow;
    private String minStatnCnt;//
    private String minStatnId;
    private String minStatnNm;//
    private String minStatnXy;
    private String minTransferCnt;//
    private String minTransferMsg;
    private String minTravelMsg;
    private String minTravelTm;//
    private Object pageRow;
    private int rowNum;
    private int selectedCount;
    private String shtStatnCnt;//
    private String shtStatnId;
    private String shtStatnNm;//
    private String shtStatnXy;
    private String shtTransferCnt;//
    private String shtTransferMsg;
    private String shtTravelMsg;
    private String shtTravelTm;//
    private String statnFid;
    private String statnFnm;
    private String statnTid;
    private String statnTnm;
    private int totalCount;

    public void setBeginRow(Object beginRow){
        this.beginRow = beginRow;
    }
    public Object getBeginRow(){
        return this.beginRow;
    }
    public void setCurPage(Object curPage){
        this.curPage = curPage;
    }
    public Object getCurPage(){
        return this.curPage;
    }
    public void setEndRow(Object endRow){
        this.endRow = endRow;
    }
    public Object getEndRow(){
        return this.endRow;
    }
    public void setMinStatnCnt(String minStatnCnt){
        this.minStatnCnt = minStatnCnt;
    }
    public String getMinStatnCnt(){
        return this.minStatnCnt;
    }
    public void setMinStatnId(String minStatnId){
        this.minStatnId = minStatnId;
    }
    public String getMinStatnId(){
        return this.minStatnId;
    }
    public void setMinStatnNm(String minStatnNm){
        this.minStatnNm = minStatnNm;
    }
    public String getMinStatnNm(){
        return this.minStatnNm;
    }
    public void setMinStatnXy(String minStatnXy){
        this.minStatnXy = minStatnXy;
    }
    public String getMinStatnXy(){
        return this.minStatnXy;
    }
    public void setMinTransferCnt(String minTransferCnt){
        this.minTransferCnt = minTransferCnt;
    }
    public String getMinTransferCnt(){
        return this.minTransferCnt;
    }
    public void setMinTransferMsg(String minTransferMsg){
        this.minTransferMsg = minTransferMsg;
    }
    public String getMinTransferMsg(){
        return this.minTransferMsg;
    }
    public void setMinTravelMsg(String minTravelMsg){
        this.minTravelMsg = minTravelMsg;
    }
    public String getMinTravelMsg(){
        return this.minTravelMsg;
    }
    public void setMinTravelTm(String minTravelTm){
        this.minTravelTm = minTravelTm;
    }
    public String getMinTravelTm(){
        return this.minTravelTm;
    }
    public void setPageRow(Object pageRow){
        this.pageRow = pageRow;
    }
    public Object getPageRow(){
        return this.pageRow;
    }
    public void setRowNum(int rowNum){
        this.rowNum = rowNum;
    }
    public int getRowNum(){
        return this.rowNum;
    }
    public void setSelectedCount(int selectedCount){
        this.selectedCount = selectedCount;
    }
    public int getSelectedCount(){
        return this.selectedCount;
    }
    public void setShtStatnCnt(String shtStatnCnt){
        this.shtStatnCnt = shtStatnCnt;
    }
    public String getShtStatnCnt(){
        return this.shtStatnCnt;
    }
    public void setShtStatnId(String shtStatnId){
        this.shtStatnId = shtStatnId;
    }
    public String getShtStatnId(){
        return this.shtStatnId;
    }
    public void setShtStatnNm(String shtStatnNm){
        this.shtStatnNm = shtStatnNm;
    }
    public String getShtStatnNm(){
        return this.shtStatnNm;
    }
    public void setShtStatnXy(String shtStatnXy){
        this.shtStatnXy = shtStatnXy;
    }
    public String getShtStatnXy(){
        return this.shtStatnXy;
    }
    public void setShtTransferCnt(String shtTransferCnt){
        this.shtTransferCnt = shtTransferCnt;
    }
    public String getShtTransferCnt(){
        return this.shtTransferCnt;
    }
    public void setShtTransferMsg(String shtTransferMsg){
        this.shtTransferMsg = shtTransferMsg;
    }
    public String getShtTransferMsg(){
        return this.shtTransferMsg;
    }
    public void setShtTravelMsg(String shtTravelMsg){
        this.shtTravelMsg = shtTravelMsg;
    }
    public String getShtTravelMsg(){
        return this.shtTravelMsg;
    }
    public void setShtTravelTm(String shtTravelTm){
        this.shtTravelTm = shtTravelTm;
    }
    public String getShtTravelTm(){
        return this.shtTravelTm;
    }
    public void setStatnFid(String statnFid){
        this.statnFid = statnFid;
    }
    public String getStatnFid(){
        return this.statnFid;
    }
    public void setStatnFnm(String statnFnm){
        this.statnFnm = statnFnm;
    }
    public String getStatnFnm(){
        return this.statnFnm;
    }
    public void setStatnTid(String statnTid){
        this.statnTid = statnTid;
    }
    public String getStatnTid(){
        return this.statnTid;
    }
    public void setStatnTnm(String statnTnm){
        this.statnTnm = statnTnm;
    }
    public String getStatnTnm(){
        return this.statnTnm;
    }
    public void setTotalCount(int totalCount){
        this.totalCount = totalCount;
    }
    public int getTotalCount(){
        return this.totalCount;
    }

    /**
     * Creates instance using the passed realm and jsonObject to set the properties values
     */
}