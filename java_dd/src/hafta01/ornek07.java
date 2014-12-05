package hafta01;

class DortIslem5{
	
	int sayi;
	public void setSayi(int sayi){
		
		this.sayi=sayi;
	}
	
	public int getSayi(){
		
		return sayi;	
	}
	
}

public class ornek07 {

	public static void main(String[] args) {
		
		DortIslem5 islem1=new DortIslem5();
		islem1.setSayi(50);
		
		//int sayi=islem1.getSayi(); asagida yazmadan yukarýdada belirtebiliriz..
		//asagida sadece sayi belirtiriz ("girdiðimiz sayi:"+sayi)
		
		System.out.println("Girdiðimiz Sayi:"+islem1.getSayi());
		
		
	}

}
