package xai.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

/*import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;*/
import xai.rest.jettyserver.api.Division;

/**
 * @author Joan-Manuel Marques
 *
 */

public class RESTclient {

	public int add(String address, int port, int value1, int value2) {
		/*LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/api/add/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: text/plain");*/
		Response res = operacio("http://"+address+":"+port+"/api/add/"+value1+"/"+value2, "text/plain");
		if (res != null) 
			return new Integer((String) res.readEntity(String.class));
		return Integer.MIN_VALUE;
	}
	
	public int sub(String address, int port, int value1, int value2) {
		/* LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/api/sub/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: application/json"); */
		
		/* COMPLETAR */
		
		return Integer.MIN_VALUE;
	}

	public Division divide(String address, int port, int value1, int value2) {
		/* LSimLogger.log(Level.INFO, "http://"+address+":"+port+"/api/divide/"+value1+"/"+value2);
		LSimLogger.log(Level.INFO, "media type: application/json"); */
		
		/* COMPLETAR */
		
		return null;
	}

	private Response operacio(String rest_service_url, String media_type) {
		Client client;
		Response res = null;

		/* COMPLETAR */

		
		return res;
	}

}