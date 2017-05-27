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
		if (this.direction.equals("N")) this.direction = "W";
		else if (this.direction.equals("W")) this.direction = "S";
		else if (this.direction.equals("S")) this.direction = "E";
		else if (this.direction.equals("E")) this.direction = "N";
	}

	protected void rotateRight() {
		if (this.direction.equals("N")) this.direction = "E";
		else if (this.direction.equals("E")) this.direction = "S";
		else if (this.direction.equals("S")) this.direction = "W";
		else if (this.direction.equals("W")) this.direction = "N";
	}

	protected void move() {
		if (this.direction.equals("N")) this.y++;
		else if (this.direction.equals("S")) this.y--;
		else if (this.direction.equals("E")) this.x++;
		else if (this.direction.equals("W")) this.x--;
		
		if (this.y > 5) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion north");
		if (this.y < 0) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion south");
		if (this.x > 5) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion east");
		if (this.x < 0) throw new RobotOutOfBoundsException("Robot moved out of bounds in diretion west");
		
	}

	public void sendCommand(String command) {
		if (command.equals("M")) this.move();
		else if (command.equals("L")) this.rotateLeft();
		else if (command.equals("R")) this.rotateRight();
		else throw new InvalidCommandException(String.format("Invalid command %s for the robot", command));
	}

}
