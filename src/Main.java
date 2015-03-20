
public class Main {

	public static void main(String[] args){
		
		//Mierzenie czasu dla konkretnej iloœci powtórzeñ
//		METhread me1 = new METhread();
//		METhread me2 = new METhread();
//		METhread me3 = new METhread();
//		METhread me4 = new METhread();
//		
//		me1.start();
//		me2.start();
//		me3.start();
//		me4.start();
		
		//Mierzenie iloœci powtórzeñ w konkretnym czasie
		METhreadInTime met1 = new METhreadInTime();
		METhreadInTime met2 = new METhreadInTime();
		METhreadInTime met3 = new METhreadInTime();
		METhreadInTime met4 = new METhreadInTime();
		
		met1.start();
		met2.start();
		met3.start();
		met4.start();
	}
	
}
