package logica;

import java.util.Collection;

public class Sucursal {
	
	//ID
	private String direccion;
	
	private AlquilerVehiculos alquilerVehiculos;
	private Collection<Coche> coches;
	private Collection<Empleado> empleados;
	private Collection<Reserva> reservasRecogida;
	private Collection<Reserva> reservasDevolucion;
	
	public Coche consultar_Coche(String id){
		for(Coche coche: coches)
			if(coche.equals(id))
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
			if(empleado.equals(id))
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
			if(reserva.equals(id))
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
			if(reserva.equals(id))
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
