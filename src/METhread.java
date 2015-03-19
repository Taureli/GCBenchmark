
public class METhread extends Thread{
	@Override
	public void run(){
		
		int n = 50;
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++){
			MemoryEater.alloc(i);
			//MemoryEater.alloc(i);
		}
		long endTime = System.currentTimeMillis();
		
		long duration1 = (endTime - startTime);
		System.out.println("Czas na w¹tku: " + duration1 + "ms");
	}
}
