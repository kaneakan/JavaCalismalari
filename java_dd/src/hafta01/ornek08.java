package hafta01;

class KareAl{
	
	int sayi;
	
	public void setSayi(int sayi){
		
		this.sayi=sayi;
		
	}
	
	public int getSayi(){
		
		return sayi;
		
	}
	
	public int doHesapla(){
		
		return sayi*sayi;
		
	}
	
	public void doYazdir(){
		
		System.out.println("Girdiðiniz Sayi:"+getSayi());
		System.out.println("Alaný:"+doHesapla());
		
	}
}

public class ornek08 {

	public static void main(String[] args) {
		
		KareAl karesi=new KareAl();
		karesi.setSayi(5);
		karesi.doYazdir();

	}

}
