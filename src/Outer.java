
public class Outer {
	
	private String messaggio="Nella classe";
	
	private void stampaMessaggio(){
		System.out.println(messaggio+"Esterna");
	}
	
	public class Inner{
		
		public void metofo(){
			System.out.println(messaggio+"interna");
		}
		public void chiamaMetodo(){
			stampaMessaggio();
		}
	
	}
	}

