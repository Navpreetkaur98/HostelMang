/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserModel;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

   
   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
        try{
        UserModel user=new UserModel();
        user.setUid(request.getParameter("uname"));
        user.setPassword(request.getParameter("psw"));
        user=loginDAO.checkInfo(user);
      
		 PrintWriter out=response.getWriter();
		 if(user!=null&&user.getUser_type().equalsIgnoreCase("admin")) {
			//request.getRequestDispatcher("dashboard.html").include(request, response);
			 response.sendRedirect("admin1.html");
		 }
		 else if(user!=null&&user.getUser_type().equalsIgnoreCase("user")) {
			 	
                         response.sendRedirect("index.html");
		 }
		 else {
			 out.print("You are not registered");
		 }
	}
    catch(Exception e)
    {
        e.printStackTrace();
    }
response.setContentType("text/html");
}
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    doGet(request,response);
   }
}
   
