
public class METhreadInTime extends Thread{
	@Override
	public void run(){
		
		int n = 0;
		long startTime = System.currentTimeMillis();
		
		for(long endTime = System.currentTimeMillis(); endTime - startTime < 60000; endTime = System.currentTimeMillis()){
			MemoryEater.alloc(64);
			n++;
		}
		
		System.out.println("W ci¹gu minuty wykonano " + n + " alokacji");
	}
}
