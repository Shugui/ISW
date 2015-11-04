package logica;

import java.util.Collection;
import java.time.LocalDate;

public class Cliente {
	
	
	//id
	private String id;
	
	private String nombreyApellidos;
	private String direccion;
	private String poblacion;
	private int codPostal;
	private LocalDate fechaCarnetConducir;
	private int digitosTC;
	private int añoTC;
	private int mesTC;
	private int cvcTC;
	private String tipoTC;
	
	private AlquilerVehiculos alquilerVehiculos;
	private Collection<Reserva> reservas;
	
	
	public Cliente(String id, String nombreyApellidos, String direccion, String poblacion, int codPostal,
			LocalDate fechaCarnetConducir, int digitosTC, int mesTC, int añoTC, int cvcTC, String tipoTC) {
		super();
		this.id = id;
		this.nombreyApellidos = nombreyApellidos;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.codPostal = codPostal;
		this.fechaCarnetConducir = fechaCarnetConducir;
		this.digitosTC = digitosTC;
		this.mesTC = mesTC;
		this.añoTC = añoTC;
		this.cvcTC = cvcTC;
		this.tipoTC = tipoTC;
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

	public String getNombreyApellidos() {
		return nombreyApellidos;
	}

	public void setNombreyApellidos(String nombreyApellidos) {
		this.nombreyApellidos = nombreyApellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public LocalDate getFechaCarnetConducir() {
		return fechaCarnetConducir;
	}

	public void setFechaCarnetConducir(LocalDate fechaCarnetConducir) {
		this.fechaCarnetConducir = fechaCarnetConducir;
	}

	public int getDigitosTC() {
		return digitosTC;
	}

	public void setDigitosTC(int digitosTC) {
		this.digitosTC = digitosTC;
	}

	public int getAñoTC() {
		return añoTC;
	}

	public void setAñoTC(int añoTC) {
		this.añoTC = añoTC;
	}

	public int getMesTC() {
		return mesTC;
	}

	public void setMesTC(int mesTC) {
		this.mesTC = mesTC;
	}

	public int getCvcTC() {
		return cvcTC;
	}

	public void setCvcTC(int cvcTC) {
		this.cvcTC = cvcTC;
	}

	public String getTipoTC() {
		return tipoTC;
	}

	public void setTipoTC(String tipoTC) {
		this.tipoTC = tipoTC;
	}

	public AlquilerVehiculos getAlquilerVehiculos() {
		return alquilerVehiculos;
	}

	public void setAlquilerVehiculos(AlquilerVehiculos alquilerVehiculos) {
		this.alquilerVehiculos = alquilerVehiculos;
	}

	public Collection<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
}
