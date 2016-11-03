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

import java.io.Serializable;

public class ErrorMessage implements Serializable
{
    private String total;

    private String message;

    private String status;

    private String developerMessage;

    private String link;

    private String code;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getDeveloperMessage ()
    {
        return developerMessage;
    }

    public void setDeveloperMessage (String developerMessage)
    {
        this.developerMessage = developerMessage;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", message = "+message+", status = "+status+", developerMessage = "+developerMessage+", link = "+link+", code = "+code+"]";
    }
}