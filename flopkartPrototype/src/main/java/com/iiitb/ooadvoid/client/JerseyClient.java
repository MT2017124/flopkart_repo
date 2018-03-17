package com.iiitb.ooadvoid.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iiitb.ooadvoid.AccessProperties;

public class JerseyClient<E>
{
	public static final AccessProperties ap = new AccessProperties();
	public static String BASE_URI = ap.getServerURL();
	public static final String PROJECT_PATH = "flopkartPrototype/webapi/";

	
	@SuppressWarnings("unchecked")
	protected E postMethod(String path_name, E entity) 
	{
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(BASE_URI+PROJECT_PATH+path_name);
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(entity, MediaType.APPLICATION_JSON));
		return (E) response.readEntity(entity.getClass());
	}
}
