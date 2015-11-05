package logica;

import java.util.Collection;
import java.time.LocalDate;

public class Entrega {
	
	//id
	private String id;

	private LocalDate fecha;
	private String tipoSeguro;
	private float kms;
	private float combustible;
	
	private Coche coche;
	private Empleado empleado;
	private Devolucion devolucion;
	private Reserva reserva;
	private Collection<Daño> daños;
	
	
	public Daño consultar_Daños(String id){
		for(Daño daño: daños)
			if(daño.getId().equals(id))
				return daño;
		return null;
	}
	
	public boolean añadir_Daño(Daño daño){
		return daños.add(daño);
	}
	
	public boolean eliminar_Daño(String id){
		return daños.remove(consultar_Daños(id));
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
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

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Devolucion getDevolucion() {
		return devolucion;
	}

	public void setDevolucion(Devolucion devolucion) {
		this.devolucion = devolucion;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
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
