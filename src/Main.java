
public class Main {

	public static void main(String[] args){
		
		int n = 1000;
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++){
			MemoryEater.alloc(64);
			//MemoryEater.alloc(i);
		}
		long endTime = System.currentTimeMillis();
		
		long duration1 = (endTime - startTime);
		System.out.println(duration1);
	}
	
}
