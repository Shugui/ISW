package logica;

import java.util.Collection;

public class Categoria {
	
	//ID
	private String id;
	
	private float precioModLimitada;
	private float precioModKms;
	private float precioKmModKms;
	private float precioSeguroTRiesgo;
	private float precioSeguroterceros;

	private AlquilerVehiculos alquilerVehiculos;
	private Categoria categoria;
	private Collection<Coche> coches;
	private Collection<Reserva> reservas;
	
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
	
	public Sucursal consultar_Reserva(String id){
		
	}
	
	public void añadir_Reserva(Reserva reserva){
		
	}
	
	public void eliminar_Reserva(String id){
		
	}

	public float getPrecioModLimitada() {
		return precioModLimitada;
	}

	public void setPrecioModLimitada(float precioModLimitada) {
		this.precioModLimitada = precioModLimitada;
	}

	public float getPrecioModKms() {
		return precioModKms;
	}

	public void setPrecioModKms(float precioModKms) {
		this.precioModKms = precioModKms;
	}

	public float getPrecioKmModKms() {
		return precioKmModKms;
	}

	public void setPrecioKmModKms(float precioKmModKms) {
		this.precioKmModKms = precioKmModKms;
	}

	public float getPrecioSeguroTRiesgo() {
		return precioSeguroTRiesgo;
	}

	public void setPrecioSeguroTRiesgo(float precioSeguroTRiesgo) {
		this.precioSeguroTRiesgo = precioSeguroTRiesgo;
	}

	public float getPrecioSeguroterceros() {
		return precioSeguroterceros;
	}

	public void setPrecioSeguroterceros(float precioSeguroterceros) {
		this.precioSeguroterceros = precioSeguroterceros;
	}

	public AlquilerVehiculos getAlquilerVehiculos() {
		return AlquilerVehiculos;
	}

	public void setAlquilerVehiculos(AlquilerVehiculos alquilerVehiculos) {
		AlquilerVehiculos = alquilerVehiculos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<Coche> getCoches() {
		return coches;
	}

	public void setCoches(Collection<Coche> coches) {
		this.coches = coches;
	}

	public Collection<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
