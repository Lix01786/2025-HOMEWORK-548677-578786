package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

class BorsaTest {

	private static final String ATTREZZO = "attrezzoGenerico";
	private Borsa borsa;
	private static final int PESO_MAX_BORSA = 20;
	
	@BeforeEach
	void setUp()throws Exception{
		this.borsa = new Borsa(PESO_MAX_BORSA);
	}
	
	
	@Test
	public void testAddAttrezzoSingolo() {
		Attrezzo attrezzo = creaAttrezzoEAggiungiBorsa(this.borsa, ATTREZZO, 1);
		assertEquals(attrezzo, this.borsa.getAttrezzo(ATTREZZO));
	}
    
	
	private Attrezzo creaAttrezzoEAggiungiBorsa(Borsa borsa, String nomeAttrezzo, int i) {
		int peso = 0;
		Attrezzo attrezzo = new Attrezzo(nomeAttrezzo, peso);
		borsa.addAttrezzo(attrezzo);
		return attrezzo;
	}


	@Test
	public void testAddAttrezzoTroppoPesante() {
		Attrezzo attrezzoPesante = new Attrezzo("attrezzoPesante", PESO_MAX_BORSA+1);
		assertFalse(this.borsa.addAttrezzo(attrezzoPesante)); 
	}
	

	@Test
	public void testGetAttrezzoBorsaVuota() {
		
		assertNull(this.borsa.getAttrezzo(ATTREZZO)); 
	}
	
	
	@Test
	public void testGetAttrezzoInesistente() {
		creaAttrezzoEAggiungiBorsa(this.borsa, ATTREZZO, 1);
		assertNull(this.borsa.getAttrezzo("inesistente")); 
	}
	
	
}
