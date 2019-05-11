import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDataServlet
 */
public class RegistrationController extends HttpServlet {

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String fname = request.getParameter("fname");
  String lname = request.getParameter("lname");
  String place = request.getParameter("place");
  String cgory = request.getParameter("cgory");
  String email = request.getParameter("email");
  String address = request.getParameter("address");
 
  // validate given input
  if (fname.isEmpty() ||lname.isEmpty()||place.isEmpty() || cgory.isEmpty() || email.isEmpty() || address.isEmpty()) {
   RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
   out.println("<font color=red>Please fill all the fields</font>");
   rd.include(request, response);
  } else {
   // inserting data into mysql database 
   // create a test database and student table before running this to create table
   //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
   try {
    Class.forName("com.mysql.jdbc.Driver");
    // loads mysql driver

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", ""); 

    String query = "insert into student values(?,?,?,?,?,?)";

    PreparedStatement ps = con.prepareStatement(query); // generates sql query

    ps.setString(1, fname);
    ps.setString(2, lname);
    ps.setString(3, place);
    ps.setString(4, cgory);
    ps.setString(5, email);
    ps.setString(6, address);
 
    ps.executeUpdate(); // execute it on test database
    System.out.println("successfuly inserted");
    ps.close();
    con.close();
   } catch (ClassNotFoundException | SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
   rd.forward(request, response);
  }
 }
}