package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banklogic.APILayer;
import utility.CustomException;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
 
    public void init(ServletConfig config)throws ServletException
    {
    	APILayer callAPI=new APILayer(true);
    	config.getServletContext().setAttribute("APILayer", callAPI);
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
		String userId=request.getParameter("UserID");
		String password=request.getParameter("password");
		if(userId.equals("1") && password.equals("1"))
		{
			
		APILayer callAPI=(APILayer) request.getServletContext().getAttribute("APILayer");
			
			try 
			{
			request.setAttribute("accDetailsMap",callAPI.readAccDetails());
			request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
			}
			catch (CustomException e) 
			{
				
				e.printStackTrace();
			}
		}
		else
		{
			request.getRequestDispatcher("CustomerHome.jsp").forward(request, response);
		}
		
	}

}
