package collections;

import java.util.PriorityQueue;

public class Queueinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq =  new PriorityQueue();
pq.add(1);
pq.add(2);
pq.add(3);
pq.add(4);
System.out.println(pq);
System.out.println(pq.peek()); 
pq.poll();
System.out.println(pq);
	}

}
