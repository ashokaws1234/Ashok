package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DIV")
public class Division extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		double num1=Double.parseDouble(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		System.out.println("Hello i am service method u have to write logics inside me");
//		System.out.println("The Division Of "+num1+" and "+num2+" is "+(num1*num2));
		res.getWriter().print("<html> <body> <h1 style='color:red'>The Division Of "+num1+" and "+num2+" is "+(num1/num2)+"</h1> </body> </html>");
	//res.getWriter().print(); this method is used to print the output in the browser i.e frontend
		
	}

}
