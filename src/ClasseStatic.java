
public abstract  class ClasseStatic {
	
	/*
	 * Un metodo dichiarato statico come nel caso del main non puo usare
	 * VARIABILE DI CLASSE SENZA REFERENZIARLA Puo usare VARIABILE DI CLASSE(dichiarate
	 * statiche) senza referenziarle
	 */
	
	private static int a = 10; 
	public ClasseStatic()     {  
		a += 10;    
		System.out.println("Costruttore");
		}  
	{
		   System.out.println("Iniziallizatore"); //eseguito durante il carricamento in memoria
		}

	static   
	{  
			System.out.println("valore statico = " + a); //eseguito durante il car in memoria prima dell inizializzatore
	} 
	
	/*
	 * visto che questa classe contiene un solo(BASTA ALMENO) metodo astratto
	 * DEVE essere dichiara astratta ma una classe astratta non è obligata di contenere 
	 * metodi astratti
	 * 
	 * Ma è obligata di essere ereditata e i metodi astratti overridi
	 * se erediti una classe astratti sei obligato di ovveride i suoi metodi astratti
	 */
	public abstract void decelera(); // non obligatorio
	
	
	
}
