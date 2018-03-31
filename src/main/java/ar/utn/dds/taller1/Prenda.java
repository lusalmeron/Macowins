package ar.utn.dds.taller1;

public class Prenda {
  private int precioBase=10;
  private String tipo;
  private EstadoDePrenda estado;
  
  public int precio() {
	  return this.estado.calcularPrecio(precioBase);
  }
}
