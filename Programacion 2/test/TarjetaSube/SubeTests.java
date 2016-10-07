package TarjetaSube;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubeTests {
@Test
public void testTrip () {
Tarjeta aCard = new Tarjeta(334455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
Bondi sesenta = new Bondi(60.0, aBase);
juli.addSube(aCard);
juli.addMoney(aCard, 100.0);
Double result = sesenta.viaje(aCard);
assertEquals(40.0, result, 0.00001);
}
@Test (expected = GilCaraDePoronga.class)
public void testFailedTrip () {
Tarjeta aCard = new Tarjeta(334455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
Bondi sesenta = new Bondi(60.0, aBase);
juli.addSube(aCard);
juli.addMoney(aCard, 10.0);
Double result = sesenta.viaje(aCard);
}
@Test
public void testSaldoCajera () {
Tarjeta aCard = new Tarjeta(334455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
juli.addMoney(aCard, 10.0);
Double result = juli.checkMoney(aCard);
assertEquals(10, result, 0.00001);
}
@Test (expected = NoEstasRegistradoTodaviaException.class)
public void testSaldoCajeraFail () {
Tarjeta aCard = new Tarjeta(334455);
Tarjeta anotherCard = new Tarjeta(34455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
juli.addMoney(aCard, 10.0);
Double result = juli.checkMoney(anotherCard);
}
@Test (expected = NoEstasRegistradoTodaviaException.class)
public void addSaldoCajeraFail () {
Tarjeta aCard = new Tarjeta(334455);
Tarjeta anotherCard = new Tarjeta(34455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
juli.addMoney(anotherCard, 10.0);
}
@Test (expected = NoEstasRegistradoTodaviaException.class)
public void removeSubeCajeraFail () {
Tarjeta aCard = new Tarjeta(334455);
Tarjeta anotherCard = new Tarjeta(34455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
juli.removeSube(anotherCard);
}
@Test
public void removeSubeCajera () {
Tarjeta aCard = new Tarjeta(334455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
boolean result = juli.removeSube(aCard);
assertTrue (result);
}
@Test(expected = yaTenesSubePelotudoException.class)
public void SubeYaRegistradaCajera () {
Tarjeta aCard = new Tarjeta(334455);
BaseDeDatos aBase = new BaseDeDatos();
Cajera juli = new Cajera(aBase);
juli.addSube(aCard);
juli.addSube(aCard);
}
}
