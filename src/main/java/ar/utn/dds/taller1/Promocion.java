package ar.utn.dds.taller1;

public class Promocion implements EstadoDePrenda {
  private int descuento;
  public int descuento() {
	  return descuento;
  }
	public int calcularPrecio(int precioBase) {
		// TODO Auto-generated method stub
		return precioBase - this.descuento();
	}
}
