package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;

class LabirintoTest {

	

	private Labirinto labirinto;
	
	@BeforeEach
	void setUp()throws Exception{
		
		this.labirinto = new Labirinto();
	}
	
	
	@Test
	public void testGetStanzaIniziale() {
		assertNotNull(this.labirinto.getStanzaIniziale());
	}
	
	
	@Test
	
	public void testGetStanzaVincente() {
		assertNotNull(this.labirinto.getStanzaVincente());
	}
	
	
	
}
