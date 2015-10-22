package logica;

import java.util.Collection;
import java.util.Date;

public class Devolucion {

	//ID
	private String id;
	
	private Date fecha;
	private float totalACobrar;
	private float cobrado;
	private float kms;
	private float combustible;
	
	private Empleado empleado;
	private Entrega entrega;
	private Collection<Daño> daños;
	
	public Daño consultar_Daño(String id){
		for(Daño daño: daños)
			if(daño.equals(id))
				return daño;
		return null;
	}
	
	public boolean añadir_Daño(Daño daño){
		return daños.add(daño);
	}
	
	public boolean eliminar_Daño(String id){
		return daños.remove(consultar_Daño(id));
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getTotalACobrar() {
		return totalACobrar;
	}

	public void setTotalACobrar(float totalACobrar) {
		this.totalACobrar = totalACobrar;
	}

	public float getCobrado() {
		return cobrado;
	}

	public void setCobrado(float cobrado) {
		this.cobrado = cobrado;
	}

	public float getKms() {
		return kms;
	}

	public void setKms(float kms) {
		this.kms = kms;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public Collection<Daño> getDaños() {
		return daños;
	}

	public void setDaños(Collection<Daño> daños) {
		this.daños = daños;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

}
