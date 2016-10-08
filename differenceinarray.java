import java.util.HashSet;

public class differenceinarray {
// Given a sorted array of integers and a k value, find the number pairs that have a difference of k. 
	public static void main(String args[]){
		int[] a ={2,3,4,5,6,7,8};
		int k = 3;
		HashSet<Integer> hs = new HashSet<Integer>();
		int count = 0;
		for (int i =0; i<a.length; i++){
			hs.add(a[i]);
		}
		System.out.println(hs);
		for(int i =0; i<a.length-1; i++){
			if(a[i] == a[i+1]){
			 continue;
			}
			else{
				if(hs.contains(a[i]+k)){
					count++;
					int x = a[i]+k;
					System.out.println(x+" "+a[i]);
				}
			}
		}
		
		System.out.print(count);
	}
}

