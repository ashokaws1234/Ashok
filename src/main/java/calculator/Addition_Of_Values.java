package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ADD")
public class Addition_Of_Values implements Servlet{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		System.out.println("Hello i am service method u have to write logics inside me");
//		System.out.println("The Sum Of "+num1+" and "+num2+" is "+(num1+num2));
		res.getWriter().print("<html> <body> <h1 style='color:red'>The Sum Of "+num1+" and "+num2+" is "+(num1+num2)+"</h1> </body> </html>");
	//res.getWriter().print(); this method is used to print the output in the browser i.e frontend
		
	}

}