package cinema.service; 
 
import java.nio.file.Path;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response; 
 
public class UntypedHelloClient {
	public static void main(String[] args) {
		try{             
			// Create a new RESTeasy client through the JAX-RS API:             
			Client client = ClientBuilder.newClient();             
			// The base URL of the service:             
			WebTarget target = 
					client.target("http://localhost:8080/Rest_H6K1XW/resources");
			
			
			// Building the relative URL manually for the sayHello method:
			WebTarget movie = target.path("MovieDatabase").path("movies"); //.queryParam("name", "me");
			
			// all movie
			Response response = movie.request().get();
			String result = response.readEntity(String.class);
			System.out.println("GET all movie: " + result);    

			// id movie
			response = movie.path("0").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET movie: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"A Valami cim\",\"year\":2005,\"director\":\"Z Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Valami cim\",\"year\":2030,\"director\":\"Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"A Valami cim\",\"year\":2005,\"director\":\"Z Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Z Valami cim\",\"year\":2005,\"director\":\"A Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"A Valami cim\",\"year\":2003,\"director\":\"Z Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Z Valami cim\",\"year\":2003,\"director\":\"A Valami rendezõ\"}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Batman Begins\",\"year\":2005,\"director\":\"Cristopher Nolan\",\"actor\":[\"Christian Bale\",\"Michael Caine\"]}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Batman Begins\",\"year\":2005,\"director\":\"Cristopher Nolan\",\"actor\":[\"Christian Bale\",\"Michael Caine\"]}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// add movie
			response = movie.request().post(Entity.json("{\"title\":\"Batman Begins\",\"year\":2005,\"director\":\"Cristopher Nolan\",\"actor\":[\"Christian Bale\",\"Michael Caine\"]}"));
			result = response.readEntity(String.class);
			System.out.println("POST add: " + result);   

			// all movie
			response = movie.request().get();
			result = response.readEntity(String.class);
			System.out.println("GET all movie: " + result);    

			
			// id movie
			response = movie.path("1").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET movie: " + result);   

			// update movie
			response = movie.path("1").request().put(Entity.json("{\"title\":\"Pirates of the Caribbean: The Curse of the Black Pearl\",\"year\":2003,\"director\":\"Gore Verbinski\"}"));
			result = response.readEntity(String.class);
			System.out.println("PUT update: " + result);   
			
			// id movie
			response = movie.path("1").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET movie: " + result);   

			// update movie
			response = movie.path("1").request().put(Entity.json("{\"title\":\"Pirates of the Caribbean: The Curse of the Black Pearl\",\"year\":2003,\"director\":\"Gore Verbinski\",\"actor\":[\"Christian Bale\",\"Michael Caine\"]}"));
			result = response.readEntity(String.class);
			System.out.println("PUT update: " + result);   

			// id movie
			response = movie.path("1").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET movie: " + result);   

			
			// delete movie
			response = movie.path("0").request().delete();
			result = response.readEntity(String.class);
			System.out.println("DELETE movie: " + result);   

			// all movie
			response = movie.request().get();
			result = response.readEntity(String.class);
			System.out.println("GET all movie: " + result);    
			
			
			// find movie
			response = movie.path("find").queryParam("year", "2003").queryParam("orderby", "Title").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET find: " + result);   

			// find movie
			response = movie.path("find").queryParam("year", "2003").queryParam("orderby", "Director").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET find: " + result);   

			// find movie
			response = movie.path("find").queryParam("year", "2005").queryParam("orderby", "Title").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET find: " + result);   

			// find movie
			response = movie.path("find").queryParam("year", "2005").queryParam("orderby", "Director").request().get();
			result = response.readEntity(String.class);
			System.out.println("GET find: " + result);   
			
			
			response.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
} 