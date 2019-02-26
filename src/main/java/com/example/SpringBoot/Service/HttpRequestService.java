package com.example.SpringBoot.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpRequestService {
public HttpRequestService() {
	// TODO Auto-generated constructor stub
}

public HttpURLConnection createConn() {
	 // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
	HttpURLConnection connection = null;
	try {
		// 创建远程url连接对象
		URL url = new URL("http://www.google.com");
		connection = (HttpURLConnection) url.openConnection();
   
		// 设置连接主机服务器的超时时间：15000毫秒
		connection.setConnectTimeout(15000);
		// 设置读取远程返回的数据时间：60000毫秒
		connection.setReadTimeout(60000);
		// 发送请求
		
//		return connection;
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
}
public String doGet(HttpURLConnection conn){
	StringBuilder sb = new StringBuilder();
	
	 try {
		conn.setRequestMethod("GET");
		conn.connect();
		if(conn.getResponseCode() == 200) {
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
			
			String line = null;
			while((line= br.readLine())!=null) {
				sb.append(line+'\n');
			}
			is.close();
			br.close();
			
		}
		
	} catch (ProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		conn.disconnect();
	}
	 return sb.toString();
	
	
}

public String doPost() {
	return null;
}

}
