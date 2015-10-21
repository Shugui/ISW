package logica;

import java.util.Collection;

public class Empleado {
	
	private String nombre;
	private String administrador;

	private Sucursal sucursal;
	private Collection<Entrega> entregas;
	private Collection<Devolucion> devoluciones;
	
	public Entrega consultar_Emtrega(String id){
		
	}
	
	public void añadir_Entrega(Entrega entrega){
		
	}
	
	public void eliminar_Entrega(String id){
		
	}
	
	public Devolucion consultar_Devolucion(String id){
		
	}
	
	public void añadir_Devolucion(Devolucion devolucion){
		
	}
	
	public void eliminar_Devolucion(String id){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Collection<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntregas(Collection<Entrega> entregas) {
		this.entregas = entregas;
	}

	public Collection<Devolucion> getDevoluciones() {
		return devoluciones;
	}

	public void setDevoluciones(Collection<Devolucion> devoluciones) {
		this.devoluciones = devoluciones;
	}
	
}
