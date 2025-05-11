package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.IOSimulator;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.ComandoFine;
import it.uniroma3.diadia.comandi.ComandoVai;
import Fixture.Fixture;

class ComandoVaiTest {
	
	private String direzione1=null;
	ComandoVai comando=new ComandoVai();
	

	@Test
	void testDirezioneNulla() {
		Partita partita= new Partita();
		IOConsole io=new IOConsole();
		comando.setIo(io);
		comando.setParametro(null);
		comando.esegui(partita);
		
		assertNull(comando.getParametro());
	}
	
	@Test
	void testDirezioneNord() {
		Partita partita= new Partita();
		IOConsole io=new IOConsole();
		comando.setIo(io);
		comando.setParametro("nord");
		comando.esegui(partita);
		
		//assertNotNull(comando.getParametro());
		
		String d="nord";
		assertTrue(comando.getParametro()==d);
	}
	
	@Test
	public void testPartitaConComandoVai() {
		String[] comandiDaEseguire= {"vai sud", "fine"};
		IOSimulator io=Fixture.creaSimulazionePartitaEGioca(comandiDaEseguire);
		assertTrue(io.hasNextMessaggio());
		assertEquals(DiaDia.MESSAGGIO_BENVENUTO, io.nextMessaggio());
		assertTrue(io.hasNextMessaggio());
		assertTrue(io.nextMessaggio().contains("Aula N10"));
        assertTrue(io.hasNextMessaggio());
        assertEquals(ComandoFine.MESSAGGIO_FINE, io.nextMessaggio());
	}

}
