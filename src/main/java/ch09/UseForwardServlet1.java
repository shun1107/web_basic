package ch09;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
 	throws ServletException, IOException {
 
 		System.out.println("サーブレットの実行");
 
 		//フォワード先の指定
 		RequestDispatcher dispatcher =	request.getRequestDispatcher("ch09/useForward.jsp");
 
 		//フォワードの実行
 		dispatcher.forward(request, response);
 
 		System.out.println("サーブレットの終了");
 	}
 }