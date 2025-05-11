package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.giocatore.Giocatore;
import it.uniroma3.diadia.Partita;

class GiocatoreTest {
	
	private Giocatore giocatore;
	

	@BeforeEach
	void setUp()throws Exception{
		
		this.giocatore = new Giocatore();
	}
	
	
	@Test
	public void testCfuNonFinitiInizioPartita() {
		assertNotEquals(0, this.giocatore.getCfu());
	}
	
	
	@Test
	
	public void testCfuIniziali() {
		assertEquals(Giocatore.CFU_INIZIALI, this.giocatore.getCfu());
	}
	
}
