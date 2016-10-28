package com.industrial.subway.util;
		import java.io.*;
		import java.util.*;
		import java.net.*;

		import org.json.simple.*;
		import org.json.simple.parser.JSONParser;
		import org.json.simple.parser.ParseException;


public class Request
{
	private StringBuffer data = null;
	private String[] result = null;
	private String[] kwargs = null;
	private InputStreamReader isr = null;
	private JSONParser parser = null;
	private JSONObject obj = null;
	private JSONArray arr = null;
	private JSONArray Station_Info = null;
	private String key = null;

	public Request() {}

	public Request(String key, String src, String dst, String[] kwargs)
	{
		data = new StringBuffer();
		this.kwargs = kwargs;
		result = new String[kwargs.length];
		this.key = key;
		try{
			src = URLEncoder.encode(src,"utf-8");
			dst = URLEncoder.encode(dst,"utf-8");
			String url = "http://swopenAPI.seoul.go.kr/api/subway/"+this.key+"/json"+"/shortestRoute/0/5/"+src+"/"+dst;
			URL request = new URL(url);
			URLConnection conn = request.openConnection();
			InputStream is = conn.getInputStream();
			this.isr = new InputStreamReader(is,"utf-8");

			this.parser = new JSONParser();
			String path = "/Users/sorlti6952/Subway/app/src/main/java/com/industrial/subway/util/info.json";
			this.Station_Info = (JSONArray)parser.parse(new FileReader(path));
		}
		catch(ParseException err)
		{
			System.err.println(err);
			System.err.println("Parser 생성 오류");
		}
		catch(MalformedURLException err)
		{
			System.err.println(err);
			System.err.println("유효하지 않은 url");
		} catch(UnknownServiceException err)
		{
			System.err.println(err);
			System.err.println("Thread로 구현하세요");
		} catch(IOException err)
		{
			System.err.println(err);
			System.err.println("connection 오류");
		}
	}

	public void Update(String src, String dst)
	{
		try{
			src = URLEncoder.encode(src,"utf-8");
			dst = URLEncoder.encode(dst,"utf-8");
			String url = "http://swopenAPI.seoul.go.kr/api/subway/" + this.key + "/json" + "/shortestRoute/0/5/" + src + "/" + dst;
			URL request = new URL(url);
			URLConnection conn = request.openConnection();
			InputStream is = conn.getInputStream();
			this.isr = new InputStreamReader(is,"utf-8");
		}
		catch(MalformedURLException err)
		{
			System.err.println(err);
			System.err.println("유효하지 않은 url");
		}
		catch(IOException err)
		{
			System.err.println(err);
			System.err.println("connection 오류");
		}
		this.Read();
		this.Json();
	}

	public void Read()
	{
		try{
			int c;
			while((c = isr.read()) != -1)
			{
				this.data.append((char)c);
				if(!isr.ready()){
					break;
				}
			}
			isr.close();
		}
		catch(IOException err)
		{
			System.err.println(err);
			System.err.println("Read() 오류");
		}
	}

	public void Json(){
		try{
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(data.toString());
			JSONArray arr = (JSONArray)obj.get("shortestRouteList");
			obj = (JSONObject)arr.get(0);
			for(int i=0; i<kwargs.length; i++)
			{
				result[i] = (String)obj.get(kwargs[i]);
			}
		}
		catch(ParseException err)
		{
			System.err.println(err);
			System.err.println("Parser 생성 오류");
		}
		catch(IndexOutOfBoundsException err)
		{
			System.err.println(err);
			System.err.println("JSONArray.get() 오류");
		}
	}

	public String[] GetResult(){
		return this.result;
	}

	public ArrayList<JSONObject> Search(String search){
		ArrayList<JSONObject> list = new ArrayList<JSONObject>();
		for(int i = 0; i < this.Station_Info.size(); i++)
		{
			JSONObject obj = (JSONObject)this.Station_Info.get(i);
			boolean found = InitialSearch.matchString(obj.get("STATION_NM").toString(), search);
			if(found == true){
				list.add(obj);
			}
		}
		return list;
	}
}
