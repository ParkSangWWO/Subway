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



public class RootClass implements Serializable {
    private ErrorMessage errorMessage;

    private ShortestRouteList[] shortestRouteList;

    private String message_info_ok;

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ShortestRouteList[] getShortestRouteList() {
        return shortestRouteList;
    }

    public void setShortestRouteList(ShortestRouteList[] shortestRouteList) {
        this.shortestRouteList = shortestRouteList;
    }

    public String getMessage_info_ok() {
        return message_info_ok;
    }

    public void setMessage_info_ok(String message_info_ok) {
        this.message_info_ok = message_info_ok;
    }

    @Override
    public String toString() {
        return "ClassPojo [errorMessage = " + errorMessage + ", shortestRouteList = " + shortestRouteList + ", message_info_ok = " + message_info_ok + "]";
    }
}