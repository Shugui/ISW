package logica;

import java.util.ArrayList;
import java.util.Collection;

public class Sucursal {
	
	

	//ID
	private String id;
	
	private String direccion;
	
	private AlquilerVehiculos alquilerVehiculos;
	private Collection<Coche> coches;
	private Collection<Empleado> empleados;
	private Collection<Reserva> reservasRecogida;
	private Collection<Reserva> reservasDevolucion;
	
	public Sucursal(String id, String direccion) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.reservasDevolucion = new ArrayList<Reserva>();
		this.reservasRecogida = new ArrayList<Reserva>();
	}
	
	public Coche consultar_Coche(String id){
		for(Coche coche: coches)
			if(coche.getMatricula().equals(id))
				return coche;
		return null;
	}
	
	public boolean añadir_Coche(Coche coche){
		return coches.add(coche);
	}
	
	public boolean eliminar_Coche(String id){
		return coches.remove(consultar_Coche(id));
	}
	
	public Empleado consultar_Empleado(String id){
		for(Empleado empleado: empleados)
			if(empleado.getId().equals(id))
				return empleado;
		return null;
	}
	
	public boolean añadir_Empleado(Empleado empleado){
		return empleados.add(empleado);
	}
	
	public boolean eliminar_Empleado(String id){
		return empleados.remove(consultar_Empleado(id));		
	}
	
	public Reserva consultar_ReservaRecogida(String id){
		for(Reserva reserva: reservasRecogida)
			if(reserva.getId().equals(id))
				return reserva;
		return null;
	}
	
	public boolean añadir_ReservaRecogida(Reserva reserva){
		return reservasRecogida.add(reserva);
	}
	
	public boolean eliminar_ReservaRecogida(String id){
		return reservasRecogida.remove(consultar_ReservaRecogida(id));
	}
	
	public Reserva consultar_ReservaDevolucion(String id){
		for(Reserva reserva: reservasDevolucion)
			if(reserva.getId().equals(id))
				return reserva;
		return null;
	}
	
	public boolean añadir_ReservaDevolucion(Reserva reserva){
		return reservasDevolucion.add(reserva);
	}
	
	public boolean eliminar_ReservaDevolucion(String id){
		return reservasDevolucion.remove(consultar_ReservaDevolucion(id));
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AlquilerVehiculos getAlquilerVehiculos() {
		return alquilerVehiculos;
	}

	public void setAlquilerVehiculos(AlquilerVehiculos alquilerVehiculos) {
		this.alquilerVehiculos = alquilerVehiculos;
	}

	public Collection<Coche> getCoches() {
		return coches;
	}

	public void setCoches(Collection<Coche> coches) {
		this.coches = coches;
	}

	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Collection<Reserva> getReservasRecogida() {
		return reservasRecogida;
	}

	public void setReservasRecogida(Collection<Reserva> reservasRecogida) {
		this.reservasRecogida = reservasRecogida;
	}

	public Collection<Reserva> getReservasDevolucion() {
		return reservasDevolucion;
	}

	public void setReservasDevolucion(Collection<Reserva> reservasDevolucion) {
		this.reservasDevolucion = reservasDevolucion;
	}
}
