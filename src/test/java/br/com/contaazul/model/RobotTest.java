package br.com.contaazul.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RobotTest {

	@Test
	public void createOnZero() {
		Robot robot = new Robot();
		assertEquals(0, robot.getX());
		assertEquals(0, robot.getY());
		assertEquals("N", robot.getDirection());
		assertEquals("(0, 0, N)", robot.getPosition());
	}
	
}
