package State;

import State;

public class Monje {
	private int vida;
	private int daño;
	private State estado;

	public Monje(int vida) {
		this.vida = vida;
		this.daño = 10;
		this.setState(new Normal());
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public State getEstado() {
		return estado;
	}

	public void setState(State estado) {
		this.estado = estado;
		this.estado.setMonje(this);
	}
	
	public void atacar(Monje monje2) {
		this.estado.atacar(monje2);
	}
	
	public void recibirAtaque(Monje monje2) {
		this.estado.recibirAtaque(monje2);
	}
	
	public void meditar() {
		this.estado.meditar();
	}

}
