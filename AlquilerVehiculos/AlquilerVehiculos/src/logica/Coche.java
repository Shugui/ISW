package logica;

import java.util.Collection;

public class Coche {
	
	//ID
	private String matricula;
	private float kmsActuales;
	
	private Categoria categoria;
	private Collection<Entrega> entregas;
	private Sucursal sucursal;
	
	public Entrega consultar_Entrega(String id){
		
	}
	
	public void a�adir_Entrega(Entrega entrega){
		
	}
	
	public void eliminar_Entrega(String id){
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getKmsActuales() {
		return kmsActuales;
	}

	public void setKmsActuales(float kmsActuales) {
		this.kmsActuales = kmsActuales;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntregas(Collection<Entrega> entregas) {
		this.entregas = entregas;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
}