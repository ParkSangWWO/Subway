package com.industrial.subway.network;
////
//	RootClass.java
//
//	Create by 박상우 on 1/11/2016
//	Copyright © 2016 박상우. All rights reserved.
//	Model file Generated using:
//	Vin.Favara's JSONExportV https://github.com/vivi7/JSONExport
//	(forked from Ahmed-Ali's JSONExport)
//

import org.json.*;

import java.io.Serializable;



public class RootClass implements Serializable{

    private ErrorMessage errorMessage;
    private Object message_info_ok;
    private ShortestRouteList shortestRouteList;

    public void setErrorMessage(ErrorMessage errorMessage){
        this.errorMessage = errorMessage;
    }
    public ErrorMessage getErrorMessage(){
        return this.errorMessage;
    }
    public void setMessageInfoOk(Object messageInfoOk){
        this.message_info_ok = messageInfoOk;
    }
    public Object getMessageInfoOk(){
        return this.message_info_ok;
    }
    public void setShortestRouteList(ShortestRouteList shortestRouteList){
        this.shortestRouteList = shortestRouteList;
    }
    public ShortestRouteList getShortestRouteList(){
        return this.shortestRouteList;
    }
}