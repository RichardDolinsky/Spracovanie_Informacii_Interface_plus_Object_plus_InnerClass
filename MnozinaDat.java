package sk.richard.uloha10;

public class MnozinaDat {
	private Object maximum;
	private Object minimum;
	private int pocetPrvkov;
	private double sucet;
	private double obsah;
	private Merac merac;
	
	public MnozinaDat(Merac merac) {
		this.merac=merac;
	}
	
	public void pridaj(Object prvok) {
		if(pocetPrvkov == 0 || merac.zmeraj(prvok) > merac.zmeraj(maximum) ) {
			
			maximum=prvok;
		
			
		}
		if(pocetPrvkov==0 || merac.zmeraj(prvok) < merac.zmeraj(maximum) ) {
			minimum=prvok;
		}
		pocetPrvkov++;
		
		sucet += merac.zmeraj(prvok);
		
		
	}
	
	public Object getMinimum() {
		return minimum;
		
	}
	
	public Object getMaximum() {
		
		return maximum;
	}
	
	public double getPriemer() {
		if(pocetPrvkov==0) {
			return 0;
		}
		return sucet / pocetPrvkov;
	}
	public Object getMieraMax() {
		return maximum.toString();
	}
	public Object getMieraMin() {
		return minimum.toString();
	}
}


