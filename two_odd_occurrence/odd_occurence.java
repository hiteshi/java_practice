import java.util.*;
class odd_occurence{
	private static HashMap<Integer,Integer> hm;
	public static void main(String args[]){

		hm = new HashMap<Integer,Integer>();

		int[] inputArray = {11,11,4,5,27,27,27,27};
		int size = inputArray.length;

		for(int i=0;i<size;i++){
			handleMap(inputArray[i],i);
		}

		for(Integer i:hm.keySet()){
			System.out.println(i+" : "+(hm.get(i)+1));
		}
	}

	public static void handleMap(int key, int position){
		
		if(hm.containsKey(key)){
			hm.remove(key);
		}else{
			hm.put(key,position);
		}
	}
}