package br.com.contaazul.model;

@SuppressWarnings("serial")
public class InvalidCommandException extends RuntimeException {

	public InvalidCommandException(String message) {
		super(message);
	}
	
}
