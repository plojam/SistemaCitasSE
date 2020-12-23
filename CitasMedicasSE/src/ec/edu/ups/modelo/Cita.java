package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cita
 *
 */
@Entity
@Table(name="cita")
public class Cita implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date fecha;
	private float precio;
	@ManyToOne
	@JoinColumn
	private Doctor doctor;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private FacturaDetalle facturaDetalle;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private Consulta consulta;
	
	public Cita(int id, Date fecha, float precio, Doctor doctor, Cliente cliente) {
		super();
		this.setId(id);
		this.setFecha(fecha);
		this.setPrecio(precio);
		this.setDoctor(doctor);
		this.setCliente(cliente);
	}
	
	public Cita() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FacturaDetalle getFacturaDetalle() {
		return facturaDetalle;
	}

	public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	
	
   
}
