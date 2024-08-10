package OOPs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Consumer{
	
	String name;
	Long age;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class Java_8_Practice_Topics {
	
	public static void main(String args[]) {
		
		
//		List<Integer> arrList = Arrays.asList(1, 3, 12, 45, 67, 19, 75, 34, 90);
//		Map<Integer, String> hmashMap = new HashMap<Integer, String>();
//		hmashMap.put(1, "ab");
//		hmashMap.put(2, "bc");
//		hmashMap.put(3, "cd");
//		hmashMap.put(4, "de");
//		hmashMap.put(5, "fg");
//		hmashMap.put(6, "hi");
//		hmashMap.put(7, "jk");
//		
	    Integer n = 10;
		Runnable runnable = ()->{
			
			Integer n1 = n;
			n1++;
			System.out.println(n1);
			
		};
		new Thread(runnable).start();
		
		
	

}
}
