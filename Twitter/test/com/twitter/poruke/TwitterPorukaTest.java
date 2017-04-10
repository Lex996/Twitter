package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {
	private TwitterPoruka tp;

	@Before
	public void setUp() throws Exception {
		 tp= new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
	tp=null;
		
	}

	@Test
	public void testSetKorisnik() {
		String korisnik="Sasa";
	
	 tp.setKorisnik(korisnik);
	 assertEquals("Sasa", tp.getKorisnik());
		
	}
	@Test(expected =  java.lang.RuntimeException.class)
	public void testSetKorisnik1 () {
		String korisnik="";
	
	 tp.setKorisnik(korisnik);
	 
		
	}
	@Test(expected =  java.lang.RuntimeException.class)
	public void testSetKorisnik2 () {
		String korisnik=null;
	
	 tp.setKorisnik(korisnik);
	 
		
	}

	@Test
	public void testSetPoruka() {
		
		String poruka="poruka1";
		tp.setPoruka(poruka);
		assertEquals("poruka1",tp.getPoruka());
	}
	
	@Test (expected =  java.lang.RuntimeException.class)
	public void testSetPoruka1() {
		
		String poruka="";
		tp.setPoruka(poruka);
		
	}
	@Test (expected =  java.lang.RuntimeException.class)
	public void testSetPoruka2() {
		
		String poruka=null;
		tp.setPoruka(poruka);
		
	}
	@Test (expected =  java.lang.RuntimeException.class)
	public void testSetPoruka3() {
		
		String poruka="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		tp.setPoruka(poruka);
		
	}
	
	


	@Test
	public void testToString() {
		tp.setKorisnik("Sasa");
		tp.setPoruka("prva poruka");
		String test= tp.toString();
		assertEquals("KORISNIK:"+ "Sasa"+"PORUKA"+"prva poruka", test);
	}

}
