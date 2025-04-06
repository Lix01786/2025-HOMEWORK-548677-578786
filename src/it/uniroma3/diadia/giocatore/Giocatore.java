package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.ambienti.Stanza;

public class Giocatore {
	static final public int CFU_INIZIALI = 20;
	private Borsa borsa;
	public int cfu;
	
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();
	}
	
	
	public Borsa getBorsa() {
		return borsa;
	}
	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}
	public int getCfu() {
		return cfu;
	}
	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
}
