package org.acme.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.vo.Libro;
import org.json.JSONArray;
import org.json.JSONObject;



@Path("/hello-resteasy")
public class GreetingResource {
	

    
    @GET
    @Path("/getText")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloText() {
    	return "quarkus";
    }
    
    
    
    @GET
    @Path("/getLibro")
    @Produces(MediaType.APPLICATION_JSON)
    public Libro helloJson() {
    	Libro libro=new Libro("Lord of the rings","JRR Tolkien","1234","edad media");
    	return libro;
    }
    
    
    @GET
    @Path("/getJsonObject")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJsonObject() {

    	
    	JSONArray proveedores=new JSONArray();
    	proveedores.put(new JSONObject()
    	    	.put("icono", "data:image/png;base64,iVBORw0KGgoAAAANSUhEU5CYII=")
        		.put("proveedorId", "76255245")
        		.put("nombre", "Antay"));
    	proveedores.put(new JSONObject().put("icono", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAAgICFFFFABRRRQB/9k=")
			.put("proveedorId", "75977100")
			.put("nombre", "Club Deportivo Algarrobo"));
    	proveedores.put(new JSONObject().put("icono", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAYABFABRRRQB/9k=")
			.put("proveedorId", "70659800")
			.put("nombre", "CORDEP - La Serena y Coquimbo"));
    	proveedores.put(new JSONObject().put("icono", "data:image/png;base64,iVBORw0KGgojBgAAAAASUVORK5CYII=")
			.put("proveedorId", "76360627")
			.put("nombre", "ENERGY"));
    	proveedores.put(new JSONObject().put("icono","data:image/png;base64,iVBORw0KGgoAAAAAAAASUVORK5CYII=")
			.put("proveedorId", "76205917")
			.put("nombre", "Geosports"));
    	proveedores.put(new JSONObject().put("icono", "data:image/png;base64,iVBORw0KGgoAA5CYII=")
			.put("proveedorId", "17")
			.put("nombre", "Golden Gym"));
    	proveedores.put(new JSONObject().put("icono", "data:image/png;base64,iVBORw0KGgoAAAAVORK5CYII=")
			.put("proveedorId", "78993220")
			.put("nombre", "Palestra Sports s.a."));
    	proveedores.put(new JSONObject().put("icono", "data:image/png;base64,iVBORw0KGgoAAAANCspEAAAAASUVORK5CYII=")
			.put("proveedorId", "76520663")
			.put("nombre", "SportCenter"));
    	proveedores.put(new JSONObject().put("icono", "data:image/png;base64,iVBORw0KGgoAAAANBJRU5ErkJggg==")
			.put("proveedorId", "77265500")
			.put("nombre", "Sportlife"));
		proveedores.put(new JSONObject().put("icono", "data:image/jpeg;base64,/9j/4AAKKACiiigAooooAKKKKACiiigAooooA//Z")
			.put("proveedorId", "77620080")
			.put("nombre", "Sportlife - Bodyline"));
		
		JSONObject response=new JSONObject();
		
		response.put("proveedores",proveedores);
		System.out.println("RESPONSE"+response.toString());
        return Response.ok(response.toMap())
        		//return Response.ok(proveedores.toList())
                    .build();
    }
    
    
    @POST
    @Path("/postLibro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postLibro(Libro li) {
    	
    	System.out.println("REQUEST:"+li.toString());
    	//JSONObject response=json;
    	//System.out.println("RESPONSE:"+response.toString());		
    	return Response.ok(li)
                    .build();
    }
    
    @POST
    @Path("/postJsonObject")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postJsonObject(String request) {
    	
    	System.out.println("REQUEST:"+request);
    	JSONObject req=new JSONObject(request);
    	JSONObject response=req;
    	System.out.println("RESPONSE:"+response.put("status", true).toString());		
    	return Response.ok(response.toMap())
                    .build();
    }
    
    
}