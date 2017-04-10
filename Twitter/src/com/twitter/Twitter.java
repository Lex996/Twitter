package com.twitter;


	import java.util.LinkedList;
	import com.twitter.poruke.TwitterPoruka;
	
	
	/**
	 * Klasa Twitter ima atribut poruke i metode vratiSvePoruke, unesi i vratiPoruke
	 * @version 1.0
	 * @author Aleksandra Rakic
	 *
	 */
	public class Twitter {
		
	/**
	 * Atribut poruke koji predstavlja LinkedList<TwitterPoruka>
	 */
	private LinkedList<TwitterPoruka> poruke =
	new LinkedList<TwitterPoruka>();
	
	/**
	 * Metoda koja vraca listu svih poruka
	 * @return  LinkedList<TwitterPoruka>
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
	return poruke;
	}
	
	/**
	 * Metoda koja kreira novi objekat TwitterPoruka i postavlja vrednosti njegovih atributa(korisnik, poruka). Pourka se unosi u listu poruka.
	 * @param korisnik String koji predstavlja vrednost atributa korisnik koja se postavlja
	 * @param poruka String koji predstavlja vrednost atributa poruka koja se postavlja
	 */
	public void unesi(String korisnik, String poruka) {
	//Pravi se nova poruka i puni podacima.
	TwitterPoruka tp = new TwitterPoruka();
	tp.setKorisnik("korisnik");
	tp.setPoruka(poruka);
	//Poruka se unosi u listu na kraj
	poruke.addLast(tp);
	}
	
	/**
	 * Metoda koja kreira i vraca niz poruka koje sadrze trazeni tag
	 * @param maxBroj int koji oznacava maksimalan broj poruka u nizu 
	 * @param tag String predstavlja trazeni tag u poruci
	 * @return TwitterPoruka[] niz poruka koje sadrze trazeni tag
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
	if (tag==null || tag.isEmpty())
	throw new RuntimeException("Morate uneti tag");
	//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
	if (maxBroj<=0)
	maxBroj = 100;
	 //Pomocna promenljiva koja predstavlja brojac upisanih poruka
	int brojac = 0;
	//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
	//sve poruke koje u sebi imaju zadati tag
	TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
	//Pretrazuju se poruke i traze se one koje sadrze tag.
	//Ako se nadje neka takva, i ako nije prekoracen maxBroj
	//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
	//se prekida.
	for (int i = 0; i < poruke.size(); i++)
	if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
	if (brojac < maxBroj){
	rezultat[brojac+1]=poruke.get(i);
	brojac++;
	}
	else break;
	return rezultat;
	}
}
