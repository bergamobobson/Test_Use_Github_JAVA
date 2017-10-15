/**
 * 
 * @author BergamoBobson
 *Interfacee ha tutti metodi astratti e le varibile public static final
 *visto che si sa che tutte le var sono public static final sulle variabili
 *e public(o defautl o strcfp) abstract sui metodi non siamo obligati di metterli 
 *
 *un interfaccia per essere usata ha bisogno di essere estesa da una classe
 * xke non possono essere instanziata(vanno implementi nelle classe che le estendono)
 */
public interface TestInterface {
	
	public static final int b=0;
	
	public abstract void decelera();
     

     void accelera();
     void frena();


}
