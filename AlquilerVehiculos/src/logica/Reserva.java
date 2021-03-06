package logica;

import java.time.LocalDate;

public class Reserva {
	
	
	//ID
	private String id;
	
	private LocalDate fechaRecogida;
	private LocalDate fechaDevolucion;
	private String modalidadAlquiler;
	
	private Entrega entrega;
	private Categoria categoria;
	private Sucursal sucursalDevolucion;
	private Sucursal sucursalRecogida;
	private Cliente cliente;
	private AlquilerVehiculos alquilerVehiculos;
	
	public Reserva(String id, LocalDate fechaRecogida, LocalDate fechaDevolucion, String modalidadAlquiler, Cliente cliente,
			Categoria categoria, Sucursal sucursalRecogida, Sucursal sucursalDevolucion) {
		super();
		this.id = id;
		this.fechaRecogida = fechaRecogida;
		this.fechaDevolucion = fechaDevolucion;
		this.modalidadAlquiler = modalidadAlquiler;
		this.cliente = cliente;
		this.categoria = categoria;
		this.sucursalRecogida = sucursalRecogida;
		this.sucursalDevolucion = sucursalDevolucion;
	}
	
	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}
	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public String getModalidadAlquiler() {
		return modalidadAlquiler;
	}
	public void setModalidadAlquiler(String modalidadAlquiler) {
		this.modalidadAlquiler = modalidadAlquiler;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Sucursal getSucursalDevolucion() {
		return sucursalDevolucion;
	}
	public void setSucursalDevolucion(Sucursal sucursalDevolucion) {
		this.sucursalDevolucion = sucursalDevolucion;
	}
	public Sucursal getSucursalRecogida() {
		return sucursalRecogida;
	}
	public void setSucursalRecogida(Sucursal sucursalRecogida) {
		this.sucursalRecogida = sucursalRecogida;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public AlquilerVehiculos getAlquilerVehiculos() {
		return alquilerVehiculos;
	}
	public void setAlquilerVehiculos(AlquilerVehiculos alquilerVehiculos) {
		this.alquilerVehiculos = alquilerVehiculos;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
}
