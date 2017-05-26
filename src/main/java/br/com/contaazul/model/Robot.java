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
	
	protected int getX() {
		return this.x;
	}

	protected int getY() {
		return this.y;
	}

	protected String getDirection() {
		return this.direction;
	}

	public String getPosition() {
		return String.format("(%d, %d, %s)", this.x, this.y, this.direction);
	}

	protected void rotateLeft() {
		if (this.direction == "N") this.direction = "W";
		else if (this.direction == "W") this.direction = "S";
		else if (this.direction == "S") this.direction = "E";
		else if (this.direction == "E") this.direction = "N";
	}

	protected void rotateRight() {
		if (this.direction == "N") this.direction = "E";
		else if (this.direction == "E") this.direction = "S";
		else if (this.direction == "S") this.direction = "W";
		else if (this.direction == "W") this.direction = "N";
	}

	protected void move() {
		if (this.direction == "N") this.y++;
		else if (this.direction == "S") this.y--;
		else if (this.direction == "E") this.x++;
		else if (this.direction == "W") this.x--;
		
		if (this.y > 5) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion north");
		if (this.y < 0) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion south");
		if (this.x > 5) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion east");
		if (this.x < 0) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion west");
		
	}

	public void sendCommand(String command) {
		if (command == "M") this.move();
		else if (command == "L") this.rotateLeft();
		else if (command == "R") this.rotateRight();
		else throw new InvalidCommandException("Invalid command for the robot");
	}

}
