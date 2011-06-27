package OutofMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * add -Xmx12m -XX:+HeapDumpOnOutOfMemoryError to JVM parameters
 * 
 * @author zluo
 *
 */
public class HeapTest {
    
	List<String> list = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		HeapTest heap = new HeapTest();
		heap.testHeap();
	}
	
	public void testHeap()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true)
		{
//            try {
////        		Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(list.size());
			list.add("soon get out of memory error");
		}
		
	}
}
