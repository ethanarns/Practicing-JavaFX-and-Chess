package us.pecon.ray.chessPlay;

/**
 * The master class for chess pieces to be added to the board class. It cannot
 * be constructed, but is merely a reference for all the subclass methods and
 * properties
 * 
 * @author Ethan Arns
 */
public abstract class Piece {

	protected String color;
	protected Position position;
	
	/**
	 * Constructor by coordinates
	 * 
	 * @param color   color of piece
	 * @param xPos    x coordinate
	 * @param yPos    y coordinate
	 */
	public Piece(String color, int xPos, int yPos){
		this.color = color;
		this.position = new Position(xPos, yPos);
	}
	
	/**
	 * Constructor by position class
	 * 
	 * @param color      color of piece
	 * @param position   position object to set initial position
	 */
	public Piece(String color, Position position){
		this.color = color;
		this.position = position;
	}
	
	/**
	 * Constructor without position parameters, semi-dangerous
	 * 
	 * @param color   color of piece constructed
	 */
	public Piece(String color){
		this.color = color;
	}
	
	/*
	 * Generic getters and setters
	 */
	
	public String getColor(){
		return color;
	}
	public Position getPosition(){
		return this.position;
	}
	public int getXpos(){
		return this.position.getXpos();
	}
	public int getYpos(){
		return this.position.getYpos();
	}
	public void setPosition(Position pos){
		this.position = pos;
	}
	public void setPosition(int x, int y){
		this.position.setXpos(x);
		this.position.setYpos(y);
	}
	
	public String toString(){
		return color + " " + this.getClass().getSimpleName() + " at (" + position.getXpos() + ", " + position.getYpos() + ")";
	}
	
	/**
	 * Used to print out a symbol representing the piece on the ASCII board.
	 * Should never appear.
	 * 
	 * @return string symbol to represent piece
	 */
	public String symbol(){
		return "?";
	}
}
