package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.ComicDaoPostgres;
import models.Comic;
import services.ComicService;

@WebServlet(name = "FrontController", urlPatterns = "/api/*")
public class FrontController extends HttpServlet {
	
	private ComicService comicService;
	private ObjectMapper om;
	
	@Override
	public void init() throws ServletException {
		this.comicService = new ComicService(new ComicDaoPostgres());
		this.om = new ObjectMapper();
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[URI] " + req.getRequestURI());
		
		String[] tokens = req.getRequestURI().split("/");
		System.out.println("[tokens] " + tokens);
		
		// this gives you /comic endpoint for the front end to send requests to
		if (tokens[3].equals("comics")) {
			if (tokens.length > 4) {
				Integer id = Integer.valueOf(tokens[4]);
				Comic comic = comicService.get(id);
				
				if (comic == null) {
					resp.sendRedirect("https://hostgator.com/somerandompage");
					// resp.setStatus(404);
					// resp.sendError(404, "Comic not found");
				}
				
				// separate this eventually
				resp.getWriter().write(om.writeValueAsString(comic));
			}
			
			List<Comic> comics = comicService.getAll();
			resp.getWriter().write(om.writeValueAsString(comics)); // returns json to the front end
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[URI] " + req.getRequestURI());
		String[] tokens = req.getRequestURI().split("/");
		
		switch (tokens[3]) {
		case "comics" : 
			Comic receivedComic = om.readValue(req.getReader(), Comic.class);
			System.out.println("[receivedComic] " + receivedComic);
			comicService.save(receivedComic);
			break;
		}
	}
	
}
