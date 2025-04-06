package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaTest {
	private Stanza stanza;

	private Attrezzo spada;
	
	@BeforeEach
	void setUp() throws Exception {
		this.stanza = new Stanza("n11");
		this.spada = new Attrezzo("spada", 10);
	}

	
	
	@Test
	void testHasAttrezzoStanzaVuota() {
		assertFalse(this.stanza.hasAttrezzo("spada"));
	}
	
	@Test
	void testHasAttrezzo() {
		assertFalse(this.stanza.hasAttrezzo("spada"));
		this.stanza.addAttrezzo(this.spada);
		assertTrue(this.stanza.hasAttrezzo("spada"));
		
	
	}
	
	@Test
	void testRemoveAttrezzo() {
		assertFalse(this.stanza.hasAttrezzo("spada"));
		this.stanza.addAttrezzo(this.spada);
		assertTrue(this.stanza.hasAttrezzo("spada"));
		assertTrue(this.stanza.removeAttrezzo(spada));
		
	}
	
	
	
	
	
}
