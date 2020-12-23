package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity
@DiscriminatorValue("C")
@Table(name="cliente")
public class Cliente extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Cita> listCita = new ArrayList<Cita>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<FacturaCabecera> listFactura = new ArrayList<FacturaCabecera>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<HistoriaMedica> listHistorialMedico = new ArrayList<HistoriaMedica>();
	
	public Cliente(int id, String nombre, String apellido, Date fechaNacimiento, String cedula, String telefono, char cdiscriminatoria,
			String usuario, String contrasena, TipoConlaborador tipoColaborador) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
		this.setCedula(cedula);
		this.setTelefono(telefono);
		this.setCdiscriminatoria(cdiscriminatoria);
	}
	
	public Cliente() {
	}

	public List<Cita> getListCita() {
		return listCita;
	}

	public void setListCita(List<Cita> listCita) {
		this.listCita = listCita;
	}
	
	public void addCita(Cita cita) {
		this.listCita.add(cita);
	}

	public List<FacturaCabecera> getListFactura() {
		return listFactura;
	}

	public void setListFactura(List<FacturaCabecera> listFactura) {
		this.listFactura = listFactura;
	}
	
	public void addFactura(FacturaCabecera cabecera) {
		this.listFactura.add(cabecera);
	}

	public List<HistoriaMedica> getListHistorialMedico() {
		return listHistorialMedico;
	}

	public void setListHistorialMedico(List<HistoriaMedica> listHistorialMedico) {
		this.listHistorialMedico = listHistorialMedico;
	}
	
	public void addHistoriaMedica(HistoriaMedica historiaMedica) {
		this.listHistorialMedico.add(historiaMedica);
	}
	
	
   
}
