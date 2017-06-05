package Models;

import org.joda.time.LocalTime;

public class Cliente {

	private LocalTime tiempoEntrada;
	private LocalTime tiempoSalida;
	private double precio;
	private String Matricula;
	


	public Cliente(LocalTime tiempoEntrada){
		this.tiempoEntrada = tiempoEntrada;
		this.tiempoSalida = null;
		this.precio = 0;
	}

	
	
	
	public LocalTime getTiempoEntrada() {
		return tiempoEntrada;
	}

	public void setTiempoEntrada(LocalTime tiempoEntrada) {
		this.tiempoEntrada = tiempoEntrada;
	}

	public LocalTime getTiempoSalida() {
		return tiempoSalida;
	}

	public void setTiempoSalida(LocalTime tiempoSalida) {
		this.tiempoSalida = tiempoSalida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMatricula() {
		return Matricula;
	}


	public void setMatricula(String matricula) {
		Matricula = matricula;
	}


}
