package com.mavenproject.adventure.controllers;

import java.awt.Point;

import com.mavenproject.adventure.exceptions.RoomNotFound;
import com.mavenproject.adventure.model.Grid;


/**
 * 
 * @author Revature
 *
 */
public abstract class GridService {

	private Grid grid;
	private Point currentCoordinates;
	private RoomController roomController;
	
	public GridService(Grid grid, Point startingCoordinates, RoomController rc) {
		this.grid = grid;
		this.currentCoordinates = startingCoordinates;
		this.roomController = rc;
	}
	
	public void start() throws RoomNotFound {
		this.roomController.setRoom(this.grid.get(currentCoordinates));
	}
	
	public void adventureLoop() {
		while (true) {
			roomController.enter();
			// Working with a Grid in gridservice so we know it'll be a direction
			String direction = RoomController.acceptOptionFromUser();
			switch (direction) {
			case "NORTH":
				currentCoordinates.move(0, 1);
				break;
			case "SOUTH":
				currentCoordinates.move(0, -1);
				break;
			case "EAST":
				currentCoordinates.move(1, 0);
				break;
			case "WEST":
				currentCoordinates.move(-1, 0);
				break;
			default:
				throw new RoomNotFound();
				break;
			}
			
			roomController.setRoom(this.roomController);
		}
	}
	
}
