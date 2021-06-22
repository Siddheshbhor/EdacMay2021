package assignment;

import java.util.PriorityQueue;

public class Queue {

	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(23);
		pq.add(78);
		pq.add(56);
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}
