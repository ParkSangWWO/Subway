package com.industrial.subway.network;
//
//	ErrorMessage.java
//
//	Create by 박상우 on 1/11/2016
//	Copyright © 2016 박상우. All rights reserved.
//	Model file Generated using:
//	Vin.Favara's JSONExportV https://github.com/vivi7/JSONExport
//	(forked from Ahmed-Ali's JSONExport)
//



public class ErrorMessage{

    private String code;
    private String developerMessage;
    private String link;
    private String message;
    private int status;
    private int total;

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setDeveloperMessage(String developerMessage){
        this.developerMessage = developerMessage;
    }
    public String getDeveloperMessage(){
        return this.developerMessage;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return this.link;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }

    /**
     * Creates instance using the passed realm and jsonObject to set the properties values
     */
    /**
     * Returns all the available property values in the form of JSONObject instance where the key is the approperiate json key and the value is the value of the corresponding field
     */
}