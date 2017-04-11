package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	
	Twitter tt;

	@Before
	public void setUp() throws Exception {
		 tt= new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		tt=null;
	}

	@Test
	public void testVratiSvePoruke() {
		TwitterPoruka nova= new TwitterPoruka();
		nova.setKorisnik("Sasa");
		nova.setPoruka("poruka1");
	tt.unesi("Sasa", "poruka1");
	LinkedList<TwitterPoruka> poruke= tt.vratiSvePoruke();
	assertFalse(nova.getKorisnik().equals(poruke.get(0).getKorisnik()) && nova.getPoruka().equals(poruke.get(0).getPoruka()));
	
	
	
	
	}

	@Test
	public void testUnesi() {
		TwitterPoruka nova= new TwitterPoruka();
		nova.setKorisnik("Sasa");
		nova.setPoruka("poruka1");
	tt.unesi("Sasa", "poruka1");
	LinkedList<TwitterPoruka> poruke= tt.vratiSvePoruke();
	assertFalse(nova.getKorisnik().equals(poruke.get(0).getKorisnik()) && nova.getPoruka().equals(poruke.get(0).getPoruka()));
	
		
	}

	@Test (expected= java.lang.RuntimeException.class)
	public void testVratiPoruke() {
		TwitterPoruka[] tp= tt.vratiPoruke(2, null);
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testVratiPoruke1() {
		TwitterPoruka[] tp= tt.vratiPoruke(2, "");
	}
	
	@Test 
	public void testVratiPoruke2() {
		tt.unesi("korisnik1", "poruka broj1 ");
		tt.unesi("korisnik2", "poruka broj2");
		tt.unesi("korisnik3", "poruka broj3");
		TwitterPoruka[] rezultat= tt.vratiPoruke(2, "poruka");
		assertFalse(rezultat[0].getKorisnik().equals("korisnik1") && rezultat[0].getPoruka().equals("poruka broj1") && rezultat[1].getKorisnik().equals("korisnik2") && rezultat[0].getPoruka().equals("poruka broj2") && rezultat[2].getKorisnik().equals("korisnik3") && rezultat[0].getPoruka().equals("poruka broj3"));
		
		
	}

}
