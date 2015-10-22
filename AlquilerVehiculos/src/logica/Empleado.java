package logica;

import java.util.Collection;

public class Empleado {
	
	//id
	private String id;
	private String nombre;
	private String administrador;

	private Sucursal sucursal;
	private Collection<Entrega> entregas;
	private Collection<Devolucion> devoluciones;
	
	public Entrega consultar_Entrega(String id){
		for(Entrega entrega: entregas)
			if(entrega.equals(id))
				return entrega;
		return null;
	}
	
	public boolean añadir_Entrega(Entrega entrega){
		return entregas.add(entrega);
	}
	
	public boolean eliminar_Entrega(String id){
		return entregas.remove(consultar_Entrega(id));
	}
	
	public Devolucion consultar_Devolucion(String id){
		for(Devolucion devolucion: devoluciones)
			if(devoluciones.equals(id))
				return devolucion;
		return null;
	}
	
	public boolean añadir_Devolucion(Devolucion devolucion){
		return devoluciones.add(devolucion);
	}
	
	public boolean eliminar_Devolucion(String id){
		return devoluciones.remove(consultar_Devolucion(id));		
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
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	
}
