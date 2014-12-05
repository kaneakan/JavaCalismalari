package hafta01;

class VeriTabaniSec{
	
	String veriTabaniAdi;
	
	public void setVeriTabani(String veriTabaniAdi){
		
	this.veriTabaniAdi=veriTabaniAdi;
		
	}
	
	public String getVeriTabaniAdi(){
		
		return veriTabaniAdi;
		
	}
	
	
	public void doYazdir(){
		
		System.out.println("VeriTabani:"+veriTabaniAdi);
		
	}
	
}


public class ornek10 {

	public static void main(String[] args) {
	
		VeriTabaniSec veriTabani1=new VeriTabaniSec();
		
		veriTabani1.setVeriTabani("SQL Server");
		veriTabani1.doYazdir();
		
		veriTabani1.setVeriTabani("Oracle");
		veriTabani1.doYazdir();
		
		
	}

}
