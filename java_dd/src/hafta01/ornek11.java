package hafta01;

import java.util.Scanner;



class Cinsiyet{
	
	String cinsiyet;
	public void setCinsiyet(String Cinsiyet){
		
		this.cinsiyet=Cinsiyet;
		
	}
	
	public String getCinsiyet(){
		
		return cinsiyet;
		
	}
	
	public void doYazdir(){
		
		System.out.println("Cinsiyet:"+cinsiyet);
		
	}
	
}

public class ornek11 {

	public static void main(String[] args) {
		
		Cinsiyet cinsiyet1=new Cinsiyet();
		cinsiyet1.setCinsiyet("Bay");
		cinsiyet1.doYazdir();
		
		
		System.out.println("Cinsiyet Giriniz:");
		Scanner input=new Scanner(System.in);
		String cinsiyet=input.next();
		Cinsiyet cinsiyet2=new Cinsiyet();
		cinsiyet2.setCinsiyet(cinsiyet);
		cinsiyet2.doYazdir();
		
		
		

	}

}
