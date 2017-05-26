package br.com.contaazul.model;

public class Robot {

	private int x;
	private int y;
	private String direction;
	
	public Robot() {
		this.x = 0;
		this.y = 0;
		this.direction = "N";
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public String getDirection() {
		return this.direction;
	}

	public String getPosition() {
		return String.format("(%d, %d, %s)", this.x, this.y, this.direction);
	}

}
