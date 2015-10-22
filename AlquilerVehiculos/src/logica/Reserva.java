package logica;

import java.util.Date;

public class Reserva {
	
	//ID
	private String id;
	
	private Date fechaRecogida;
	private Date fechaDevolucion;
	private String modalidadAlquiler;
	
	private Entrega entrega;
	private Categoria categoria;
	private Sucursal sucursalDevolucion;
	private Sucursal sucursalRecogida;
	private Cliente cliente;
	private AlquilerVehiculos alquilerVehiculos;
	public Date getFechaRecogida() {
		return fechaRecogida;
	}
	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
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
}
