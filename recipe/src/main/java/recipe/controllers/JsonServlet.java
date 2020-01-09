package recipe.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import recipe.model.Recipe;

public class JsonServlet extends HttpServlet {

	private static ObjectMapper om = new ObjectMapper();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Reached POST JsonServlet");
//		System.out.println(req.getHeader("Content-Type"));
		Recipe recipeFromReq = om.readValue(req.getReader(), Recipe.class);
		System.out.println("Received Recipe: " + recipeFromReq);
		
		Recipe demoRecipe = new Recipe();
		demoRecipe.setName("Demo");
		demoRecipe.setDirections("Do the demo, stuff...yeah, map the JSON");
		demoRecipe.setServes(5);
		
		resp.getWriter().write(
			om.writeValueAsString(demoRecipe));
	}
	
}
