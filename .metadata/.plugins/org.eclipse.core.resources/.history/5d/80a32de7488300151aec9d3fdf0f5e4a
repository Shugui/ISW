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
	
	
	public Categoria(String id, float precioModLimitada, float precioModKms, float precioKmModKms,
			float precioSeguroTRiesgo, float precioSeguroterceros) {
		super();
		this.id = id;
		this.precioModLimitada = precioModLimitada;
		this.precioModKms = precioModKms;
		this.precioKmModKms = precioKmModKms;
		this.precioSeguroTRiesgo = precioSeguroTRiesgo;
		this.precioSeguroterceros = precioSeguroterceros;
	}

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
	
	public Reserva consultar_Reserva(String id){
		for(Reserva reserva: reservas)
			if(reserva.equals(id))
				return reserva;
		return null;
	}
	
	public boolean añadir_Reserva(Reserva reserva){
		return reservas.add(reserva);
	}
	
	public boolean eliminar_Reserva(String id){
		return reservas.remove(consultar_Reserva(id));
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
		return alquilerVehiculos;
	}

	public void setAlquilerVehiculos(AlquilerVehiculos alquilerVehiculos) {
		this.alquilerVehiculos = alquilerVehiculos;
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
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
}
