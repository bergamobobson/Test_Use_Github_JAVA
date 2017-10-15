
public class Counter {
	
	private static int counter=0;
	private int number;
	private static int test;
	
	public Counter() {
		counter++; //incrementa il contatatore ogni volta che venga instanziato un ogetto
		setNumber(counter);
		
	}

	public static void testStatic(){
		int a=0;
		Counter c=new Counter(); // referenziamento per usare var di instanzia dichiararto fuori alrimenti erroe
		System.out.println((c.number));
		System.out.println(test);//uso var di classe senza errore
	}

	public int getNumber() {
		return number;
		
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
