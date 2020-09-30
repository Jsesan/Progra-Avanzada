package State;

public class Calmado implements State {

	private Monje monje;
	
	@Override
	public void atacar(Monje monje2) {
		monje.setState(new Normal());
		monje2.setVida(monje2.getVida() - monje.getDaño());
	}

	@Override
	public void recibirAtaque(Monje monje2) {
		monje.setVida(monje.getVida() - monje2.getDaño());
		monje.setState(new Colerico());
	}


	@Override
	public void meditar() {
		monje.setState(new Calmado());
	}

	@Override
	public void setMonje(Monje monje) {
		this.monje = monje;
	}

}
