package ar.utn.dds.taller1;

import java.awt.List;
import java.time.LocalTime;

public class Venta {
  private LocalTime fecha;
  private List items;
  private FormaDePago formaPago;
  
  public int precioVenta() {
	 return sumlist(items->item.precioTotal());
  }
}
