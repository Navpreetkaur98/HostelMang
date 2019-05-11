/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ProfileModel;

/**
 *
 * @author SONY
 */
public class profile extends HttpServlet {
 public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
       
     {
         try {
        ProfileModel obj=new ProfileModel();
       obj.setUid(request.getParameter("uid"));
         obj.setFirst_name(request.getParameter("fname"));
       obj.setLast_name(request.getParameter("lname"));
         obj.setEmail(request.getParameter("email"));
         obj.setFather_name(request.getParameter("name1"));
         obj.setMother_name(request.getParameter("name2"));
         obj.setBatch(request.getParameter("batch"));
        
        obj=ProfileOperation.showProfile(obj);
      
		 PrintWriter out=response.getWriter();
         }	
    catch(Exception e)
    {
        e.printStackTrace();
    }
response.setContentType("text/html");
     }
  HttpSession session=request.getSession();
  session.setAttribute(user,obj);
  response.sendRedirect("");
     
 }
}
 