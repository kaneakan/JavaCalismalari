package hafta01;

class IlkMesaj{
	
	public void doMesaj(){
		
		System.out.println("bu metot ile ekrana mesaj yazdiriyoruz..");
		
	}
	
}

public class ornek04 {

	public static void main(String[] args) {
		
		IlkMesaj mesaj1=new IlkMesaj();
		mesaj1.doMesaj();
		
		IlkMesaj mesaj2=new IlkMesaj();
		mesaj2.doMesaj();

	}

}
