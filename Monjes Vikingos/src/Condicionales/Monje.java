package Condicionales;

public class Monje {
	private int vida;
	private int daño;
	private String estado;
	private int golpesRecibidos;

	public Monje(int vida) {
		this.vida = vida;
		this.daño = 10;
		this.golpesRecibidos = 0;
		this.estado = "Normal";
	}

	public int ataca() {

		if (this.estado == "Colerico")
			return this.daño * 2;

		if (this.estado == "Calmado")
			this.estado = "Normal";

		if (this.estado == "Berserker")
			return this.daño * 3;

		return this.daño;
	}

	public void recibieGolpeDe(int dañoSufrido) {

		if (this.estado == "Colerico") {
			this.vida -= dañoSufrido * 2;
		}

		if (this.estado == "Berserker") {
			this.vida -= dañoSufrido * (0.5);
		}
		
		if(this.estado == "Normal")
			this.vida -= dañoSufrido;

		this.golpesRecibidos++;
		
		if (this.golpesRecibidos == 1)
			this.estado = "Colerico";
		if(this.golpesRecibidos>=2)
			this.estado = "Berserker";
	}

	public void meditar() {
		this.golpesRecibidos = 0;
		if (this.estado == "Normal" || this.estado == "Calmado")
			this.estado = "Calmado";
		else
			this.estado = "Normal";
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "[vida=" + vida + ", estado=" + estado + ", golpesRecibidos=" + golpesRecibidos
				+ "]";
	}

}
