package sk.richard.uloha10;

public class MnozinaDatTester {

	public static void main(String[] args) {
		
		class MeracObdlznikov implements Merac 
        {
            public double zmeraj(Object objekt) 
            {
                Obdlznik obdlznik = (Obdlznik) objekt;
                double plocha = obdlznik.getSirka() * obdlznik.getVyska();
                return plocha;
            }
        }
		
		 Merac meracObdlznikov = new MeracObdlznikov();
		MnozinaDat obdlzniky = new MnozinaDat(meracObdlznikov);
		
	
		
        obdlzniky.pridaj(new Obdlznik(10, 10));
        obdlzniky.pridaj(new Obdlznik(20, 20));
        obdlzniky.pridaj(new Obdlznik(30, 30));
        
        System.out.println( "Priemerna plocha obdlznika: " + obdlzniky.getPriemer());
        System.out.println("Ocakavana hodnota: 466.66");
        
        Object maxObdlznik = obdlzniky.getMaximum();
        System.out.println("Obdlznik s max plochou: " + meracObdlznikov.zmeraj(maxObdlznik));
        System.out.println("Ocakavana hodnota: 900");
      
        
       
        MeracBankovychUctov meracBA = new MeracBankovychUctov();
        MnozinaDat bankoveUcty = new MnozinaDat(meracBA);
      
        bankoveUcty.pridaj(new BankovyUcet(0));
        bankoveUcty.pridaj(new BankovyUcet(10000));
        bankoveUcty.pridaj(new BankovyUcet(2000));
      
        System.out.println(bankoveUcty.getPriemer());
        
        System.out.println("Ocakavana hodnota: 4000");
        System.out.println(bankoveUcty.getMaximum());
        System.out.println(bankoveUcty.getMinimum());


}
	
	
}
