package hafta01;

class DortIslem4{
	
	int sayi1;
	int sayi2;
	public void setSayi(int sayi1,int sayi2){
		
		// disarida ki degeri this ile belirtiriz ve içerideki sayýlarla eþitleriz..
		// setSayi içindeki sayýlar orada biter dýþarýda kullanamayýz..
		// yukarý int deðerinde tanýmladýðýmýz sayi içerideki degiskenlere atayarak kullandýk.
		
		this.sayi1=sayi1;
		this.sayi2=sayi2;
	}
	
	public void doYazdir(){
		
		System.out.println("Birinci Sayi:"+sayi1);
		System.out.println("Ýkinci Sayi:"+sayi2);
		
		
	}
	
}

public class ornek06 {

	public static void main(String[] args) {
		
		DortIslem4 dortIslem1=new DortIslem4();
		dortIslem1.setSayi(20, 15);
		dortIslem1.doYazdir();
		

	}

}
