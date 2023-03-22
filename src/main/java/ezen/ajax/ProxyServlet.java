package ezen.ajax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection; //브라우저 대체역할
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

@WebServlet("/albums")
public class ProxyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//서블릿에서 Open API 사용
//		URL url = new URL("https://jsonplaceholder.typicode.com/albums");
		URL url = new URL("https://yts.torrentbay.to/api/v2/list_movies.json");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection(); //브라우저라고생각하자
		connection.setRequestMethod("GET"); //요청방식 post,put,delete 다가능
		connection.setConnectTimeout(5000); //5초동안연락안오면끊어짐
		
		BufferedReader in = null;
		StringBuilder sb = new StringBuilder();		
		int status = connection.getResponseCode();
		String text = null;
		if(status >= 300) { //200번대는 성공,300이후부터는 에러
			in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
			while((text=in.readLine()) != null) {
				sb.append(text);				
			}			
		}else { //데이터수신성공했을때
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			while((text=in.readLine()) != null) {
				sb.append(text);				
			}
		}
		in.close();
//		System.out.println(sb.toString());
		out.print(sb.toString());
	}
}


