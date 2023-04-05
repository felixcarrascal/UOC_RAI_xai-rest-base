package xai.rest.jettyserver.api;

import java.io.Serializable;

/**
 * @author Joan-Manuel Marques
 *
 */
public class Division implements Serializable{
	private static final long serialVersionUID = 1L;

	int quotient;
	int remainder;

	public Division(int dividend, int divisor){
		this.quotient = dividend/divisor;
		this.remainder = dividend%divisor;			
	}

	@Override
	public String toString() {
		return "COMPLETE WITH JSON RESULT";
	}
}