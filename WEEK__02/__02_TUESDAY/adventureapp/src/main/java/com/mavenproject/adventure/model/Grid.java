package com.mavenproject.adventure.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mavenproject.adventure.exceptions.RoomNotFound;
import com.revature.adventureapp.Room;

public class Grid {

	/**
	 * A map that maps coordinates to rooms
	 */
	Map<Point, Room> coordinateRegistry;
	
	public Room get(int x, int y) throws RoomNotFound {
		Room room = coordinateRegistry.get(new Point(x, y));
		if (room == null) {
			throw new RoomNotFound();
		} else {
			return room;
		}
	}
	
	public Room get(Point p) throws RoomNotFound {
		Room room = coordinateRegistry.get(new Point(p));
		if (room == null) {
			throw new RoomNotFound();
		} else {
			return room;
		}
	}
	
	/**
	 * Add room to the grid,
	 * @param room
	 * @param x
	 * @param y
	 */
	public void add(Room room, int x, int y) {
		coordinateRegistry.put(new Point(x, y), room);
	}
	
}
