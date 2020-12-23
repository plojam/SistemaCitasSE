package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaDetalle
 *
 */
@Entity
@Table(name="facturadetalle")
public class FacturaDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn
	private FacturaCabecera facturaCabecera;
	@OneToOne
	@JoinColumn
	private Cita cita;
	
	public FacturaDetalle(int id, FacturaCabecera facturaCabecera, Cita cita) {
		super();
		this.setId(id);
		this.setFacturaCabecera(facturaCabecera);
		this.setCita(cita);
	}
	
	public FacturaDetalle() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}
   
	
	
}
