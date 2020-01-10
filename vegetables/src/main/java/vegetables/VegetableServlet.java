package vegetables;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VegetableServlet extends HttpServlet {
	
	// Lifecycle method: init(), service(), destroy()

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Reached VegetableServlet: " + req.getMethod());

		String textToLog = "";
		String textToWriteToResponse = "";
		
		resp.sendRedirect("http://location.com/somewhere");
		
		String configFruit = getServletConfig().getInitParameter("fruit");
		String contextVegetable = (String) getServletContext().getInitParameter("vegetable");
		
		System.out.println(configFruit + " " + contextVegetable);

		System.out.println(textToLog);
		resp.getWriter().write(textToWriteToResponse);
		
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(req, resp);
		
//		Boolean authenticated = customAuthenticateMethod();
//		
//		if (authenticated) {
//			// authentication here.... req.authenticate()
//			resp.sendRedirect("http://localhost:8888/manager");
//		} else {
//			error stuff
//			throw new CustomerFailedAuth;
//		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		if (req.getMethod() == "PATCH") {
			// handle PATCH here
		} else {
			super.service(req, resp);
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("VegetableServlet destroy()");
		super.destroy();
	}
	
}
