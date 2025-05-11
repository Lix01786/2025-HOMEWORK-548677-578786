package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {
	private IO io;
	private String nomeAttrezzo;
	
	private final static String NOME="prendi";
	
	@Override
	public void esegui(Partita partita) {
		Attrezzo a = partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);

		if(partita.getGiocatore().getBorsa().getPesoRimanente(a)) {
			partita.getGiocatore().getBorsa().addAttrezzo(a);
			partita.getStanzaCorrente().removeAttrezzo(a);

		}
		else {
			io.mostraMessaggio("attrezzo troppo pesante, non puoi inserirlo nella borsa");
		}
	}

	@Override
	public void setParametro(String parametro) {
		 this.nomeAttrezzo = parametro;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return nomeAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		   this.io = io;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
