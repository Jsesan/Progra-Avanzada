
public interface State {
	
	void atacar(Raza objetivo);
	
	void recibirAtaque(Raza atacante);

	void descansar();
	
	void setRaza(Raza razita);
		
}
