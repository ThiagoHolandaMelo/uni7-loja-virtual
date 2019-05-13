package br.com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BeanServlet
 */
@WebServlet("/BeanServlet")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @EJB
    SessionBean sessionBean;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Entrando no metodo doGet");
		
		PrintWriter out = response.getWriter();
		
		out.println(sessionBean.MetodoSessionBean());
		
		System.out.println("Saindo do metodo doGet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
