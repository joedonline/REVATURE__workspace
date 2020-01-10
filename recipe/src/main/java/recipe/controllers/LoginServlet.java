package recipe.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.fasterxml.jackson.databind.ObjectMapper;

import recipe.model.Auth;
import recipe.model.Recipe;

public class LoginServlet extends HttpServlet {

	private static ObjectMapper om = new ObjectMapper();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Reached GET LoginServlet: " + req.getMethod());

		Auth auth = new Auth();

		auth.setUsername("MickeyMouse");
		auth.setPassword("World###");
		
//		Auth authReadVal = om.readValue(req.getReader(), auth.getClass());
//		System.out.println("[authReadVal]: " + authReadVal);
		
		String creds = "{ " + "\"username\": \"" + auth.getUsername() + "\", " + "\"password\": \"" + auth.getPassword() + "\" }";
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		System.out.println(resp.getStatus());
		System.out.println(resp.getLocale());
		
//		out.print(creds);
		out.write(creds);
//		out.println(creds);

	}

}
