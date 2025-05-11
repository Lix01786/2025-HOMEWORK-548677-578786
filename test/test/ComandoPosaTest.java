package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPosa;

class ComandoPosaTest {
	  private static final String NOME_ATTREZZO = "lanterna";
	   private Partita partita;
	    private Attrezzo attrezzo;
	    private IO io;
	    private Comando comando;

	
	   @BeforeEach
	    public void setUp() {
	        this.partita = new Partita();
	        this.attrezzo = new Attrezzo(NOME_ATTREZZO, 3);
	        this.io = new IOConsole();
	        this.comando = new ComandoPosa();
	        this.comando.setIo(io);
	    }
	
	@Test
	void testComandoPosato() {
		comando.setIo(io);
	    comando.setParametro("lanterna");
		
	    partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
		comando.esegui(partita);
	
		assertTrue(partita.getStanzaCorrente().hasAttrezzo(NOME_ATTREZZO));
	}
	
}
