package services;

import java.util.ArrayList;
import java.util.List;

import dao.ComicDao;
import models.Comic;

public class ComicService {

	private ComicDao comicDao;
	
	// dependency injection pattern
	public ComicService(ComicDao comicDao) {
		this.comicDao = comicDao;
	}

	public Comic get(int id) {
		return null;
	}
	
	public void update(Comic dao) {
		
	}
	
	public void save(Comic comic) {
		
	}
	
	public List<Comic> getAll() {
		List<Comic> comics = new ArrayList<Comic>();
//		comics.add()
		return comics;
	}
}
