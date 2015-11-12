package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import logica.AlquilerVehiculos;
import logica.Categoria;
import logica.Cliente;
import logica.Reserva;
import logica.Sucursal;

public class TestCapaLogica {

	private static AlquilerVehiculos alquilerVehiculos;
	
	public static void main(String[] args) {
		alquilerVehiculos = new AlquilerVehiculos();
		Cliente cli1 = new Cliente("11111111A", "Pepito Grillo", "Hispanidad, 13", "Aldaia", 46960, LocalDate.of(1970, 02, 12), 12345678, 7, 2017, 123, "Visa");
		Cliente cli2 = new Cliente("22222222B","David Bisbal", "Valencia , 23","Massamagrell",46130,LocalDate.of(1968, 07, 12), 12348765,10,2024,432,"American Express");
		Reserva res1 = new Reserva("1",LocalDate.of(2016, 05, 12), LocalDate.of(2016, 05, 15), "1", cli1, alquilerVehiculos.consultar_Categoria("cat1"), alquilerVehiculos.consultar_Sucursal("1"),alquilerVehiculos.consultar_Sucursal("1"));
		Reserva res2 = new Reserva("2",LocalDate.of(2016, 10, 13), LocalDate.of(2016, 10, 21), "2", cli2, alquilerVehiculos.consultar_Categoria("cat2"), alquilerVehiculos.consultar_Sucursal("1"),alquilerVehiculos.consultar_Sucursal("2"));
		alquilerVehiculos.realizarReserva(res2);
		alquilerVehiculos.realizarReserva(res1);
		
		
		System.out.printf("Las reservas de suc1 son: \n");
		Collection<Reserva> reservas = new ArrayList<Reserva>();
		reservas = alquilerVehiculos.listarReservasSucursal("1");
		for(Reserva reserva: reservas){
			System.out.println("ID: " + reserva.getId() +"\n Fecha" + reserva.getFechaRecogida()+" "+ reserva.getSucursalRecogida()+" "+reserva.getFechaDevolucion()+" "+reserva.getSucursalDevolucion()+" "+reserva.getModalidadAlquiler()+ " "+ reserva.getCliente().getNombreyApellidos()+" "+reserva.getCategoria().getPrecioKmModKms() +"\n");
		}
		
	}

}
