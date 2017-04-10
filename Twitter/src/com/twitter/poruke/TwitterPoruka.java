package com.twitter.poruke;
/**
 * 
 * 
 * Klasa TwitterPoruka ima atribute: String korisnik i String poruka
 * @version 1.0
 *@author Aleksandra Rakic
 */
public class TwitterPoruka {
/**
 * Atribut korisnik je privatan i predstavlja String koji oznacava ime osobe koja salje poruku
 */
	private String korisnik;
	/**
	 * Atribut poruka je privatan i predstavlja String koji predstavlja tekst poruke 
	 */
	private String poruka;
	/**
	 * Metoda koja vraca atribut korisnik
	 * @return String korisnik
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * Metoda koja postavlja vrednost atribura korisnik
	 * @param korisnik  String koji ne sme biti null ili prazan String 
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.isEmpty())
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * Metoda koja vraca String "poruka"
	 * @return String "poruka"
	 */
	public String getPoruka() {
	return poruka;
	}
	/**
	 * Metoda koja postavlja vrednost atributa poruka
	 * @param poruka String koji ne sme biti null, prazan String ili vece duzine od 140
	 * @throws RuntimeException ukoliko nisu ispostovana pravila za vrednost parametra poruka
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka =="" ||
	poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * redefinisana metoda toString
	 * @return String sa atributima korisnik+poruka
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
	
}
