package hafta01;

class UcgeninCevresi{
	
	int sonuc;
	
	public int cevreHesapla(int kenar){
		
		sonuc=kenar+kenar+kenar;
		return sonuc;
		
	}
	
	public int cevreHesapla(int kenar1,int kenar2){
		
		sonuc=kenar1+kenar1+kenar2;
		return sonuc;
		
	}
	
	public int cevreHesapla(int kenar1,int kenar2,int kenar3){
		
		sonuc=kenar1+kenar2+kenar3;
		return sonuc;

	}
	
	public void doYazdir(){
		
		System.out.println("Ücgenin Cevresi:"+sonuc);
		
	}
	
}

public class ornek09 {

	public static void main(String[] args) {
		
		UcgeninCevresi cevre1=new UcgeninCevresi();
		cevre1.cevreHesapla(5);
		cevre1.doYazdir();
		cevre1.cevreHesapla(5, 4);
		cevre1.doYazdir();
		cevre1.cevreHesapla(3, 2, 4);
		cevre1.doYazdir();

	}

}
