package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrdenMedica
 *
 */
@Entity
@Table(name="ordenmedica")
public class OrdenMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn
	private TipoOrden tipoOrden;
	@OneToOne
	@JoinColumn
	private Consulta consulta;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "ordenMedica")
	private HistoriaMedica historiaMedica;
	
	public OrdenMedica(int id, TipoOrden tipoOrden, Consulta consulta) {
		super();
		this.setId(id);
		this.setTipoOrden(tipoOrden);
		this.setConsulta(consulta);
	}
	
	public OrdenMedica() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public TipoOrden getTipoOrden() {
		return tipoOrden;
	}


	public void setTipoOrden(TipoOrden tipoOrden) {
		this.tipoOrden = tipoOrden;
	}


	public Consulta getConsulta() {
		return consulta;
	}


	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}


	public HistoriaMedica getHistoriaMedica() {
		return historiaMedica;
	}


	public void setHistoriaMedica(HistoriaMedica historiaMedica) {
		this.historiaMedica = historiaMedica;
	}
   
	
	
}
