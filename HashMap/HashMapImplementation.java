package HashMap;
import java.util.*;

public class HashMapImplementation {
	
	public static class HashMap<K,V> //generic types
	{
		private class Node{
			K key;
			V value;
			
			Node(K key, V value)
			{
				this.key = key;
				this.value = value;
			}
		}
		
		private int n;	//nodes 
		private int N;	// N buckets(array size)
		
		private LinkedList<Node> buckets[]; //arr buckets[] of type LinkedList
		
		@SuppressWarnings("unchecked")
		public HashMap() {
			this.N = 4;
			
			this.buckets = new LinkedList[4];
			
			//creating empty ll at each index of array.
			for(int i=0; i<4; i++)
			{
				this.buckets[i] = new LinkedList<>();
			}
		}
		
		public int hashFunction(K key)
		{
			int bi = key.hashCode();
			
			return Math.abs(bi) % N;
		}
		
		public int searchInLL(K key, int bi)
		{
			return -1;
		}
		
		public void rehash() {
			
		}
		
		public void put(K key, V value)
		{
			int bi = hashFunction(key);	//bucket index
			
			int di = searchInLL( key, bi); //data index of node.
			
			if(di == -1)
			{
				//key doesn't exist, make a new key value pair -> Node in LinkedList.
				buckets[bi].add(new Node(key,value));
				n++;  //increase size of the bucket.
			}else {
				//just update the value
				Node node = buckets[bi].get(di);
				node.value = value;
			}
			
			double lambda = (double) n/N;
			if(lambda > 2.0)
			{
				rehash();
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
