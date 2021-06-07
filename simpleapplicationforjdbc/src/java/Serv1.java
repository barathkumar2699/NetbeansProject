/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Barath
 */
@WebServlet(urlPatterns = {"/Serv1"})
public class Serv1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    /*protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        
        try  {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/db1", "root", "root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from login");
            while(rs.next())
            /* TODO output your page here. You may use following sample code. */
       /*     out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Serv1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Serv1 at "+" login Successsfull"+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            
        }
    }*/
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
   // protected void doGet(HttpServletRequest request, HttpServletResponse response)
     //       throws ServletException, IOException {
//     //   processRequest(request, response);
    //}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        try
        {
            String u,p;
            u=request.getParameter("user1");
            p=request.getParameter("pass1");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/ooad", "ba","ba");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from login where user1='"+u+"'");
            int f=0;
            while(rs.next())
            {
                
                if(rs.getString(1).equals(u)&&rs.getString(2).equals(p))
                {
                    f=1;
                    //System.out.println("success");
                    out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Serv1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Serv1 at " + "Sucess" + "</h1>");
            out.println("</body>");
            out.println("</html>");
            HttpSession session=request.getSession();
            session.setAttribute("ses_obj", u);
            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
            rd.forward(request,response);
                }
            }
            if(f!=1)
            {
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Serv1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Serv1 at " + "failiure" + "</h1>");
            out.println("</body>");
            out.println("</html>");
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
