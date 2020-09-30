package State;

public interface State {
	
	void atacar(Monje monje2);
	
	void recibirAtaque(Monje monje2);

	void meditar();
	
	void setMonje(Monje monje);
		
}
