package br.com.contaazul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

	@RequestMapping("/teste")
	public String teste() {
		return "teste";
	}
	
}
