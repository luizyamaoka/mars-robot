package br.com.contaazul.model;

import static org.junit.Assert.assertEquals;

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
	
}
