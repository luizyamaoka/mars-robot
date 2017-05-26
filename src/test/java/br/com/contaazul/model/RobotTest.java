package br.com.contaazul.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class RobotTest {

	private Robot robot;
	
	@Before
	public void createRobot() {
		this.robot = new Robot();
	}
	
	@Test
	public void createOnZero() {
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 0, N)", this.robot.getPosition());
	}
	
	@Test
	public void rotateLeft() {
		this.robot.rotateLeft();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("W", this.robot.getDirection());
		assertEquals("(0, 0, W)", this.robot.getPosition());
	}
	
	@Test
	public void rotateLeftTwice() {
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("S", this.robot.getDirection());
		assertEquals("(0, 0, S)", this.robot.getPosition());
	}
	
	@Test
	public void rotateLeftThreeTimes() {
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("E", this.robot.getDirection());
		assertEquals("(0, 0, E)", this.robot.getPosition());
	}
	
	@Test
	public void rotateLeftFourTimes() {
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 0, N)", this.robot.getPosition());
	}
	
	@Test
	public void rotateRight() {
		this.robot.rotateRight();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("E", this.robot.getDirection());
		assertEquals("(0, 0, E)", this.robot.getPosition());
	}
	
	@Test
	public void rotateRightTwice() {
		this.robot.rotateRight();
		this.robot.rotateRight();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("S", this.robot.getDirection());
		assertEquals("(0, 0, S)", this.robot.getPosition());
	}
	
	@Test
	public void rotateRightThreeTimes() {
		this.robot.rotateRight();
		this.robot.rotateRight();
		this.robot.rotateRight();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("W", this.robot.getDirection());
		assertEquals("(0, 0, W)", this.robot.getPosition());
	}
	
	@Test
	public void rotateRightFourTimes() {
		this.robot.rotateRight();
		this.robot.rotateRight();
		this.robot.rotateRight();
		this.robot.rotateRight();
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 0, N)", this.robot.getPosition());
	}
	
	@Test
	public void move() {
		this.robot.move();
		
		assertEquals(0, this.robot.getX());
		assertEquals(1, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 1, N)", this.robot.getPosition());
	}
	
	@Test
	public void moveTwice() {
		this.robot.move();
		this.robot.move();
		
		assertEquals(0, this.robot.getX());
		assertEquals(2, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 2, N)", this.robot.getPosition());
	}
	
	@Test
	public void moveSixTimes() {
		this.robot.move();
		this.robot.move();
		this.robot.move();
		this.robot.move();
		this.robot.move();
		
		try {
			this.robot.move();
			fail();
		} catch(RobotOutOfBoundsException e) { }
		
	}
	
	@Test
	public void moveNorthTwiceAndSouthOnce() {
		this.robot.move();
		this.robot.move();
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		this.robot.move();
		
		assertEquals(0, this.robot.getX());
		assertEquals(1, this.robot.getY());
		assertEquals("S", this.robot.getDirection());
		assertEquals("(0, 1, S)", this.robot.getPosition());
		
	}
	
	@Test
	public void moveOutOfBoundsInDirectionSouth() {
		this.robot.rotateLeft();
		this.robot.rotateLeft();

		try {
			this.robot.move();
			fail();
		} catch(RobotOutOfBoundsException e) { }
	}
	
	@Test
	public void moveEastOnce() {
		this.robot.rotateRight();
		this.robot.move();
		
		assertEquals(1, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("E", this.robot.getDirection());
		assertEquals("(1, 0, E)", this.robot.getPosition());
	}
	
	@Test
	public void moveEastTwice() {
		this.robot.rotateRight();
		this.robot.move();
		this.robot.move();
		
		assertEquals(2, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("E", this.robot.getDirection());
		assertEquals("(2, 0, E)", this.robot.getPosition());
	}
	
	@Test
	public void moveOutOfBoundsInDirectionEast() {
		this.robot.rotateRight();
		this.robot.move();
		this.robot.move();
		this.robot.move();
		this.robot.move();
		this.robot.move();
		
		try {
			this.robot.move();
			fail();
		} catch (RobotOutOfBoundsException e) { }
		
	}
	
	@Test
	public void moveEastTwiceAndWestOnce() {
		this.robot.rotateRight();
		this.robot.move();
		this.robot.move();
		this.robot.rotateLeft();
		this.robot.rotateLeft();
		this.robot.move();
		
		assertEquals(1, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("W", this.robot.getDirection());
		assertEquals("(1, 0, W)", this.robot.getPosition());
		
	}
	
	@Test
	public void moveOutOfBoundsInDirectionWest() {
		this.robot.rotateLeft();

		try {
			this.robot.move();
			fail();
		} catch(RobotOutOfBoundsException e) { }
	}
	
	@Test
	public void moveRandomly() {
		this.robot.move(); // (0, 1, N)
		this.robot.move(); // (0, 2, N)
		this.robot.rotateRight(); // (0, 2, E)
		this.robot.move(); // (1, 2, E)
		this.robot.move(); // (2, 2, E)
		this.robot.move(); // (3, 2, E)
		this.robot.rotateLeft(); // (3, 2, N)
		this.robot.move(); // (3, 3, N)
		this.robot.rotateLeft(); // (3, 3, W)
		this.robot.move(); // (2, 3, W)
		this.robot.move(); // (1, 3, W)
		this.robot.rotateLeft(); // (1, 3, S)
		this.robot.move(); // (1, 2, S)
		this.robot.move(); // (1, 1, S)
		
		assertEquals(1, this.robot.getX());
		assertEquals(1, this.robot.getY());
		assertEquals("S", this.robot.getDirection());
		assertEquals("(1, 1, S)", this.robot.getPosition());
		
	}
	
	@Test
	public void sendCommandToMove() {
		this.robot.sendCommand("M");
		
		assertEquals(0, this.robot.getX());
		assertEquals(1, this.robot.getY());
		assertEquals("N", this.robot.getDirection());
		assertEquals("(0, 1, N)", this.robot.getPosition());
	}
	
	@Test
	public void sendCommandToRotateLeft() {
		this.robot.sendCommand("L");
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("W", this.robot.getDirection());
		assertEquals("(0, 0, W)", this.robot.getPosition());
	}
	
	@Test
	public void sendCommandToRotateRight() {
		this.robot.sendCommand("R");
		
		assertEquals(0, this.robot.getX());
		assertEquals(0, this.robot.getY());
		assertEquals("E", this.robot.getDirection());
		assertEquals("(0, 0, E)", this.robot.getPosition());
	}
	
	@Test(expected=InvalidCommandException.class)
	public void sendInvalidCommand() {
		this.robot.sendCommand("A");
	}
	
}
