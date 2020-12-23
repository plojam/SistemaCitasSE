package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaCabecera
 *
 */
@Entity
@Table(name="facturacabecera")
public class FacturaCabecera implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private GregorianCalendar fecha;
	private float subtotal;
	private float iva;
	private float total;
	private char estado;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaCabecera")
	private List<FacturaDetalle> listFacDetalle = new ArrayList<FacturaDetalle>();
	
	public FacturaCabecera(int id, GregorianCalendar fecha, float sutotal, float iva, float total, char estado, Cliente cliente) {
		super();
		this.setId(id);
		this.setFecha(fecha);
		this.setSubtotal(total);
		this.setIva(iva);
		this.setTotal(total);
		this.setEstado(estado);
		this.setCliente(cliente);
	}
	
	public FacturaCabecera() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<FacturaDetalle> getListFacDetalle() {
		return listFacDetalle;
	}

	public void setListFacDetalle(List<FacturaDetalle> listFacDetalle) {
		this.listFacDetalle = listFacDetalle;
	}
	
	public void addFacturaDetalle(FacturaDetalle detalle) {
		this.listFacDetalle.add(detalle);
	}
   
}
