package State;

import State;

public class Normal implements State {

	private Monje monje;

	@Override
	public void atacar(Monje monje2) {
		monje2.setVida(monje2.getVida() - monje.getDaño());
		monje2.recibirAtaque(monje);
	}

	@Override
	public void recibirAtaque(Monje monje2) {
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
