
public class Main {

	public static void main(String[] args){
		
		METhread me1 = new METhread();
		METhread me2 = new METhread();
		METhread me3 = new METhread();
		METhread me4 = new METhread();
		
//		int n = 1000;
//		long startTime = System.currentTimeMillis();
//		for(int i = 0; i < n; i++){
//			MemoryEater.alloc(64);
//			//MemoryEater.alloc(i);
//		}
//		long endTime = System.currentTimeMillis();
//		
//		long duration1 = (endTime - startTime);
//		System.out.println("Czas normalnie: " + duration1 + "ms");
		
		me1.start();
		me2.start();
		me3.start();
		me4.start();
	}
	
}
