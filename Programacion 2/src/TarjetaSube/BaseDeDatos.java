package TarjetaSube;

import java.util.HashMap;

public class BaseDeDatos {
	private HashMap<Integer, Double> DatosSube;
	
public BaseDeDatos() {
	DatosSube = new HashMap <Integer , Double >();
}

public void addSube(Tarjeta tarjeta)throws yaTenesSubePelotudoException {
	Integer id = tarjeta.getId();
	if(DatosSube.containsKey(id)) {
		throw new yaTenesSubePelotudoException();
	}
	else 
	DatosSube.put(id, 0.0);
	
}
public boolean removeSube(Tarjeta tarjeta)throws NoEstasRegistradoTodaviaException {
	Integer id = tarjeta.getId();
	if(!DatosSube.containsKey(id)) {
		throw new NoEstasRegistradoTodaviaException();
	}
	else
	DatosSube.remove(id);
	return true;
}
public boolean checkTarjeta(Tarjeta tarjeta) {
	Integer id = tarjeta.getId();
	if(DatosSube.containsKey(id)) {
		return true;
	}
		else return false;
	}
public Double addMoney(Tarjeta tarjeta, Double money){
	money = Math.abs(money);
	Integer id = tarjeta.getId();
	Double platusa = DatosSube.get(id);
	platusa += money;
	DatosSube.put(id, platusa);
	return DatosSube.get(id);
}
public Double substractMoney(Tarjeta tarjeta, Double money) throws GilCaraDePoronga{
	money = Math.abs(money);
	Integer id = tarjeta.getId();
	Double platusa = DatosSube.get(id);
	platusa -= money;
	if(platusa < 0) {
		throw new GilCaraDePoronga("te falta guita cara de poronga");
	}
	DatosSube.put(id, platusa);
	return DatosSube.get(id);
}
public Double checkSaldo(Tarjeta tarjeta) {
	Integer id = tarjeta.getId();
	if(!DatosSube.containsKey(id)) {
		throw new NoEstasRegistradoTodaviaException();
	}else {
	return DatosSube.get(id);
	}
}
}


