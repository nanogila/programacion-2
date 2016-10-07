package TarjetaSube;

public class Cajera {
	private BaseDeDatos dataBase; 
	public Cajera(BaseDeDatos baseDeDatos) {
		dataBase = baseDeDatos;
	}
	
	public void addSube(Tarjeta tarjeta) {
		dataBase.addSube(tarjeta);
	}
	public boolean removeSube(Tarjeta tarjeta) {
		return dataBase.removeSube(tarjeta);
	}
	public void addMoney(Tarjeta tarjeta , Double money)throws NoEstasRegistradoTodaviaException {
		if(dataBase.checkTarjeta(tarjeta)) {
			dataBase.addMoney(tarjeta , money);
			
		}
		else throw new NoEstasRegistradoTodaviaException();
	}
	public Double checkMoney(Tarjeta tarjeta) {
		return dataBase.checkSaldo(tarjeta);
	}
}
