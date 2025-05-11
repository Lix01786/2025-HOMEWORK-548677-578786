package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
public class ComandoPosa implements Comando {
	
	private IO io;
	private String nomeAttrezzo;
	private final static String NOME="posa";
	
	
	@Override
	public void esegui(Partita partita) {
		if(!partita.getGiocatore().getBorsa().hasAttrezzo(nomeAttrezzo)) {
			io.mostraMessaggio("Attrezzo " + nomeAttrezzo + " non presente");
			return;
		}
		Attrezzo attrezzo = partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
		partita.getStanzaCorrente().addAttrezzo(attrezzo);
		io.mostraMessaggio("Attrezzo " + nomeAttrezzo + " posato!");
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo=parametro;

	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		this.io=io;

	}

	@Override
	public String getNome() {
		return NOME;
	}

}
