package teorica;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CentralTelefonicaTests {
	@Test(expected = CentralTelefonicaEnFuncionamiento.class) 
	public void test001UnaCentralIniciadaDosVecesDebeFallar() {
		CentralTelefonica ct = new CentralTelefonica();
		try {
			ct.iniciar();
			ct.iniciar();
		} catch (CentralTelefonicaEnFuncionamiento e) {
			// TODO hacer algo aca
		}
	}
	
	@Test(expected = CentralTelefonicaNoOperativaException.class) 
	public void test002UnaCentralNoIniciadaAlDetenerlaDebeFallar() throws CentralTelefonicaNoOperativaException {
		CentralTelefonica ct = new CentralTelefonica();
		ct.detener();
	}
	
	@Test 
	public void test003() {
		CentralTelefonica ct = new CentralTelefonica();
		Boolean seguir = true;
		int nro = 10;
		int veces = 0;
		while (seguir) {
			try {
				ct.llamar(nro);
				seguir = false;
			} catch (NumeroInvalidoException e) {
				nro = nro * 10;
			}
			finally {
				veces++;
			}
		}
		assertEquals(10000, nro);
		assertEquals(4, veces);
	}
}
