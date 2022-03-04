package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.CustomerInfo;
import banklogic.APILayer;
import utility.CustomException;

/**
 * Servlet implementation class AddCustomer
 */
@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomer() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		Long mobileNo=Long.parseLong(request.getParameter("mobilenumber"));
		APILayer callAPI=(APILayer) request.getServletContext().getAttribute("APILayer");
		CustomerInfo customerInfo=new CustomerInfo();
		customerInfo.setName(name);
		customerInfo.setAddress(address);
		customerInfo.setMobileNo(mobileNo);
	    try 
	    {
			callAPI.addCusInfo(customerInfo);
			request.getRequestDispatcher("Customer").forward(request, response);
		} 
	    catch (CustomException e) 
	    {
			
			e.printStackTrace();
		}
	}

}
