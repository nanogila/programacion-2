package TarjetaSube;

public class Bondi {
	private final Double costo;
	private BaseDeDatos datos;
	public Bondi(Double costo , BaseDeDatos datos) {
		this.costo = Math.abs(costo);
		this.datos = datos;
	}
	
	public Double viaje(Tarjeta tarjeta) {
		return datos.substractMoney(tarjeta, costo);
	}

}
