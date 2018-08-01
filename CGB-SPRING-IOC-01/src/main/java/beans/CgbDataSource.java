package beans;
//
public class CgbDataSource {
	CgbDataSource (){
		System.out.println("CgbDataSource");
	}
	
	public void init(){
		System.out.println("init");
		
	}
	public void getConnection(){
		System.out.println("getConnection");
	}
	public void close(){
		System.out.println("close");
	}
	
	
	
	

}
