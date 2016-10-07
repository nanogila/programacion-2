package teorica;

public class CentralTelefonica {
	private Boolean iniciada = false;
	
	public void iniciar() throws CentralTelefonicaEnFuncionamiento {
		if(iniciada){
			throw new CentralTelefonicaEnFuncionamiento();
		}
		iniciada = true;
	}
	
	public void detener() throws CentralTelefonicaNoOperativaException {
		if(!iniciada){
			throw new CentralTelefonicaNoOperativaException();
		}
		iniciada = false;
	}
	
	public void llamar(int nro) {
		if(nro < 10000){
			throw new NumeroInvalidoException();
		}
	}
}
