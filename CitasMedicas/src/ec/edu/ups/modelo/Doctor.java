package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
@DiscriminatorValue("D")
@Table(name="doctor")
public class Doctor extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String contrasena;
	@ManyToOne
	@JoinColumn
	private Especialidad especialidad;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Horario> horarios = new ArrayList<Horario>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Cita> listCitas = new ArrayList<Cita>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Consulta> listConsulta = new ArrayList<Consulta>();
	
	public Doctor(int id, String nombre, String apellido, Date fechaNacimiento, String cedula, String telefono, char cdiscriminatoria,
			String usuario, String contrasena, Especialidad especialidad) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
		this.setCedula(cedula);
		this.setTelefono(telefono);
		this.setCdiscriminatoria(cdiscriminatoria);
		this.setUsuario(usuario);
		this.setContrasena(contrasena);
		this.setEspecialidad(especialidad);
	}
	
	public Doctor() {
	}

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
	
	public void addHorario(Horario horario) {
		this.horarios.add(horario);
	}
   
	public void calculoNumeroCitas() {
		
	}

	public List<Cita> getListCitas() {
		return listCitas;
	}

	public void setListCitas(List<Cita> listCitas) {
		this.listCitas = listCitas;
	}
	
	public void addCita(Cita cita) {
		this.listCitas.add(cita);
	}

	public List<Consulta> getListConsulta() {
		return listConsulta;
	}

	public void setListConsulta(List<Consulta> listConsulta) {
		this.listConsulta = listConsulta;
	}
	
	public void addConsulta(Consulta consulta) {
		this.listConsulta.add(consulta);
	}
	
}
