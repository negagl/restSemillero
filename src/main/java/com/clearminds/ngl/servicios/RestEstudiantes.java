package com.clearminds.ngl.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.negl.servicios.ServicioEstudiante;
import com.clearminds.ngl.dtos.Estudiante;
import com.clearminds.ngl.excepciones.BDDException;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		ServicioEstudiante serv = new ServicioEstudiante();
		try {
			serv.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
}
