package br.com.contaazul.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.contaazul.model.InvalidCommandException;
import br.com.contaazul.model.Robot;
import br.com.contaazul.model.RobotOutOfBoundsException;

@RestController
@EnableWebMvc
public class RobotController {

	@RequestMapping(value = "/rest/mars/{command}", method = RequestMethod.POST)
	public ResponseEntity<String> sendCommand(@PathVariable("command") String command) {
		
		Robot robot = new Robot();
		
		try {
			for(char c : command.toCharArray()) {
				robot.sendCommand(String.valueOf(c));
			}
		} catch (InvalidCommandException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} catch (RobotOutOfBoundsException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		
		return ResponseEntity.ok(robot.getPosition());
		
	}
	
}
