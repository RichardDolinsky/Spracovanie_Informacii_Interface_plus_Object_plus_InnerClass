package sk.richard.uloha10;

public class MeracBankovychUctov implements Merac{
	
	public double zmeraj(Object objekt) {
		if(objekt instanceof BankovyUcet) {
			BankovyUcet ucet = (BankovyUcet) objekt;
			return ucet.getZostatok();
		}
		return -1;
	}

}
